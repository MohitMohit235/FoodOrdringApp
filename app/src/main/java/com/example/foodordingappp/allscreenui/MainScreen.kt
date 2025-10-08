package com.example.foodordingappp.allscreenui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodordingappp.allscreenui.AllCardsScreen.MORE_EXPLORE
import com.example.foodordingappp.allscreenui.AllCardsScreen.OfferCard
import com.example.foodordingappp.allscreenui.AllCardsScreen.SearchBar

@Preview
@Composable
fun Main_Screen() {
    Surface (
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
        ){
            LazyColumn (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(Color.White)
            ){
                item {
                    TopBar()
                }

                stickyHeader {

                    SearchBar(
                        texts = listOf("Restaurants", "Foods"),
                        intervalMs = 2000
                    )

                    FoodHorizontal()
                }
                item {
                    HorizontalTabBar()
                    Spacer(modifier = Modifier.height(5.dp))
                    MORE_EXPLORE()
                    Spacer(modifier = Modifier.height(5.dp))
                    FoodList()
                }


     }
   }
}