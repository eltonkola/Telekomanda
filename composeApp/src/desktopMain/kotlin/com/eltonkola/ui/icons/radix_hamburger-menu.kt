package com.eltonkola.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val iconMenu: ImageVector
	get() {
		if (_undefined != null) {
			return _undefined!!
		}
		_undefined = ImageVector.Builder(
            name = "HamburgerMenu",
            defaultWidth = 15.dp,
            defaultHeight = 15.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
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
				moveTo(1.5f, 3f)
				curveTo(1.2239f, 3f, 1f, 3.2239f, 1f, 3.5f)
				curveTo(1f, 3.7761f, 1.2239f, 4f, 1.5f, 4f)
				horizontalLineTo(13.5f)
				curveTo(13.7761f, 4f, 14f, 3.7761f, 14f, 3.5f)
				curveTo(14f, 3.2239f, 13.7761f, 3f, 13.5f, 3f)
				horizontalLineTo(1.5f)
				close()
				moveTo(1f, 7.5f)
				curveTo(1f, 7.2239f, 1.2239f, 7f, 1.5f, 7f)
				horizontalLineTo(13.5f)
				curveTo(13.7761f, 7f, 14f, 7.2239f, 14f, 7.5f)
				curveTo(14f, 7.7761f, 13.7761f, 8f, 13.5f, 8f)
				horizontalLineTo(1.5f)
				curveTo(1.2239f, 8f, 1f, 7.7761f, 1f, 7.5f)
				close()
				moveTo(1f, 11.5f)
				curveTo(1f, 11.2239f, 1.2239f, 11f, 1.5f, 11f)
				horizontalLineTo(13.5f)
				curveTo(13.7761f, 11f, 14f, 11.2239f, 14f, 11.5f)
				curveTo(14f, 11.7761f, 13.7761f, 12f, 13.5f, 12f)
				horizontalLineTo(1.5f)
				curveTo(1.2239f, 12f, 1f, 11.7761f, 1f, 11.5f)
				close()
			}
		}.build()
		return _undefined!!
	}

private var _undefined: ImageVector? = null
