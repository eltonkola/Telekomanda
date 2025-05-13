package com.eltonkola

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.concurrent.TimeUnit

sealed class AdbResult {
    data class Success(val output: String? = null) : AdbResult()
    data class Error(val message: String) : AdbResult()
}


sealed class AppScreen {
    object Scan : AppScreen()
    object Remote : AppScreen()
    object Extra : AppScreen()
}

object  TVRemoteViewModel {

    private val viewModelScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    private val _devices = MutableStateFlow<List<String>>(emptyList())
    val devices: StateFlow<List<String>> = _devices.asStateFlow()

    private val _screen = MutableStateFlow<AppScreen>(AppScreen.Scan)
    val screen: StateFlow<AppScreen> = _screen.asStateFlow()

    fun setScreen(screen: AppScreen) {
        _screen.value = screen
    }

    private val _selectedDevice = MutableStateFlow<String?>(null)
    val selectedDevice: StateFlow<String?> = _selectedDevice.asStateFlow()

    private val _isScanning = MutableStateFlow(false)
    val isScanning: StateFlow<Boolean> = _isScanning.asStateFlow()

    private val _lastError = MutableStateFlow<String?>(null)
    val lastError: StateFlow<String?> = _lastError.asStateFlow()

    init {
         scanDevices()
    }

    fun selectDevice(device: String) {
        _selectedDevice.value = device
        _screen.value = AppScreen.Remote
    }

    fun clearError() {
        _lastError.value = null
    }

    fun scanDevices() {
        if (_isScanning.value) return // Prevent concurrent scans
        _isScanning.value = true
        _lastError.value = null // Clear previous errors

        viewModelScope.launch(Dispatchers.IO) {
            println("Scanning for ADB devices...")
            val result = runAdbCommand("adb", "devices")

            val foundDevices = mutableListOf<String>()
            var errorMsg: String? = null

            when (result) {
                is AdbResult.Success -> {
                    result.output?.lines()?.forEach { line ->
                        if (line.isNotBlank() && !line.startsWith("List of devices")) {
                            val parts = line.split("\\s+".toRegex()) // Split by whitespace
                            if (parts.size >= 2 && parts[1] == "device") {
                                foundDevices.add(parts[0]) // Add the device serial
                            }
                        }
                    }
                    println("Scan successful. Found devices: $foundDevices")
                }
                is AdbResult.Error -> {
                    errorMsg = "Scan failed: ${result.message}"
                    println(errorMsg)
                }
            }

            // Update state back on the main thread (though StateFlow is thread-safe)
            withContext(Dispatchers.Main) {
                _devices.value = foundDevices.toList() // Update the list
                // Auto-select the first device if none is selected and devices were found
                if (_selectedDevice.value == null && foundDevices.isNotEmpty()) {
                    _selectedDevice.value = foundDevices.first()
                    _screen.value = AppScreen.Remote
                    println("Auto-selected device: ${foundDevices.first()}")
                } else if (_selectedDevice.value != null && !_devices.value.contains(_selectedDevice.value)) {
                    // If the currently selected device disappeared, clear selection
                    _selectedDevice.value = null
                    _screen.value = AppScreen.Scan
                    println("Selected device disconnected.")
                }
                _isScanning.value = false
                _lastError.value = errorMsg
            }
        }
    }

    fun sendKeyEvent(keyCode: String) {
        val targetDevice = _selectedDevice.value ?: run {
            _lastError.value = "No device selected to send key event."
            println("Error: No device selected.")
            return
        }

        _lastError.value = null // Clear previous errors

        viewModelScope.launch(Dispatchers.IO) {
            println("Sending $keyCode to $targetDevice")
            val command = arrayOf("adb", "-s", targetDevice, "shell", "input", "keyevent", keyCode)
            val result = runAdbCommand(*command) // Pass varargs

            withContext(Dispatchers.Main) {
                when (result) {
                    is AdbResult.Success -> {
                        println("Successfully sent $keyCode to $targetDevice.")
                        // Optionally display success feedback
                    }
                    is AdbResult.Error -> {
                        val errorMsg = "Failed to send $keyCode: ${result.message}"
                        _lastError.value = errorMsg
                        println(errorMsg)
                    }
                }
            }
        }
    }

    // Helper function to run ADB commands and capture output/errors
    private suspend fun runAdbCommand(vararg command: String): AdbResult {
        return withContext(Dispatchers.IO) { // Ensure execution is on IO thread
            try {
                println("Executing: ${command.joinToString(" ")}")
                val process = ProcessBuilder(*command)
                    .redirectErrorStream(true) // Combine stdout and stderr
                    .start()

                val outputReader = BufferedReader(InputStreamReader(process.inputStream))
                val output = outputReader.readText() // Read all output

                // Wait for the process to complete, but with a timeout
                val exited = process.waitFor(10, TimeUnit.SECONDS) // 10-second timeout

                if (!exited) {
                    process.destroyForcibly()
                    return@withContext AdbResult.Error("Command timed out: ${command.joinToString(" ")}")
                }

                val exitCode = process.exitValue()
                println("Command exit code: $exitCode")

                if (exitCode == 0) {
                    AdbResult.Success(output.trim())
                } else {
                    AdbResult.Error("Exit code $exitCode. Output:\n$output")
                }
            } catch (e: IOException) {
                println("IOException running command: ${e.message}")
                // Common issue: ADB not found in PATH
                if (e.message?.contains("Cannot run program \"adb\"") == true) {
                    AdbResult.Error("ADB command not found. Make sure ADB is installed and in your system's PATH.")
                } else {
                    AdbResult.Error("Failed to execute command: ${e.message}")
                }
            } catch (e: Exception) {
                println("Exception running command: ${e.message}")
                AdbResult.Error("An unexpected error occurred: ${e.message}")
            }
        }
    }
}