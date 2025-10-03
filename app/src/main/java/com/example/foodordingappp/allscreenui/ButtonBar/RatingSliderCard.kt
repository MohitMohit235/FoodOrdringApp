package com.example.foodordingappp.allscreenui.ButtonBar



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodordingappp.R
import kotlin.math.roundToInt


@Composable
fun RatingSlider() {
    val LexendFont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )
    var sliderPosition by remember { mutableStateOf(0) }
    val values = listOf(1.0f, 2.5f, 3.5f, 4.5f, "Any")

    Column(modifier = Modifier.padding(20.dp)) {

        Text(
            text = "Rating: ${values[sliderPosition]}",
            style = MaterialTheme.typography.caption,
            fontFamily = LexendFont,
            color = Color.Black.copy(alpha = 0.70f),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Slider(
            modifier = Modifier.width(350.dp),
            value = sliderPosition.toFloat(),
            onValueChange = { index -> sliderPosition = index.roundToInt() },

            valueRange = 0f..(values.size - 1).toFloat(),

            colors = SliderDefaults.colors(
                thumbColor = Color(0xFF6471FF),
                activeTrackColor = Color(0xFF6471FF),
                inactiveTrackColor = Color(0xFF626161).copy(alpha = 0.50f)
            )
        )
    }
}

//====================================Preview Screen====================================

@Preview
@Composable
private fun my_preview6() {
    RatingSlider()
}
