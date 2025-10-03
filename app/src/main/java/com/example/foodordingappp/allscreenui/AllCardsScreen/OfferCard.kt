package com.example.foodordingappp.allscreenui.AllCardsScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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



@Composable
fun OfferCard() {

    val Lexend_Font =FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )

    Card(modifier = Modifier
        .width(342.dp)
        .height(152.dp)
        .padding(5.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(Color(0xFFEFBD42))
    ) {
        Row (
            modifier = Modifier
                .fillMaxSize()
        ){
 //===================TextBox======================
            Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(start = 15.dp)
            ){
                Column (
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(vertical = 5.dp)
                ){
                    Text(
                        text = "Buy combo meal",
                        fontFamily = Lexend_Font,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color(0xFF303030)
                    )

                    Text(
                        text = "Get up to",
                        fontFamily = Lexend_Font,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White
                    )

                    Row(
                        verticalAlignment = Alignment.Bottom
                    ){
                        Text(
                            text = "10%",
                            fontFamily = Lexend_Font,
                            fontWeight = FontWeight.Bold,
                            fontSize = 40.sp,
                            color = Color.White
                        )

                        Text(
                            text = "OFF",
                            fontFamily = Lexend_Font,
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            color = Color.White
                        )
                    }

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE73F46)),
                       shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "CHECK OUT",
                            color = Color.White,
                            fontFamily = Lexend_Font,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }
            }
//===================imageBox======================
            Box(
                modifier = Modifier,
                contentAlignment = Alignment.CenterEnd
            ) {
                Icon(
                    painter = painterResource(R.drawable.rectangle_bar),
                    contentDescription = "offerCard",
                    tint = Color(0xFFE73F46),
                    modifier = Modifier
                )
                Image(
                    painter = painterResource(R.drawable.icon7),
                    contentDescription = "combo meal",
                    modifier = Modifier
                        .align(Alignment.CenterEnd)

                )
            }
        }
    }
}


//=======================Preview Screen======================================

@Preview
@Composable
private fun my_Preview9() {
    OfferCard()
}

