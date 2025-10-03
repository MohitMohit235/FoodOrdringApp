package com.example.foodordingappp.allscreenui.ButtonBar


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodordingappp.R


@Composable
fun PayMethod(
    radioOptions: List<String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit
) {

    val Lexend = FontFamily(
        Font(R.font.lexend_regular, FontWeight.Normal)
    )


    val imageMap = mapOf(
        "Credit Card" to R.drawable.img16,
        "Paypal" to R.drawable.img17,
        "Google Pay" to R.drawable.img10,
        "Apple pay" to R.drawable.img8,
        "COD(Cash On Delivery)" to R.drawable.img7
    )

    Column(modifier = Modifier.height(250.dp)) {
        radioOptions.forEach { text ->
            Row(
                Modifier
                    .width(350.dp)
                    .height(50.dp)
                    .selectable(
                        selected = (text == selectedOption),
                        onClick = { onOptionSelected(text) },
                        role = Role.RadioButton
                    )
                    .padding(horizontal = 6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Image(
                    painter = painterResource(id = imageMap[text] ?: R.drawable.ic_launcher_foreground),
                    contentDescription = text,
                    modifier = Modifier
                        .size(30.dp)
                        .padding(end = 8.dp)
                )


                Text(
                    text = text,
                    fontFamily = Lexend,
                    fontSize = 15.sp,
                    color = Color.Black.copy(alpha = 0.50f),
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 12.dp)
                )


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
            }
        }
    }
}



//============================Preview_Screen===================================


@Preview
@Composable
fun my_Preview7() {

    val options = listOf("Credit Card","Paypal","Google Pay", "Apple pay",  "COD(Cash On Delivery)")


    var selectedOption by remember { mutableStateOf(options[0]) }


    PayMethod(
        radioOptions = options,
        selectedOption = selectedOption,
        onOptionSelected = { selectedOption = it }
    )
}
