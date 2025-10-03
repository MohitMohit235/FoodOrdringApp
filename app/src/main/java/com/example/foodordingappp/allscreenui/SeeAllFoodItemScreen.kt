package com.example.foodordingappp.allscreenui


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodordingappp.R
import com.example.foodordingappp.allscreenui.AllCardsScreen.MY_foodCategory

//============================FooItem Data Class ===================================
data class FoodItem(
    val img: Int,
    val title: String,
    val string: String,
    val string1: String,
    val vegIcon: Int,
    val string2: String
)

//============================FooItem List ===================================
val foodList = listOf(

    FoodItem(
        R.drawable.food6,
        "Pizza",
        "Lashkar , Gwalior",
        "20 mins • 2km",
        R.drawable.img11,
        "10% OFF up to two"
    ),
    FoodItem(
        R.drawable.food7,
        "Veg Pasta",
        "Lashkar , Gwalior",
        "20 mins • 2km",
        R.drawable.img11,
        "10% OFF up to two"
    ),
    FoodItem(
        R.drawable.food5,
        "Chicken Wings",
        "Lashkar , Gwalior",
        "20 mins • 2km",
        R.drawable.img11,
        "10% OFF up to two"
    ),
    FoodItem(
        R.drawable.food8,
        "Penne Pasta",
        "Lashkar , Gwalior",
        "20 mins • 2km",
        R.drawable.img11,
        "10% OFF up to two"
    ),
    FoodItem(
        R.drawable.food8,
        "Cheese Burger",
        "Lashkar , Gwalior",
        "20 mins • 2km",
        R.drawable.img11,
        "10% OFF up to two"
    ),
    FoodItem(
        R.drawable.food6,
        "Pizza",
        "Lashkar , Gwalior",
        "20 mins • 2km",
        R.drawable.img11,
        "10% OFF up to two"
    ),

    FoodItem(
        R.drawable.food3,
        "Pizza",
        "Lashkar , Gwalior",
        "20 mins • 2km",
        R.drawable.img11,
        "10% OFF up to two"
    ),
    FoodItem(
        R.drawable.food7,
        "Veg Pasta",
        "Lashkar , Gwalior",
        "20 mins • 2km",
        R.drawable.img11,
        "10% OFF up to two"
    ),
    FoodItem(
        R.drawable.food3,
        "Chicken Wings",
        "Lashkar , Gwalior",
        "20 mins • 2km",
        R.drawable.img11,
        "10% OFF up to two"
    ),
    FoodItem(
        R.drawable.food4,
        "Penne Pasta",
        "Lashkar , Gwalior",
        "20 mins • 2km",
        R.drawable.img11,
        "10% OFF up to two"
    ),
    FoodItem(
        R.drawable.food12,
        "Cheese Burger",
        "Lashkar , Gwalior",
        "20 mins • 2km",
        R.drawable.img11,
        "10% OFF up to two"
    ),
    FoodItem(
        R.drawable.food3,
        "Pizza",
        "Lashkar , Gwalior",
        "20 mins • 2km",
        R.drawable.img11,
        "10% OFF up to two"
    )
)



//======================FoodItem Container ===================

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FoodGridScreen() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(foodList) { food ->
            MY_foodCategory(img = food.img, title = food.title)
        }
    }
}


//====================================Preview Screen====================================

@Preview
@Composable
private fun my_preview3() {
    FoodGridScreen()
}

