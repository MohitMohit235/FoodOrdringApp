package com.example.foodordingappp.allscreenui.ButtonBar




import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodordingappp.R


@Composable
fun RadioButtonSingleSelection() {

    val jonefont =FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal))
    val radioOptions = listOf("Popularity",
        "Rating:High to Low",
        "Cost:Low to High",
        "Cost:High to Low",
        "Distance")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[0]) }

    Column(modifier = Modifier.height(250.dp)) {
        radioOptions.forEach { text ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .selectable(
                        selected = (text == selectedOption),
                        onClick = { onOptionSelected(text) },
                        role = Role.RadioButton
                    )
                    .padding(horizontal = 6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                androidx.compose.material3.RadioButton(
                    selected = (text == selectedOption),
                    onClick = null,
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color(0xFF6471FF),
                        unselectedColor = Color.Gray,
                        disabledSelectedColor = Color.LightGray,
                        disabledUnselectedColor = Color.DarkGray,
                    )
                )

                Text(
                    text = text,
                    fontFamily = jonefont,
                    color = Color.Black.copy(alpha = 0.50f),
                    modifier = Modifier.padding(start = 12.dp)
                )
            }
        }
    }
}


@Preview
@Composable
private fun my_preview89() {
    RadioButtonSingleSelection()
}