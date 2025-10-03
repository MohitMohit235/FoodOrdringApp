package com.example.foodordingappp.allscreenui



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Switch
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShareLocation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodordingappp.R




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(){
    val marcellusFont =FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )

    var checked by remember { mutableStateOf(true) }
    var showBottomSheet by remember { mutableStateOf(false) }
    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false,
    )

    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .padding(top = 28.dp)
                .padding(horizontal = 10.dp)
                .fillMaxWidth()
                .height(60.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column (
                modifier = Modifier
                    .height(50.dp),
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ){
                Row(
                    horizontalArrangement = Arrangement.spacedBy(2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        painter = painterResource(R.drawable.location_icon),
                        contentDescription = "location icon",
                        tint = Color(0xFF8791FF)
                    )
                    Spacer(modifier = Modifier.width(1.dp))
                    Text(
                        text = "Location...",
                        color = Color(0xFF363636),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = marcellusFont,
                        modifier = Modifier.padding(start = 0.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowDown,
                        contentDescription = "Location",
                        tint = Color(0xFF494949),
                        modifier = Modifier.size(20.dp)

                    )
                }
                HorizontalDivider(
                    color = Color.Black.copy(alpha = 0.2f),
                    modifier = Modifier
                        .width(120.dp)
                        .padding(horizontal = 2.dp)
                )
                Text(
                    text = "Gwalior,Madhya Pradesh 474005, India",
                    color = Color(0xFF626161),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light,
                    fontFamily = marcellusFont,
                    modifier = Modifier
                        .padding(start = 3.dp)
                )
            }

            Spacer(modifier = Modifier.width(4.dp))




            Spacer(modifier = Modifier.weight(0.5f))

            Switch(
                modifier = Modifier.scale(0.6f),
                checked = checked,
                onCheckedChange = {checked=it},

                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color(0xFFFFFFFF),
                    checkedTrackColor =Color(0xFFFFFFFF),
                    checkedBorderColor = Color(0xFF09AA39),
                    uncheckedThumbColor =Color(0xFFFFFFFF),
                    uncheckedTrackColor = Color(0xFFFFFFFF),
                    uncheckedBorderColor = Color(0xFF663333)

                ),

                thumbContent = {
                    if (checked){
                        Image(
                            painter = painterResource(R.drawable.img15),
                            contentDescription = null
                        )
                    }else{
                        Image(
                            painter = painterResource(R.drawable.img14),
                            contentDescription = null
                        )
                    }
                }
            )



            Spacer(modifier = Modifier.width(6.dp))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.DarkGray.copy(alpha = 0.5f))
                    .size(30.dp)




            ) {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "Profile Pic",
                    modifier = Modifier
                        .size(40.dp)
                )
            }
        }
    }
}



//====================================Preview Screen====================================

@Preview
@Composable
private fun my_preview1() {

    TopBar()
}


