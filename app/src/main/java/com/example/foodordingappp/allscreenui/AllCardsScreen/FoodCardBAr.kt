package com.example.foodordingappp.allscreenui.AllCardsScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShareLocation
import androidx.compose.material.icons.outlined.Timelapse
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodordingappp.R
import com.example.foodordingappp.allscreenui.ButtonBar.BookmarkIcon
import com.example.foodordingappp.allscreenui.ButtonBar.RatingCard




@Composable
fun FoodCard(
    img: Int,
    dishName: String,
    restaurantName: String,
    time: String,
    address: String,
    offer: String? = null,
    price: Int,
    distance: String,
    veg_icon: Int,
    rating: Double?

) {

    val Lexend =FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Column {
            Box {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = dishName,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(170.dp),
                    contentScale = ContentScale.Crop
                )

                if (dishName.isNotEmpty()){

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Box(
                            modifier = Modifier
                                .padding(start = 5.dp)
                                .clip(shape = MaterialTheme.shapes.extraSmall)
                                .background(Color.Black.copy(alpha = 0.7f))
                                .padding(horizontal = 1.dp)

                        ) {
                            Text(
                                text = "${dishName} - ₹${price} for one",
                                color = Color.White,
                                fontSize = 8.sp,
                                fontFamily = Lexend,
                                fontWeight = FontWeight.Normal,
                               modifier = Modifier
                                   .padding(
                                       horizontal = 4.dp)
                            )
                        }

                        if (dishName.isNotEmpty()) {
                            Box(
                                modifier = Modifier
                                    .padding(end = 5.dp)
                                    .clip(shape = RoundedCornerShape(5.dp))
                            ) {
                                BookmarkIcon()
                            }
                        }
                    }
                }

                if (!offer.isNullOrEmpty()) {

                    Text(
                        text = offer,
                        color = Color.White,
                        fontFamily = Lexend,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(
                                        Color.Blue.copy(alpha = 0.8f),
                                        Color.Transparent
                                    )
                                )
                            )
                            .padding(horizontal = 10.dp, vertical = 4.dp)
                            .align(Alignment.BottomStart)
                    )
                }
            }

            Column(modifier = Modifier.padding(12.dp)) {

                Row (modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row (verticalAlignment = Alignment.Bottom){
                        Text(
                            text = restaurantName,
                            fontSize = 18.sp,
                            fontFamily = Lexend,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black.copy(alpha = 0.8f)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(1.dp),
                            modifier = Modifier.padding(vertical = 1.dp)
                        ) {
                           Icon(
                               painter = painterResource(id = veg_icon),
                               contentDescription = "veg icon",
                               tint =  if (veg_icon==R.drawable.veg_icon) Color(0xFF01A437)else Color(0xFF621919),
                               modifier = Modifier
                                   .size(10.dp)
                           )

                            Text(
                                text = if (veg_icon == R.drawable.veg_icon)"veg" else "non veg",
                                fontFamily = Lexend,
                                fontSize = 10.sp,
                                color = if (veg_icon==R.drawable.veg_icon) Color(0xFF01A437)else Color(0xFF621919)
                            )
                        }
                    }
                    RatingCard(text = "${rating}")
                }

                Spacer(modifier = Modifier.height(6.dp))

                    Row (modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(3.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Icon(
                            imageVector = Icons.Outlined.Timelapse,
                            contentDescription = "timer",
                            tint = Color.DarkGray,
                            modifier = Modifier
                                .size(12.dp)
                        )

                        Text(
                            text = time,
                            fontSize = 10.sp,
                            color = Color.DarkGray,
                            fontFamily = Lexend
                        )

                        VerticalDivider(
                            modifier = Modifier
                                .height(10.dp)
                        )

                        Text(
                            text = distance,
                            fontSize = 10.sp,
                            color = Color.DarkGray,
                            fontFamily = Lexend
                        )

                    }

                Spacer(modifier = Modifier.height(6.dp))

                Row (modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = address,
                        fontSize = 12.sp,
                        color = Color.Black.copy(alpha = 0.6f),
                        fontFamily = Lexend,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(2.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                             Icon(
                                 imageVector = Icons.Filled.ShareLocation,
                                 contentDescription = "restraint location",
                                 tint = Color(0xFF8791FF),
                                 modifier = Modifier
                                     .size(18.dp)
                             )

                            Text(
                                text = "View location",
                                fontFamily = Lexend,
                                fontSize = 12.sp,
                                style = TextStyle(
                                    color = Color(0xFF8791FF),
                                    fontSize = 18.sp,
                                    textDecoration = TextDecoration.Underline
                                )
                            )
                        }
                }
            }
        }
    }
}

//===========================Preview_Screen=============================================================


@Preview
@Composable
private fun my_preview46() {
    FoodCard(
        img = R.drawable.food1,
        dishName = "Fry fish",
        restaurantName = "Shahi Tukda",
        time = "20-30 mins",
        address = "City Center, Gwalior",
        offer = "10% OFF up to ₹200",
        price = 360,
        distance = "1.6km",
        veg_icon = R.drawable.nonveg_icon,
        rating = 3.4
    )
}