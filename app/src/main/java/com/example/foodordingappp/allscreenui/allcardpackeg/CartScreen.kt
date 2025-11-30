package com.example.foodordingappp.allscreenui.allcardpackeg


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material.Icon
import androidx.compose.material.RadioButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Discount
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodordingappp.R



@Preview
@Composable
fun CartScreen() {

    val jonefont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFFFFF)),
            contentAlignment = Alignment.TopCenter,

            ) {

            Column(
                modifier = Modifier
                    .width(370.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Box(
                    modifier = Modifier
                        .width(370.dp)
                        .height(85.dp)
                        .padding(top = 40.dp)

                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp)
                            .height(50.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(108.dp)
                    ){


                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                            tint = Color.Black.copy(alpha = 0.7f),
                            modifier = Modifier.size(30.dp)
                        )



                        Text(
                            text = "Cart",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = jonefont,
                            color = Color.Black.copy(alpha = 0.7f)
                        )

                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape),
                            contentAlignment = Alignment.Center
                        ){
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = null,
                                tint = Color.Black.copy(alpha = 0.7f),
                                modifier = Modifier.size(30.dp)
                            )
                        }

                    }
                }


                LazyColumn (
                    modifier = Modifier.height(580.dp)
                ){
                    item(6){

                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Bottom
            ){
                TotalAmount()
            }



        }
    }
}



@Preview
@Composable
fun TotalAmount() {

    val cardfont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(260.dp)
            .background(Color.White)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row (
                modifier = Modifier
                    .width(352.dp)
                    .height(30.dp)
                    .padding(top = 10.dp)
            ){
                Text(
                    text = "Subtotal",
                    fontFamily = cardfont,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.Black.copy(alpha = 0.6f)
                )
                Spacer(modifier = Modifier.width(215.dp))

                Text(
                    text = "₹Amount",
                    fontFamily = cardfont,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.Black.copy(alpha = 0.6f)
                )}

            HorizontalDivider(thickness = 2.dp, modifier = Modifier.width(352.dp))

            Row (
                modifier = Modifier
                    .width(352.dp)
                    .height(30.dp)
                    .padding(top = 10.dp)
            ){
                Text(
                    text = "Delivery",
                    fontFamily = cardfont,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.Black.copy(alpha = 0.6f)
                )
                Spacer(modifier = Modifier.width(215.dp))

                Text(
                    text = "₹Amount",
                    fontFamily = cardfont,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.Black.copy(alpha = 0.6f)
                )}

            HorizontalDivider(thickness = 2.dp, modifier = Modifier.width(352.dp))

            Row (
                modifier = Modifier
                    .width(352.dp)
                    .height(35.dp)
                    .padding(top = 5.dp)
            ){
                Text(
                    text = "Total",
                    fontFamily = cardfont,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(238.dp))

                Text(
                    text = "₹Amount",
                    fontFamily = cardfont,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.Black
                )}

            Button(
                onClick = {},
                modifier = Modifier
                    .height(47.dp)
                    .width(216.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF6471FF), contentColor = Color.White)

            ){
                Text(
                    text = "CHECK OUT",
                    fontFamily = cardfont,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.White
                )
            }


        }
    }

}




@Preview
@Composable
fun Checktotal() {

    val cardfont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(260.dp)
            .background(Color.White)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row (
                modifier = Modifier
                    .width(352.dp)
                    .height(30.dp)
                    .padding(top = 10.dp)
            ){
                Text(
                    text = "Subtotal",
                    fontFamily = cardfont,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.Black.copy(alpha = 0.6f)
                )
                Spacer(modifier = Modifier.width(215.dp))

                Text(
                    text = "₹Amount",
                    fontFamily = cardfont,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.Black.copy(alpha = 0.6f)
                )}

            DashedDivider(
                color = Color.Gray,
                thickness = 2.dp,
                dashWidth = 12.dp,
                dashGap = 6.dp
            )

            Row (
                modifier = Modifier
                    .width(352.dp)
                    .height(40.dp)
                    .padding(top = 5.dp)
            ){
                Icon(
                    imageVector = Icons.Filled.Discount,
                    contentDescription = "Discount",
                    tint = Color.Gray
                )

                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    text = "Use Promo Code",
                    fontFamily = cardfont,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.Black.copy(alpha = 0.5f)
                )
                Spacer(modifier = Modifier.width(105.dp))

                Button(
                    onClick = {},
                    modifier = Modifier
                        .height(30.dp)
                        .width(100.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFF55F66), contentColor = Color.White),

                    contentPadding = PaddingValues(0.dp)
                ){
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Apply",
                            fontFamily = cardfont,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.White
                        )
                    }
                }

            }

            DashedDivider(
                color = Color.Gray,
                thickness = 2.dp,
                dashWidth = 10.dp,
                dashGap = 6.dp
            )

            Row (
                modifier = Modifier
                    .width(352.dp)
                    .height(35.dp)
                    .padding(top = 5.dp)
            ){
                Text(
                    text = "Total",
                    fontFamily = cardfont,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(238.dp))

                Text(
                    text = "₹Amount",
                    fontFamily = cardfont,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.Black
                )}

            Button(
                onClick = {},
                modifier = Modifier
                    .height(47.dp)
                    .width(216.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF6471FF), contentColor = Color.White)

            ){
                Text(
                    text = "CHECK OUT",
                    fontFamily = cardfont,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.W100,
                    color = Color.White
                )
            }


        }
    }

}

@Preview
@Composable
fun AddressSelectionCard() {
    val jonefont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )
    val radioOptions = listOf("Home", "Office", "Party Place", "Tour Sport")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[0]) }


    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(5.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(radioOptions) { option ->
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFEDEEFF)),
                modifier = Modifier
                    .width(140.dp)
                    .height(130.dp)
                    .selectable(
                        selected = (option == selectedOption),
                        onClick = { onOptionSelected(option) },
                        role = Role.RadioButton
                    )
            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){

                    RadioButton(
                        selected = (option == selectedOption),
                        onClick = { onOptionSelected(option) }
                    )


                    Column(
                        modifier = Modifier
                            .padding(start = 1.dp)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier.width(130.dp).padding(end = 5.dp)
                        ) {
                            Text(
                                text = option,
                                fontSize = 16.sp,
                                fontFamily = jonefont,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )


                            Icon(
                                imageVector = Icons.Default.Edit,
                                contentDescription = "Edit",
                                tint = Color.Gray,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))

                        Column(modifier = Modifier) {
                            Text(
                                text = "(867)867-867",
                                fontSize = 14.sp,
                                color = Color.Black.copy(alpha = 0.7f)
                            )
                            Spacer(modifier = Modifier.height(2.dp))

                            Text(
                                text = "City Center, Gwalior",
                                fontSize = 14.sp,
                                color = Color.Black.copy(alpha = 0.7f)
                            )
                        }
                    }
                }
            }
        }
    }
}


