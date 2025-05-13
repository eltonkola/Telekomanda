package com.eltonkola

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.eltonkola.ui.AppWindow

fun main() = application {

    val windowState = rememberWindowState(
        width = 400.dp,
        height = 480.dp,
        isMinimized = false,
    )

    val systemDark  = isSystemInDarkTheme()

    var pinned by remember { mutableStateOf(false) }
    var dark by remember { mutableStateOf(systemDark) }

    Window(
        //resizable = false,
        undecorated = true,
        transparent = true,
        state = windowState,
        onCloseRequest = ::exitApplication,
        alwaysOnTop = pinned,
        title = "Telekomanda",
    ) {
        MaterialTheme {
            AppWindow(
                onCloseRequest = ::exitApplication,
                viewModel = TVRemoteViewModel,
                onPin = {
                    pinned = !pinned
                },
                pinned = pinned,
                dark = dark,
                onTheme = {
                    dark = !dark
                },
                windowScope = this
            )
        }
    }

}



