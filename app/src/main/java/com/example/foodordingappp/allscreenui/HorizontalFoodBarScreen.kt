package com.example.foodordingappp.allscreenui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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


//==================================Data Class======================
data class textweel(val tab: String,val img: Int)



@Composable
fun HorizontalFoodBar(
    Categories: List<textweel>,
    SelectedTabIndex: Int,
    onTabSelected: (Int) -> Unit
) {
    val marcellusFont = FontFamily(Font(R.font.lexend_regular, FontWeight.Normal))

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        contentAlignment = Alignment.BottomCenter
    ) {
        ScrollableTabRow(
            selectedTabIndex = SelectedTabIndex,
            edgePadding = 0.dp,
            containerColor = Color.White,
            divider = {},
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    modifier = Modifier
                        .tabIndicatorOffset(tabPositions[SelectedTabIndex])
                        .height(2.dp),
                    color = Color(0xFF6471FF)
                )
            }
        ) {
            Categories.forEachIndexed { index, item ->
                Tab(
                    modifier = Modifier.padding(2.dp),
                     selected = SelectedTabIndex == index,
                    onClick = { onTabSelected(index) },

                    ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Box (
                            modifier = Modifier
                                .padding(5.dp)
                                .size(40.dp),
                        ){
                            Image(
                                painter = painterResource(id = item.img),
                                contentDescription = "image",
                                contentScale = ContentScale.Fit,
                                modifier = Modifier.padding(2.dp)
                            )
                        }
                        Text(
                            text = item.tab,
                            fontFamily = marcellusFont,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            color = if (SelectedTabIndex == index) Color.Black else Color.Gray
                        )
                    }

                }
            }
        }
    }
}


//===============================Preview_Screen==============================

@Preview
@Composable
fun FoodHorizontal() {

    val categories = listOf(
        textweel("All",R.drawable.icon1),
        textweel("Cack",R.drawable.icon4),
        textweel("Dal",R.drawable.icon6),
        textweel("Biryani",R.drawable.icon2),
        textweel("Burger",R.drawable.icon3),
        textweel("Curry",R.drawable.icon14),
        textweel("Dosa",R.drawable.icon10),
        textweel("Fish",R.drawable.icon17),
        textweel("Noodle",R.drawable.icon13),
        textweel("Paneer",R.drawable.icon14),
        textweel("Pasta",R.drawable.icon12),
        textweel("Pizza",R.drawable.icon16),
        textweel("Idli",R.drawable.icon11),
        textweel("Dessert",R.drawable.icon9),
        textweel("Rice",R.drawable.icon15),
        textweel("See all",R.drawable.icon20)
    )
    var selectedTab by remember { mutableStateOf(0) }


    HorizontalFoodBar (
        Categories = categories,
        SelectedTabIndex = selectedTab,
        onTabSelected = { index -> selectedTab = index }
    )

}


