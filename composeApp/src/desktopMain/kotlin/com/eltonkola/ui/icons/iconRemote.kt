package com.eltonkola.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val iconRemote: ImageVector
	get() {
		if (_undefined != null) {
			return _undefined!!
		}
		_undefined = ImageVector.Builder(
            name = "Tv_remote",
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
				moveTo(360f, 840f)
				horizontalLineToRelative(240f)
				verticalLineToRelative(-200f)
				quadToRelative(-25f, 19f, -55.5f, 29.5f)
				reflectiveQuadTo(480f, 680f)
				reflectiveQuadToRelative(-64.5f, -10.5f)
				reflectiveQuadTo(360f, 640f)
				close()
				moveToRelative(120f, -240f)
				quadToRelative(50f, 0f, 85f, -35f)
				reflectiveQuadToRelative(35f, -85f)
				reflectiveQuadToRelative(-35f, -85f)
				reflectiveQuadToRelative(-85f, -35f)
				reflectiveQuadToRelative(-85f, 35f)
				reflectiveQuadToRelative(-35f, 85f)
				reflectiveQuadToRelative(35f, 85f)
				reflectiveQuadToRelative(85f, 35f)
				moveTo(360f, 320f)
				quadToRelative(25f, -19f, 55.5f, -29.5f)
				reflectiveQuadTo(480f, 280f)
				reflectiveQuadToRelative(64.5f, 10.5f)
				reflectiveQuadTo(600f, 320f)
				verticalLineToRelative(-200f)
				horizontalLineTo(360f)
				close()
				moveToRelative(0f, 600f)
				quadToRelative(-33f, 0f, -56.5f, -23.5f)
				reflectiveQuadTo(280f, 840f)
				verticalLineToRelative(-720f)
				quadToRelative(0f, -33f, 23.5f, -56.5f)
				reflectiveQuadTo(360f, 40f)
				horizontalLineToRelative(240f)
				quadToRelative(33f, 0f, 56.5f, 23.5f)
				reflectiveQuadTo(680f, 120f)
				verticalLineToRelative(720f)
				quadToRelative(0f, 33f, -23.5f, 56.5f)
				reflectiveQuadTo(600f, 920f)
				close()
				moveToRelative(120f, -380f)
				quadToRelative(-25f, 0f, -42.5f, -17.5f)
				reflectiveQuadTo(420f, 480f)
				reflectiveQuadToRelative(17.5f, -42.5f)
				reflectiveQuadTo(480f, 420f)
				reflectiveQuadToRelative(42.5f, 17.5f)
				reflectiveQuadTo(540f, 480f)
				reflectiveQuadToRelative(-17.5f, 42.5f)
				reflectiveQuadTo(480f, 540f)
				moveToRelative(0f, -300f)
				quadToRelative(17f, 0f, 28.5f, -11.5f)
				reflectiveQuadTo(520f, 200f)
				reflectiveQuadToRelative(-11.5f, -28.5f)
				reflectiveQuadTo(480f, 160f)
				reflectiveQuadToRelative(-28.5f, 11.5f)
				reflectiveQuadTo(440f, 200f)
				reflectiveQuadToRelative(11.5f, 28.5f)
				reflectiveQuadTo(480f, 240f)
				moveToRelative(0f, 40f)
			}
		}.build()
		return _undefined!!
	}

private var _undefined: ImageVector? = null
