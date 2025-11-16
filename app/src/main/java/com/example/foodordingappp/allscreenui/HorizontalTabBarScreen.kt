package com.example.foodordingappp.allscreenui


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.shadow
import com.example.foodordingappp.R


//===============================Data Class===============================
data class FilterItem(
    val leadingIcon: ImageVector? = null,
    val text: String,
    val trailingIcon: ImageVector? = null
)


@Composable
fun HorizontalTabBar() {
    val filters = listOf(
        FilterItem(leadingIcon = Icons.Default.FilterList, text = "Filters", trailingIcon = Icons.Default.ArrowDropDown),
        FilterItem(text = "Schedule", trailingIcon = Icons.Default.ArrowDropDown),
        FilterItem(text = "Under 30 mins"),
        FilterItem(text = "Under₹150"),
        FilterItem(text = "Rating 4.0+"),
        FilterItem(text = "Pure Veg")
    )

    LazyRow(
            modifier = Modifier.fillMaxWidth().height(80.dp),
             verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(horizontal = 5.dp, vertical = 5.dp)
        ) {
            items(filters) { filter ->
                TabCard(
                    leadingIcon = filter.leadingIcon,
                    text = filter.text,
                    trailingIcon = filter.trailingIcon
                )
            }
      }
}





//=============================TabCard============================

@Composable
fun TabCard(
    leadingIcon: ImageVector? = null,
    text: String,
    trailingIcon: ImageVector? = null
) {
    val jonefont = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )

    Card(
        modifier = Modifier
            .shadow(3.dp, RoundedCornerShape(8.dp), clip = false),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 7.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            leadingIcon?.let {
                Icon(
                    imageVector = it,
                    contentDescription = text,
                    tint = Color(0xFF000000),
                    modifier = Modifier.size(12.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
            }


            Text(
                text = text,
                color = Color.Black,
                fontSize = 12.sp,
                fontFamily = jonefont,
                fontWeight = FontWeight.Normal
            )


            trailingIcon?.let {
                Spacer(modifier = Modifier.width(5.dp))
                Icon(
                    imageVector = it,
                    contentDescription = text,
                    tint = Color(0xFF000000),
                    modifier = Modifier.size(16.dp)
                )
            }
        }
    }
}



//====================================Preview Screen====================================


@Preview()
@Composable
private fun my_preview13() {

    HorizontalTabBar()
}
