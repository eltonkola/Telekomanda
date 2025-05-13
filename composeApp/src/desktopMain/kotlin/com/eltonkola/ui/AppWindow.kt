package com.eltonkola.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowScope
import com.eltonkola.TVRemoteViewModel
import com.eltonkola.ui.theme.AppTheme
import androidx.compose.foundation.window.WindowDraggableArea
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.eltonkola.AppScreen
import com.eltonkola.ui.icons.iconClose
import com.eltonkola.ui.icons.iconEvent
import com.eltonkola.ui.icons.iconMenu
import com.eltonkola.ui.icons.iconPin
import com.eltonkola.ui.icons.iconPinFilled
import com.eltonkola.ui.icons.iconRemote
import iconDark
import iconLight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppWindow(
    viewModel: TVRemoteViewModel = TVRemoteViewModel,
    onCloseRequest : () -> Unit = {},
    onPin: () -> Unit = {},
    pinned: Boolean,
    windowScope: WindowScope,
    dark: Boolean,
    onTheme : () -> Unit,
) {

    val selectedDevice by viewModel.selectedDevice.collectAsStateWithLifecycle()
    val screen by viewModel.screen.collectAsStateWithLifecycle()

    val lastError by viewModel.lastError.collectAsStateWithLifecycle()

    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(lastError) {
        lastError?.let { error ->
            snackbarHostState.showSnackbar(error)
            viewModel.clearError()
        }
    }

    AppTheme(
        darkTheme = dark
    ) {

        Scaffold(
            snackbarHost = {
              SnackbarHost(
                  hostState = snackbarHostState
              )
            },
            modifier = Modifier.fillMaxSize()
                .clip(RoundedCornerShape(8.dp))
                .border(
                    BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.tertiary),
                    shape = RoundedCornerShape(8.dp)
                )
            ,
            topBar = {
                TopAppBar(

                    navigationIcon = {
                        IconButton(onClick = { viewModel.setScreen(AppScreen.Scan) }) {
                            Icon(iconMenu, "Devices")
                        }
                    },
                    modifier = Modifier,
                    title = {
                        windowScope.WindowDraggableArea(
                            modifier = Modifier
                        ){
                            Row(
                                modifier = Modifier.fillMaxWidth(1f),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(text = "Tv Remote")
                            }
                        }
                    },
                    actions = {

                        if(screen == AppScreen.Remote) {
                            IconButton(onClick = { viewModel.setScreen(AppScreen.Extra)}) {
                                Icon(iconEvent, "Extra events")
                            }
                        }else if(screen == AppScreen.Extra) {
                            IconButton(onClick = { viewModel.setScreen(AppScreen.Remote)}) {
                                Icon(iconRemote, "Remote")
                            }
                        }

                        IconButton(onClick = onPin) {
                            Icon(if(pinned) iconPinFilled else iconPin, "Always on top")
                        }

                        IconButton(onClick = onTheme) {
                            Icon(if(dark) iconDark else iconLight, "Always on top")
                        }




                        IconButton(
                           // modifier = Modifier.size(20.dp),
                            onClick = onCloseRequest,
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = Color.Red,
                                contentColor = Color.White,

                            )
                            ) {
                            Icon(
                                iconClose,
                                "Close",
                            //    modifier = Modifier.size(16.dp)
                            )
                        }
                       // Spacer(modifier = Modifier.width(8.dp))
                    },
                )
            },
            bottomBar = {
                BottomAppBar(modifier = Modifier.height(36.dp)) {

                    Text(
                        text = if(selectedDevice != null) "Connected to: $selectedDevice" else "Made with ❤ by Elton Kola",
                        modifier = Modifier.padding(horizontal = 8.dp),
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        ) { paddingValues ->
            AppNagivation(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                viewModel = viewModel
            )
        }

    }
}
