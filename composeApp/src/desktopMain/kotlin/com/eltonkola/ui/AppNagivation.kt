package com.eltonkola.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.eltonkola.AppScreen
import com.eltonkola.TVRemoteViewModel

@Composable
fun AppNagivation(
    modifier: Modifier,
    viewModel: TVRemoteViewModel
) {


    val currentScreen by viewModel.screen.collectAsStateWithLifecycle()

    Column(
        modifier = modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.secondaryContainer)
    ) {

        when (currentScreen) {
            AppScreen.Scan -> {
                ScanScreenUi(viewModel = viewModel)
            }
            AppScreen.Remote -> {
                RemoteScreenUi(viewModel = viewModel)
            }
            AppScreen.Extra -> {
                ExtraScreenUi(viewModel = viewModel)
            }
        }

    }


}
