package com.example.foodordingappp.allscreenui.AllCardsScreen


import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodordingappp.R


@Composable
fun MORE_EXPLORE(){

    Box(
        modifier = Modifier
            .height(110.dp)
            .fillMaxWidth()
            .background(Color.White)

    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
        ){
            Text(
                text = "EXPLORE MORE",
                color = Color.Black.copy(alpha = 0.6f),
                fontSize = 10.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.SansSerif,
                letterSpacing = 2.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(top = 6.dp)
                    .padding(start = 5.dp)
            )

            Row(
                modifier = Modifier
                    .horizontalScroll(rememberScrollState())
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(start = 8.dp, end = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(30.dp)
            ) {

                MoreCard(imag = R.drawable.img9, Text = "Offers")
                MoreCard(imag = R.drawable.icon19, Text = "Food\non train")
                MoreCard(imag = R.drawable.icon7, Text = "Lunch")
                MoreCard(imag = R.drawable.icon18, Text = "Tiffin Box")
                MoreCard(imag = R.drawable.img3, Text = "Health")
                MoreCard(imag = R.drawable.img6, Text = "Collection")

            }
        }
    }
}

//============================Preview_Screen===================================

@Preview
@Composable
private fun my_preview17() {
    MORE_EXPLORE()
}




