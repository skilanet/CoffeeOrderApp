package com.example.coffeeorderapp.ui.components

import android.graphics.drawable.Icon
import androidx.compose.runtime.Composable

@Composable
fun BottomNavigationView() {}

private sealed interface BottomNavigationViewItems {
    data class Shop(val icon: Icon) : BottomNavigationViewItems
    data class Pay(val icon: Icon) : BottomNavigationViewItems
    data class User(val icon: Icon) : BottomNavigationViewItems
}