package com.example.foodordingappp.allscreenui.ButtonBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BookmarkIcon() {
    var isBookmarked by remember { mutableStateOf(false) }

    IconButton(
        onClick = { isBookmarked = !isBookmarked }
    ) {
        Icon(
            imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
            contentDescription = "Bookmark",
            tint = if (isBookmarked) Color(0xFF8791FF) else Color.White,
            modifier = Modifier
                .size(28.dp)
                .background(
                     color = if(isBookmarked) Color.White.copy(alpha = 0.7f) else Color.Black.copy(alpha = 0.4f),
                    shape = RoundedCornerShape(5.dp)
                )
                .padding(1.dp)
        )
    }
}


@Preview
@Composable
private fun my_preview84() {
    BookmarkIcon()
}