package com.example.foodordingappp.allscreenui


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodordingappp.R
import com.example.foodordingappp.allscreenui.AllCardsScreen.FoodCard


@Composable
fun FoodList(){
    val FoodList = listOf(
        FoodCard(
            img = R.drawable.food1,
            dishName = "Fry fish",
            restaurantName = "Shahi Tukda",
            time = "20-30 mins",
            address = "City Center, Gwalior",
            offer = "10% OFF up to ₹200",
            price = 360,
            distance = "1.6km",
            veg_icon = R.drawable.nonveg_icon

        ),
        FoodCard(
            img = R.drawable.food2,
            dishName = "Paneer tikka",
            restaurantName = "Shahi Tukda",
            time = "20-30 mins",
            address = "City Center, Gwalior",
            offer = null,
            price = 360,
            distance = "1.6km",
            veg_icon = R.drawable.veg_icon
        ),
        FoodCard(
            img = R.drawable.food3,
            dishName = "Pizza",
            restaurantName = "Shahi Tukda",
            time = "20-30 mins",
            address = "City Center, Gwalior",
            offer = null,
            price = 360,
            distance = "1.6km",
            veg_icon = R.drawable.nonveg_icon
        ),
        FoodCard(
            img = R.drawable.food4,
            dishName = "Fry fish",
            restaurantName = "Shahi Tukda",
            time = "20-30 mins",
            address = "City Center, Gwalior",
            offer = null,
            price = 360,
            distance = "1.6km",
            veg_icon = R.drawable.nonveg_icon
        ),
        FoodCard(
            img = R.drawable.food5,
            dishName = "Fry fish",
            restaurantName = "Shahi Tukda",
            time = "20-30 mins",
            address = "City Center, Gwalior",
            offer = null,
            price = 360,
            distance = "1.6km",
            veg_icon = R.drawable.nonveg_icon
        ),
        FoodCard(
            img = R.drawable.food6,
            dishName = "Fry fish",
            restaurantName = "Shahi Tukda",
            time = "20-30 mins",
            address = "City Center, Gwalior",
            offer = "10% OFF up to ₹200",
            price = 360,
            distance = "1.6km",
            veg_icon = R.drawable.nonveg_icon
        ),
        FoodCard(
            img = R.drawable.food7,
            dishName = "Fry fish",
            restaurantName = "Shahi Tukda",
            time = "20-30 mins",
            address = "City Center, Gwalior",
            offer = "10% OFF up to ₹200",
            price = 360,
            distance = "1.6km",
            veg_icon = R.drawable.nonveg_icon
        ),
        FoodCard(
            img = R.drawable.food8,
            dishName = "Fry fish",
            restaurantName = "Shahi Tukda",
            time = "20-30 mins",
            address = "City Center, Gwalior",
            offer = "10% OFF up to ₹200",
            price = 360,
            distance = "1.6km",
            veg_icon = R.drawable.nonveg_icon
        ),
        FoodCard(
            img = R.drawable.food9,
            dishName = "Fry fish",
            restaurantName = "Shahi Tukda",
            time = "20-30 mins",
            address = "City Center, Gwalior",
            offer = "10% OFF up to ₹200",
            price = 360,
            distance = "1.6km",
            veg_icon = R.drawable.nonveg_icon
        ),
        FoodCard(
            img = R.drawable.food10,
            dishName = "Fry fish",
            restaurantName = "Shahi Tukda",
            time = "20-30 mins",
            address = "City Center, Gwalior",
            offer = "10% OFF up to ₹200",
            price = 360,
            distance = "1.6km",
            veg_icon = R.drawable.nonveg_icon
        )



    )
 }

@Preview
@Composable
private fun my_previer09() {
    LazyColumn {
        item {
            FoodList()
        }
    }
}