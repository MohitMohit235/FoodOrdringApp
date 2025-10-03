package com.example.foodordingappp.allscreenui.AllCardsScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodordingappp.R



@Composable
fun Similar() {
    val MergFont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )

    ElevatedCard(
        modifier = Modifier
            .width(185.dp)
            .height(200.dp),

        shape = RoundedCornerShape(11.dp),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(3.dp)

    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 6.dp)
                .padding(horizontal = 6.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(R.drawable.food13),
                contentDescription = null,
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))


            )

            Row (modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "Lal Jira Tadka",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = MergFont,
                    color = Color(0xFF2B2B2B)
                )

                Spacer(modifier = Modifier.width(5.dp))

                Card(
                    modifier = Modifier
                        .width(19.dp)
                        .height(13.dp)
                        .align(Alignment.CenterVertically),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF056923)),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 3.dp)
                            .height(17.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "4.3",
                            fontSize = 6.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = MergFont,
                            color = Color(0xFFFFFFFF)
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            tint = Color(0xFFFFFFFF),
                            modifier = Modifier.size(5.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.width(5.dp))
                VerticalDivider(
                    thickness = 1.dp,
                    modifier = Modifier
                        .height(14.dp),
                    color = Color.Gray)

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = "Delivery",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = MergFont,
                    color = Color(0xFF2B2B2B)
                )
            }

            HorizontalDivider(thickness = 1.5.dp)

            Text(
                text = "42, Near Poppys Tower, Race Course, Coimbatore",
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = MergFont,
                color = Color(0xFF3E3E3E)
            )

        }
    }
}

//====================================Preview Screen====================================

@Preview
@Composable
private fun my_preview2() {
    Similar()
}

