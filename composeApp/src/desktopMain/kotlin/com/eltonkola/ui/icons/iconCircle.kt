package com.eltonkola.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val iconCircle: ImageVector
	get() {
		if (_undefined != null) {
			return _undefined!!
		}
		_undefined = ImageVector.Builder(
            name = "CircleLargeFilled",
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
    			pathFillType = PathFillType.NonZero
			) {
				moveTo(8f, 1f)
				arcToRelative(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.86f, 0.253f)
				arcToRelative(6.899f, 6.899f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.083f, 1.805f)
				arcToRelative(6.903f, 6.903f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.804f, 3.083f)
				curveTo(14.916f, 6.738f, 15f, 7.357f, 15f, 8f)
				reflectiveCurveToRelative(-0.084f, 1.262f, -0.253f, 1.86f)
				arcToRelative(6.9f, 6.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.704f, 1.674f)
				arcToRelative(7.157f, 7.157f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.516f, 2.509f)
				arcToRelative(6.966f, 6.966f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.668f, 0.71f)
				arcTo(6.984f, 6.984f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 15f)
				arcToRelative(6.984f, 6.984f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.86f, -0.246f)
				arcToRelative(7.098f, 7.098f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.674f, -0.711f)
				arcToRelative(7.3f, 7.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.415f, -1.094f)
				arcToRelative(7.295f, 7.295f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.094f, -1.415f)
				arcToRelative(7.098f, 7.098f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -1.675f)
				arcTo(6.985f, 6.985f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 8f)
				curveToRelative(0f, -0.643f, 0.082f, -1.262f, 0.246f, -1.86f)
				arcToRelative(6.968f, 6.968f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.711f, -1.667f)
				arcToRelative(7.156f, 7.156f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.509f, -2.516f)
				arcToRelative(6.895f, 6.895f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.675f, -0.704f)
				arcTo(6.808f, 6.808f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 1f)
				close()
			}
		}.build()
		return _undefined!!
	}

private var _undefined: ImageVector? = null
