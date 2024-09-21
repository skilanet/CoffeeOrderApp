package com.example.coffeeorderapp.reviews.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ReviewsScreen(modifier: Modifier) {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
                text = "Reviews",
                color = Color.Red
        )
    }
}

@Composable
@Preview(heightDp = 128, widthDp = 128)
fun ReviewsScreenPreview(){
    ReviewsScreen(Modifier)
}
