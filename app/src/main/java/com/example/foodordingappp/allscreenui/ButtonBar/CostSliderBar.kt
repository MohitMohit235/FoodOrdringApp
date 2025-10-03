package com.example.foodordingappp.allscreenui.ButtonBar


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodordingappp.R


@Composable
fun CostSlider() {

    val LexendFont =
        FontFamily(Font(R.font.lexend_regular, FontWeight.Normal)
        )

    var sliderPosition by remember { mutableIntStateOf(0) }

    Column (modifier = Modifier.padding(20.dp)){

        Text(text = "Cost for two",
            fontFamily =LexendFont,
            fontSize = 15.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally) )

        Spacer(modifier = Modifier.height(10.dp))


        Text(text = "₹0 - ₹$sliderPosition",
            fontFamily =LexendFont,
            color = Color(0xFF626161),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(10.dp))


        Slider(
            value = sliderPosition.toFloat(),
            onValueChange = { sliderPosition = it.toInt() },
            colors = SliderDefaults.colors(
                thumbColor =Color(0xFF6471FF),
                activeTrackColor = Color(0xFF6471FF),
                inactiveTrackColor = Color(0xFF626161).copy(alpha = 0.40f),
            ),
            steps = 0,
            valueRange = 0f..2000f
        )
    }
}


//====================================Preview Screen====================================

@Preview
@Composable
private fun my_preview19() {
    CostSlider()
}





