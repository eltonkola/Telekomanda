package com.eltonkola.components
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite // Example Icon
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

// Define default colors
val IdleColor = Color(0xFF666666)
val PressColor = Color.Green
val LongPressColor = Color.Red

/**
 * A Composable that displays an icon within a circular background,
 * handling press and long press gestures to change the background color.
 *
 * @param icon The ImageVector to display.
 * @param contentDescription The content description for accessibility.
 * @param modifier Optional Modifier for the composable.
 * @param iconSize The size of the icon itself.
 * @param padding The padding around the icon, defining the background size.
 * @param iconTint The tint color for the icon.
 * @param onPress Callback invoked when the icon is pressed (short tap released).
 * @param onLongPress Callback invoked when the icon is long pressed.
 */
@Composable
fun PressableIcon(
    enabledButton: Boolean = true,
    icon: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    iconSize: Dp = 24.dp,
    padding: Dp = 12.dp,
    iconTint: Color = Color.White,
    onPress: () -> Unit = {}, // Callback for normal press/tap
    onLongPress: () -> Unit = {} // Callback for long press
) {
    // State to hold the current background color
    var backgroundColor by remember { mutableStateOf(IdleColor) }

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
//            .clip(CircleShape) // Clip the background and ripple to a circle
//            .background(backgroundColor, CircleShape) // Apply background color



                .size(45.dp)
            .shadow(4.dp, RoundedCornerShape(8.dp))
            .clip(RoundedCornerShape(8.dp))
            .background(if (enabledButton) backgroundColor else Color.Gray)
//            .clickable(enabled = enabled, onClick = onClick),



            .pointerInput(Unit) { // Use pointerInput for gesture detection
                detectTapGestures(
                    onPress = { offset -> // Called when pointer goes down
                        if(enabledButton) {
                            backgroundColor = PressColor // Change to Green immediately
                            val released = tryAwaitRelease() // Wait for pointer release or cancel
                            // After release or cancel, reset to Idle color
                            // This happens regardless of whether it was a tap or long press
                            backgroundColor = IdleColor
                            // If it wasn't cancelled (normal release) and *not* consumed by onLongPress,
                            // consider it a tap. However, onTap below is more specific.
                            // We mainly use tryAwaitRelease here to know when to reset the color.
                        }
                    },
                    onLongPress = { offset -> // Called after long press threshold is met
                        if(enabledButton) {
                            backgroundColor = LongPressColor // Change to Red
                            onLongPress() // Invoke the long press callback
                            // Note: The onPress lambda's tryAwaitRelease() is still running.
                            // When the finger is eventually lifted, it will reset the color to Gray.
                        }
                    },
                    onTap = { offset -> // Called specifically on a tap (short press + release)
                        // Although onPress changes color, onTap is the correct place
                        // to trigger the functional action for a tap.
                        if(enabledButton) {
                            onPress() // Invoke the press callback
                        }
                    }
                )
            }
            .padding(padding) // Apply padding *after* background/input to define touch area size
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            modifier = Modifier.size(iconSize),
            tint = iconTint
        )
    }
}

// --- Preview Function ---
@Preview()
@Composable
fun PressableIconPreview() {
    MaterialTheme {
        PressableIcon(
            icon = Icons.Default.Favorite,
            contentDescription = "Favorite Heart",
            onPress = { println("Icon Pressed!") },
            onLongPress = { println("Icon LONG Pressed!") },
            enabledButton = true
        )
    }
}