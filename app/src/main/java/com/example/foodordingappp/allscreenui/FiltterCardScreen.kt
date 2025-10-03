package com.example.foodordingappp.allscreenui


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodordingappp.R


@Composable
fun FILTER( text: String,
            selected: Boolean,
            onSelect: () -> Unit) {

    var selectedOption by remember { mutableStateOf("Option 1") }
    val jonefont =FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal))

    val filterOptions = listOf("Sort by", "Rating", "Cost for two", "More filter")
    var selectedFilter by remember { mutableStateOf("Sort by") }

    ElevatedCard(
        modifier = Modifier
            .width(348.dp)
            .height(342.dp)
            .background(Color.White, shape = RoundedCornerShape(30.dp))


    ) {
        Column {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .drawBehind {
                        val shadowHeight = 1.5.dp.toPx()
                        drawRect(
                            color = Color.Black.copy(alpha = 0.4f),
                            topLeft = Offset(0f, size.height - shadowHeight),
                            size = Size(width = size.width, height = shadowHeight)
                        )
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .weight(1f)

                ) {
                    Text(text = "Filters",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily =jonefont,
                        modifier = Modifier
                            .padding(start = 25.dp))

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(text = selectedFilter,
                        fontSize = 10.sp,
                        fontFamily = jonefont,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )
                }

                IconButton(onClick = {  },modifier = Modifier.size(40.dp)
                ) {
                        androidx.compose.material.Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = null
                        )

                }
            }

            // Filter Options Row
            Row(modifier = Modifier.height(250.dp)) {
                // Left: Filter Types
                Column(
                    modifier = Modifier
                        .width(100.dp)
                        .fillMaxHeight()

                        .background(Color(0xFFE4E6FF)),
                    verticalArrangement = Arrangement.spacedBy(2.dp)
                ) {
                    filterOptions.forEach { option ->
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 15.dp)
                                .clickable { selectedFilter = option }
                                .background(
                                    if (selectedFilter == option) Color.White else Color.Transparent
                                )
                                .padding(12.dp)
                        ) {
                            Text(text = option, fontFamily = jonefont)
                        }
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))


                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    when (selectedFilter) {
                        "Sort by" -> {
                            Box(modifier = Modifier.padding(top = 10.dp)) {

                            }
                        }
                        "Rating" -> {
                            Box(modifier = Modifier){

                            }
                        }
                        "Cost for two" -> {
                            Box(modifier = Modifier){

                            }
                        }
                        "More filter" -> {
                            Text("More filter options here")
                        }
                    }
                }
            }

            Box(modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(color = Color.White)
                .drawBehind {
                    val shadowHeight = 2.dp.toPx()
                    drawRect(
                        color = Color.Black.copy(alpha = 0.4f),
                        topLeft = Offset(x = -shadowHeight, y = 0f),
                        size = Size(width = size.width, height = shadowHeight)
                    )
                },
                contentAlignment = Alignment.Center
            )
            {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(77.dp)
                        .height(23.dp),
                    contentPadding = PaddingValues(0.dp),
                    shape = RoundedCornerShape(4.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF6471FF),
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "Apply",
                        fontSize = 12.sp
                    )
                }
            }

        }
    }

}

//==============================Preview_Screen=======================

@Preview(showBackground = true)
@Composable
fun my_preview16() {
    FILTER(
        text = "Sort by",
        selected = true,
        onSelect = {}
    )
}

