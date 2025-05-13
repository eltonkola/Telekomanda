package com.eltonkola.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val iconEvent: ImageVector
	get() {
		if (_undefined != null) {
			return _undefined!!
		}
		_undefined = ImageVector.Builder(
            name = "SymbolEvent",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
			path(
    			fill = SolidColor(Color(0xFF000000)),
    			fillAlpha = 1.0f,
    			stroke = null,
    			strokeAlpha = 1.0f,
    			strokeLineWidth = 1.0f,
    			strokeLineCap = StrokeCap.Butt,
    			strokeLineJoin = StrokeJoin.Miter,
    			strokeLineMiter = 1.0f,
    			pathFillType = PathFillType.EvenOdd
			) {
				moveTo(7.414f, 1.56f)
				lineTo(8.312f, 1f)
				horizontalLineToRelative(3.294f)
				lineToRelative(0.818f, 1.575f)
				lineTo(10.236f, 6f)
				horizontalLineToRelative(1.781f)
				lineToRelative(0.72f, 1.695f)
				lineTo(5.618f, 15f)
				lineToRelative(-1.602f, -1.163f)
				lineTo(6.119f, 10f)
				horizontalLineTo(4.898f)
				lineTo(4f, 8.56f)
				lineToRelative(3.414f, -7f)
				close()
				moveTo(7.78f, 9f)
				lineTo(4.9f, 14.305f)
				lineTo(12.018f, 7f)
				horizontalLineTo(8.312f)
				lineToRelative(3.294f, -5f)
				horizontalLineTo(8.312f)
				lineTo(4.898f, 9f)
				horizontalLineTo(7.78f)
				close()
			}
		}.build()
		return _undefined!!
	}

private var _undefined: ImageVector? = null
