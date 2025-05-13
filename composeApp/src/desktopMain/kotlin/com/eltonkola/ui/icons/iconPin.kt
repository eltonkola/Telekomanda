package com.eltonkola.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val iconPin: ImageVector
	get() {
		if (_undefined != null) {
			return _undefined!!
		}
		_undefined = ImageVector.Builder(
            name = "DrawingPin",
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
				moveTo(10.3285f, 1.13607f)
				curveTo(10.1332f, 0.9408f, 9.8166f, 0.9408f, 9.6214f, 1.1361f)
				curveTo(9.4261f, 1.3313f, 9.4261f, 1.6479f, 9.6214f, 1.8432f)
				lineTo(10.2744f, 2.49619f)
				lineTo(5.42563f, 6.13274f)
				lineTo(4.31805f, 5.02516f)
				curveTo(4.1228f, 4.8299f, 3.8062f, 4.8299f, 3.6109f, 5.0252f)
				curveTo(3.4157f, 5.2204f, 3.4157f, 5.537f, 3.6109f, 5.7323f)
				lineTo(5.02516f, 7.14648f)
				lineTo(6.08582f, 8.20714f)
				lineTo(2.81545f, 11.4775f)
				curveTo(2.6202f, 11.6728f, 2.6202f, 11.9894f, 2.8154f, 12.1846f)
				curveTo(3.0107f, 12.3799f, 3.3273f, 12.3799f, 3.5226f, 12.1846f)
				lineTo(6.79293f, 8.91425f)
				lineTo(7.85359f, 9.97491f)
				lineTo(9.2678f, 11.3891f)
				curveTo(9.4631f, 11.5844f, 9.7797f, 11.5844f, 9.9749f, 11.3891f)
				curveTo(10.1702f, 11.1939f, 10.1702f, 10.8773f, 9.9749f, 10.682f)
				lineTo(8.86733f, 9.57443f)
				lineTo(12.5039f, 4.7257f)
				lineTo(13.1569f, 5.37871f)
				curveTo(13.3522f, 5.574f, 13.6687f, 5.574f, 13.864f, 5.3787f)
				curveTo(14.0593f, 5.1834f, 14.0593f, 4.8669f, 13.864f, 4.6716f)
				lineTo(12.8033f, 3.61094f)
				lineTo(11.3891f, 2.19673f)
				lineTo(10.3285f, 1.13607f)
				close()
				moveTo(6.13992f, 6.84702f)
				lineTo(10.9887f, 3.21047f)
				lineTo(11.7896f, 4.01142f)
				lineTo(8.15305f, 8.86015f)
				lineTo(6.13992f, 6.84702f)
				close()
			}
		}.build()
		return _undefined!!
	}

private var _undefined: ImageVector? = null
