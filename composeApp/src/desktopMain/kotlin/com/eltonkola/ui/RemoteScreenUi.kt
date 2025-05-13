package com.eltonkola.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.eltonkola.AppScreen
import com.eltonkola.TVRemoteViewModel
import com.eltonkola.TVRemoteViewModel.selectedDevice
import com.eltonkola.components.CircleButton
import com.eltonkola.components.DirectionButton
import com.eltonkola.components.PressableIcon
import com.eltonkola.components.RoundedButton
import com.eltonkola.ui.icons.iconCircle
import com.eltonkola.ui.icons.iconMenu
import com.eltonkola.ui.icons.iconOffOn
import com.eltonkola.ui.icons.iconSettings
import iconArrowDown
import iconArrowLeft
import iconArrowRight
import iconArrowUp

@Composable
fun RemoteScreenUi(
    viewModel: TVRemoteViewModel
) {
    Box(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        contentAlignment = Alignment.Center
    ) {

        val selectedDevice by viewModel.selectedDevice.collectAsStateWithLifecycle()
        val isPowerOn = remember { mutableStateOf(true) }


        if(selectedDevice == null) {
            TextButton(onClick = { viewModel.setScreen(AppScreen.Scan) }) {
                Text("Select a device first!")
            }
        }else{

            Row(
                modifier = Modifier.fillMaxWidth().align(TopCenter),
            ) {

                Spacer(modifier = Modifier.weight(1f))
                CircleButton(
                    icon = iconOffOn,
                    size = 34.dp,
                    // text = if (isPowerOn.value) "OFF" else "ON",
                    backgroundColor = if (isPowerOn.value) Color.Red else Color.Green,
                    onClick = {
                        isPowerOn.value = !isPowerOn.value
                        viewModel.sendKeyEvent("KEYCODE_POWER")
                    },
                    enabled = true
                )
                Spacer(modifier = Modifier.weight(1f))
            }

            Spacer(modifier = Modifier.size(18.dp))

            val roundSize = 12.dp

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.scale(1.2f)
                ) {
                    // Up button

                    Row {


                        DirectionButton(
                            icon = iconSettings,
                            backgroundColor = Color(0xFF2196F3),
                            onClick = { viewModel.sendKeyEvent("KEYCODE_SETTINGS") },
                        )

                        Spacer(modifier = Modifier.size(8.dp))

                        Row(
                            modifier = Modifier.clip(
                                RoundedCornerShape(
                                    topStart = roundSize,
                                    topEnd = roundSize,
                                    bottomEnd = 0.dp,
                                    bottomStart = 0.dp
                                )
                            ).background(Color.Gray).padding(4.dp),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            DirectionButton(
                                icon = iconArrowUp,
                                backgroundColor = Color(0xFF666666),
                                onClick = { viewModel.sendKeyEvent("KEYCODE_DPAD_UP") },
                            )
                        }

                        Spacer(modifier = Modifier.size(8.dp))

                        DirectionButton(
                            icon = iconMenu,
                            backgroundColor = Color(0xFF2196F3),
                            onClick = { viewModel.sendKeyEvent("KEYCODE_MENU") },
                        )

                    }


                    // Left, OK, Right
                    Row(
                        modifier = Modifier.clip(RoundedCornerShape(roundSize)).background(Color.Gray)
                            .padding(4.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        DirectionButton(
                            icon = iconArrowLeft,
                            backgroundColor = Color(0xFF666666),
                            onClick = { viewModel.sendKeyEvent("KEYCODE_DPAD_LEFT") },
                        )

                        Spacer(modifier = Modifier.width(4.dp))
                        PressableIcon(
                            icon = iconCircle,
                            contentDescription = "Ok",
                            onPress = {
                                viewModel.sendKeyEvent("KEYCODE_DPAD_CENTER")
                            },
                            onLongPress = {
                                viewModel.sendKeyEvent("--longpress KEYCODE_DPAD_CENTER")
                            }
                        )
                        Spacer(modifier = Modifier.width(4.dp))

                        DirectionButton(
                            icon = iconArrowRight,
                            backgroundColor = Color(0xFF666666),
                            onClick = { viewModel.sendKeyEvent("KEYCODE_DPAD_RIGHT") },
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.Bottom
                    ) {
                        DirectionButton(
                            icon = Icons.Default.ArrowBack,
                            backgroundColor = Color(0xFF2196F3),
                            onClick = { viewModel.sendKeyEvent("KEYCODE_BACK") },
                        )

                        Spacer(modifier = Modifier.size(8.dp))
                        // Down button
                        Row(
                            modifier = Modifier.clip(
                                RoundedCornerShape(
                                    topStart = 0.dp,
                                    topEnd = 0.dp,
                                    bottomEnd = roundSize,
                                    bottomStart = roundSize
                                )
                            ).background(Color.Gray).padding(4.dp),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            DirectionButton(
                                icon = iconArrowDown,
                                backgroundColor = Color(0xFF666666),
                                onClick = { viewModel.sendKeyEvent("KEYCODE_DPAD_DOWN") },
                            )
                        }

                        Spacer(modifier = Modifier.size(8.dp))
                        DirectionButton(
                            icon =  Icons.Default.Home,
                            backgroundColor = Color(0xFF2196F3),
                            onClick = { viewModel.sendKeyEvent("KEYCODE_HOME") },
                        )
                    }
                }





        }

    }


}