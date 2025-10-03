package com.example.foodordingappp.allscreenui.AllCardsScreen


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodordingappp.R


@SuppressLint("SuspiciousIndentation")
@Composable
fun MY_foodCategory(img: Int, title: String) {

    val jonefont =FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal))

    Column (
        modifier = Modifier.width(100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .clip(RoundedCornerShape(60.dp))
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.width(5.dp))

        Text(
            text = title,
            fontFamily = jonefont,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            color = Color.Black.copy(alpha = 0.6f)
        )
    }
}

@Preview
@Composable
private fun my_preview14() {
    MY_foodCategory(
        img = R.drawable.food7,
        title = "Chicken Wings"
    )
}


