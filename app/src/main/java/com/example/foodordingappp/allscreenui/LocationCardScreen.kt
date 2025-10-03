package com.example.foodordingappp.allscreenui


import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Directions
import androidx.compose.material.icons.outlined.ContentCopy
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodordingappp.R



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LocationCard() {

    val MergFont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )

    val context = LocalContext.current

    val address = "42, Near Poppys Tower, Race Course, Thatipur, Gwalior"


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(370.dp)
            .padding(15.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(3.dp)
    ) {
        Column (modifier = Modifier
            .padding(top = 20.dp)
            .padding(horizontal = 8.dp)
        ){

            Text(
                text = "Direction",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = MergFont,
                color = Color(0xFF2B2B2B),
                modifier = Modifier.padding(start = 10.dp)
            )

            Image(
                painter = painterResource(R.drawable.locationimg),
                contentDescription = "Map",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier.padding(12.dp)
            ) {
                Text(
                    text = address,
                    style = MaterialTheme.typography.bodyLarge,
                    maxLines = 2,
                    color = Color.Black.copy(alpha = 0.7f),
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            val clipboard =
                                android.content.ClipboardManager::class.java
                                    .let { cmClass -> context.getSystemService(cmClass) }
                            val clip = android.content.ClipData.newPlainText("Address", address)
                            clipboard?.setPrimaryClip(clip)
                            Toast.makeText(context, "Address Copied!", Toast.LENGTH_SHORT).show()
                        },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(8.dp),
                        border = BorderStroke(1.4.dp, Color(0xFF3D3D3D).copy(alpha = 0.6f)),
                        modifier = Modifier.padding(end = 12.dp) ,
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Outlined.ContentCopy,
                                contentDescription = "Copy",
                                tint = Color(0xFF6471FF),
                                modifier = Modifier
                                    .size(22.dp)
                                    .padding(end = 6.dp)
                            )
                            Text("Copy",fontSize = 14.sp)
                        }
                    }

                    Button(
                        onClick = {
                            val gmmIntentUri = Uri.parse("geo:0,0?q=$address")
                            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                            mapIntent.setPackage("com.google.android.apps.maps")
                            context.startActivity(mapIntent)
                        },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(8.dp),
                        border = BorderStroke(1.4.dp, Color(0xFF3D3D3D).copy(alpha = 0.6f)),
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Directions,
                                contentDescription = "Directions",
                                tint = Color(0xFF6471FF),
                                modifier = Modifier
                                    .size(22.dp)
                                    .padding(end = 6.dp)
                            )
                            Text("Directions",fontSize = 14.sp)
                        }
                    }
                }

            }
        }
    }
}


//====================================Preview Screen====================================


@Preview
@Composable
private fun my_preview12() {
    LocationCard()
}
