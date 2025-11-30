package com.example.foodordingappp.allscreenui.allcardpackeg




import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodordingappp.R


@Composable
fun FoodOdringCard(
    DishName: String,
    Discription: String,
    Price: String, img:
    Int,veg: Int

){

    var hasOverflow by remember { mutableStateOf(false) }
    var expanded by remember { mutableStateOf(false) }

    val jonefont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )
    Box(
        modifier = Modifier
            .height(180.dp)
            .width(380.dp)
            .background(Color.White)
    ) {
        Row (
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            Box(
                modifier = Modifier
                    .height(140.dp)
                    .width(160.dp)
                    .padding(start = 5.dp, bottom = 20.dp)
                    .clip(RoundedCornerShape(10.dp))
            ){
                Image(
                    painter = painterResource(id = img),
                    contentDescription = "food image",
                    contentScale = ContentScale.FillBounds)
            }

            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                horizontalAlignment = Alignment.Start
            ){
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(
                        text = DishName,
                        fontFamily = jonefont,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black.copy(alpha = 0.8f)
                    )

                    Image(
                        painter = painterResource(id = veg),
                        contentDescription = "filter",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 10.dp)

                    )
                }

                Spacer(modifier = Modifier.height(5.dp))

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "₹$Price",
                        fontFamily = jonefont,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black.copy(alpha = 0.8f)
                    )
                }

                Spacer(modifier = Modifier.height(5.dp))

                Column(modifier = Modifier
                    .width(170.dp)
                    .height(100.dp)
                    .padding(end = 5.dp)) {


                    Text(
                        text = Discription,
                        fontFamily = jonefont,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black.copy(alpha = 0.5f),
                        modifier = Modifier
                            .width(160.dp)
                            .padding(end = 5.dp),
                        maxLines = if (expanded) Int.MAX_VALUE else 3,
                        overflow = TextOverflow.Ellipsis,
                        onTextLayout = { result ->
                            if (result.hasVisualOverflow) {
                                hasOverflow= true
                            }
                        }
                    )
                    if (hasOverflow) {
                        TextButton(onClick = { expanded = !expanded }
                        ) {
                            Text(
                                if (expanded) "Less" else "More" ,
                                color = Color.Black.copy(alpha = 0.8f),
                                fontFamily = jonefont,
                                fontSize = 12.sp
                            )
                        }
                    }
                }
            }

        }

        Box(
            modifier = Modifier
                .width(150.dp)
                .padding(start = 23.dp)
                .padding(top = 120.dp),
            contentAlignment = Alignment.CenterStart
        ) {

            androidx.compose.material3.OutlinedButton(
                modifier = Modifier
                    .width(120.dp)
                    .height(40.dp),
                border = BorderStroke(width = 1.dp, color = Color(0xFF6471FF)),
                onClick = {},
                colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                    containerColor = Color.White
                )
            ) {

                Icon(
                    Icons.Default.Add,
                    contentDescription = null,
                    tint = Color(0xFF6471FF),
                    modifier = Modifier.size(15.dp)

                )

                Text(
                    text = "ADD",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF6471FF)
                )
            }
        }
    }
}









@Preview
@Composable
private fun my_preview5() {

    FoodOdringCard(
        veg = R.drawable.img11,
        img = R.drawable.food1,
        DishName = "Chole Bhature",
        Price = "240",
        Discription = "Famous chole bhature oierhgwueu bgieir bwiefh wiehffiwf hiwewh iiwei aaj jwjo  weoi ."
    )



}
