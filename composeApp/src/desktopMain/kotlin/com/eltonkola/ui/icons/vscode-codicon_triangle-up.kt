import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val iconArrowUp: ImageVector
	get() {
		if (_undefined != null) {
			return _undefined!!
		}
		_undefined = ImageVector.Builder(
            name = "TriangleUp",
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
				moveTo(14f, 10.44f)
				lineToRelative(-0.413f, 0.56f)
				horizontalLineTo(2.393f)
				lineTo(2f, 10.46f)
				lineTo(7.627f, 5f)
				horizontalLineToRelative(0.827f)
				lineTo(14f, 10.44f)
				close()
			}
		}.build()
		return _undefined!!
	}

private var _undefined: ImageVector? = null
