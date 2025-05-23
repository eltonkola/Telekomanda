package com.eltonkola.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val iconClose: ImageVector
	get() {
		if (_undefined != null) {
			return _undefined!!
		}
		_undefined = ImageVector.Builder(
            name = "Close",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
			path(
    			fill = SolidColor(Color.Black),
    			fillAlpha = 1.0f,
    			stroke = null,
    			strokeAlpha = 1.0f,
    			strokeLineWidth = 1.0f,
    			strokeLineCap = StrokeCap.Butt,
    			strokeLineJoin = StrokeJoin.Miter,
    			strokeLineMiter = 1.0f,
    			pathFillType = PathFillType.NonZero
			) {
				moveTo(256f, 760f)
				lineToRelative(-56f, -56f)
				lineToRelative(224f, -224f)
				lineToRelative(-224f, -224f)
				lineToRelative(56f, -56f)
				lineToRelative(224f, 224f)
				lineToRelative(224f, -224f)
				lineToRelative(56f, 56f)
				lineToRelative(-224f, 224f)
				lineToRelative(224f, 224f)
				lineToRelative(-56f, 56f)
				lineToRelative(-224f, -224f)
				close()
			}
		}.build()
		return _undefined!!
	}

private var _undefined: ImageVector? = null
