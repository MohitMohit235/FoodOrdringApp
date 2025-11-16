package com.example.foodordingappp.allscreenui.ButtonBar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodordingappp.R


@Composable
fun RatingCard(text: String?){

    val Lexend =FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )

    val rating = text?.toDoubleOrNull()

    val boxColor: Color
    val border : BorderStroke?


    val isNew = rating == null



    if (rating==null){
        boxColor = Color.Transparent
        border = BorderStroke(1.dp, Color.Transparent)

    }else{
        border = null
        boxColor = when {
            rating > 4.5 -> Color(0xFF006400)
            rating > 4.0 -> Color(0xFF0B9A36)
            rating > 3.0 -> Color(0xFF37A759)
            rating > 0.0 -> Color(0xFFF6CB5F)
            else -> Color.Transparent
        }
    }

    Box(
        modifier = Modifier

            .height(20.dp)
            .clip(RoundedCornerShape(3.dp))
            .background(boxColor)
            .then(
                if (border != null)
                    Modifier.border(
                        border = border,
                        shape = RoundedCornerShape(3.dp)
                    )
                else Modifier
            ),
        contentAlignment = Alignment.Center
    ){
        Row (
            modifier = Modifier
                .padding(horizontal = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
                if (text != null) {
                    Text(
                        text = text,
                        fontSize = 12.sp,
                        color = Color.White,
                        fontFamily = Lexend

                    )
                }
            if (!isNew) {
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "rating star",
                    tint = Color.White,
                    modifier = Modifier
                        .size(12.dp)
                )
            }
        }
    }

}


@Preview
@Composable
private fun my_preview46() {
RatingCard(text = null)
}