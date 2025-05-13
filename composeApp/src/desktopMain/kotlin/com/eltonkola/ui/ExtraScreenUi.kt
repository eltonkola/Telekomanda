package com.eltonkola.ui

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.eltonkola.TVRemoteViewModel
import com.eltonkola.data.AdbKeyEvent
import com.eltonkola.ui.icons.iconEvent

@Composable
fun ExtraScreenUi(
    viewModel: TVRemoteViewModel
) {

    var searchQuery by remember { mutableStateOf("") }
    val allKeyEvents = AdbKeyEvent.entries

    val filteredKeyEvents = remember(searchQuery, allKeyEvents) {
        if (searchQuery.isBlank()) {
            allKeyEvents
        } else {
            allKeyEvents.filter { keyEvent ->
                keyEvent.description.contains(searchQuery, ignoreCase = true) ||
                        keyEvent.adbCommandValue.contains(searchQuery, ignoreCase = true) ||
                        (keyEvent.char?.toString()?.contains(searchQuery, ignoreCase = true) == true)
            }
        }
    }
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        // Search Field
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
            label = { Text("Search Key Events") },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search") },
            trailingIcon = {
                if (searchQuery.isNotEmpty()) {
                    IconButton(onClick = { searchQuery = "" }) {
                        Icon(Icons.Default.Clear, contentDescription = "Clear Search")
                    }
                }
            },
            singleLine = true
        )

        // Content Area with LazyColumn and Scrollbar
        Box(modifier = Modifier.weight(1f)) { // Ensure the Box takes available space for scrollbar
            val listState = rememberLazyListState()

            LazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize() // Fill the Box
            ) {
                if (filteredKeyEvents.isEmpty()) {
                    item {
                        Text(
                            text = "No key events match your search.",
                            modifier = Modifier.fillMaxWidth().padding(16.dp),
                            style = MaterialTheme.typography.bodyLarge,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )
                    }
                } else {
                    items(filteredKeyEvents) { keyEvent ->
                        ListItem(
                            modifier = Modifier.clickable {
                                viewModel.sendKeyEvent(keyEvent.adbCommandValue)
                            },
                            headlineContent = { Text(text = keyEvent.description) },
                            supportingContent = {
                                val supportText = mutableListOf<String>()
                                supportText.add(keyEvent.adbCommandValue)
                                keyEvent.char?.let { supportText.add("Char: '$it'") }
                                Text(text = supportText.joinToString(" | "), style = MaterialTheme.typography.bodySmall)
                            },
                            leadingContent = {
                                Icon(
                                    imageVector = iconEvent,
                                    contentDescription = "Key Event"
                                )
                            }
                        )
                        Divider()
                    }
                }
            }

            // Vertical Scrollbar for Desktop
            VerticalScrollbar(
                modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
                adapter = rememberScrollbarAdapter(scrollState = listState)
            )
        }
    }
}
