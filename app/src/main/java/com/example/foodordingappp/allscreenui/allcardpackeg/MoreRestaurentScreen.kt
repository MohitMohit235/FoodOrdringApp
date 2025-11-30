package com.example.foodordingappp.allscreenui.allcardpackeg


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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


@Composable
fun More_Restaurent(
    img: Int,Resname: String,
    Address: String,
    time: String,
    Distance: String
) {
    val MergFont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )
    Box(
        modifier = Modifier
            .width(350.dp)
            .height(60.dp)
            .padding(start = 15.dp)
            .clip(RoundedCornerShape(11.dp))
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier
                    .size(58.dp)
                    .clip(CircleShape)

            ) {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = "null",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Column (
                modifier = Modifier
                    .height(50.dp)
                    .padding(end = 40.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    text = Resname,
                    color = Color(0xFF2F2F2F),
                    fontSize = 20.sp,
                    fontFamily = MergFont,
                    fontWeight = FontWeight.Light

                )
                Text(
                    text = Address,
                    color = Color(0xFF2F2F2F),
                    fontSize = 13.sp,
                    fontFamily = MergFont,
                    fontWeight = FontWeight.Light

                )
                Text(
                    text = "Today ${time}",
                    color = Color(0xFF2F2F2F),
                    fontSize = 9.sp,
                    fontFamily = MergFont,
                    fontWeight = FontWeight.Light

                )
            }

            Column (
                modifier = Modifier
                    .height(50.dp)
                    .padding(end = 5.dp, top = 6.dp),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.SpaceBetween
            ){

                Card(
                    modifier = Modifier
                        .width(33.dp)
                        .height(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFE73F46)),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "OPEN",
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = MergFont,
                            color = Color(0xFFFFFFFF)
                        )
                    }
                }

                Text(
                    text = "Distance ${Distance}m",
                    color = Color(0xFF2F2F2F),
                    fontSize = 8.sp,
                    fontFamily = MergFont,
                    fontWeight = FontWeight.Light

                )
            }
        }
    }
}

//====================================Preview Screen====================================


@Preview
@Composable
private fun my_preview10() {
    More_Restaurent(
        img = R.drawable.food13,
        Resname = "7 hill Restaurant",
        Address = "Nani Plaza, Lashkar, Gwalior",
        time = "10:20Pm to 11:40Am",
        Distance = "1.0"
    )
}



