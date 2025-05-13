import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val iconLight: ImageVector
	get() {
		if (_undefined != null) {
			return _undefined!!
		}
		_undefined = ImageVector.Builder(
            name = "Light_mode",
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
				moveTo(480f, 600f)
				quadToRelative(50f, 0f, 85f, -35f)
				reflectiveQuadToRelative(35f, -85f)
				reflectiveQuadToRelative(-35f, -85f)
				reflectiveQuadToRelative(-85f, -35f)
				reflectiveQuadToRelative(-85f, 35f)
				reflectiveQuadToRelative(-35f, 85f)
				reflectiveQuadToRelative(35f, 85f)
				reflectiveQuadToRelative(85f, 35f)
				moveToRelative(0f, 80f)
				quadToRelative(-83f, 0f, -141.5f, -58.5f)
				reflectiveQuadTo(280f, 480f)
				reflectiveQuadToRelative(58.5f, -141.5f)
				reflectiveQuadTo(480f, 280f)
				reflectiveQuadToRelative(141.5f, 58.5f)
				reflectiveQuadTo(680f, 480f)
				reflectiveQuadToRelative(-58.5f, 141.5f)
				reflectiveQuadTo(480f, 680f)
				moveTo(200f, 520f)
				horizontalLineTo(40f)
				verticalLineToRelative(-80f)
				horizontalLineToRelative(160f)
				close()
				moveToRelative(720f, 0f)
				horizontalLineTo(760f)
				verticalLineToRelative(-80f)
				horizontalLineToRelative(160f)
				close()
				moveTo(440f, 200f)
				verticalLineToRelative(-160f)
				horizontalLineToRelative(80f)
				verticalLineToRelative(160f)
				close()
				moveToRelative(0f, 720f)
				verticalLineToRelative(-160f)
				horizontalLineToRelative(80f)
				verticalLineToRelative(160f)
				close()
				moveTo(256f, 310f)
				lineToRelative(-101f, -97f)
				lineToRelative(57f, -59f)
				lineToRelative(96f, 100f)
				close()
				moveToRelative(492f, 496f)
				lineToRelative(-97f, -101f)
				lineToRelative(53f, -55f)
				lineToRelative(101f, 97f)
				close()
				moveToRelative(-98f, -550f)
				lineToRelative(97f, -101f)
				lineToRelative(59f, 57f)
				lineToRelative(-100f, 96f)
				close()
				moveTo(154f, 748f)
				lineToRelative(101f, -97f)
				lineToRelative(55f, 53f)
				lineToRelative(-97f, 101f)
				close()
				moveToRelative(326f, -268f)
			}
		}.build()
		return _undefined!!
	}

private var _undefined: ImageVector? = null
