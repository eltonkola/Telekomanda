package com.eltonkola.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.eltonkola.TVRemoteViewModel
import com.eltonkola.ui.icons.iconTv

@Composable
fun ScanScreenUi(
    viewModel: TVRemoteViewModel
) {

    val devices by viewModel.devices.collectAsStateWithLifecycle()
    val isScanning by viewModel.isScanning.collectAsStateWithLifecycle()

    Box(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        contentAlignment = Alignment.Center
    ){

        if(isScanning){
            CircularProgressIndicator()
        }else if(devices.isEmpty()){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "No devices found",
                    style = MaterialTheme.typography.headlineSmall,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Make sure you have connected to one or more adb devices!",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = { viewModel.scanDevices() },
                    enabled = true
                ) {
                    Text("Scan")
                }
            }

        }else{
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                item{
                    Text(
                        text = "Select a device",
                        style = MaterialTheme.typography.headlineSmall
                    )
                    Spacer( modifier = Modifier.height(8.dp))
                }

                items(devices) { device ->
                    ListItem(
                        modifier = Modifier.clickable {
                            viewModel.selectDevice(device)
                        },
                        headlineContent = { Text(text = device) },
                        leadingContent = {
                            Icon(
                                imageVector = iconTv,
                                contentDescription = "Tv"
                            )
                        }
                    )
                }
            }
        }
    }

}