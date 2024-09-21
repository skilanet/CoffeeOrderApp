package com.example.coffeeorderapp.home.domain.models

import androidx.annotation.DrawableRes
import com.example.coffeeorderapp.R

sealed class ScreenTilesItems(
        val title: String,
        @DrawableRes val icon: Int
) {
    class Beverages(
            title: String,
            icon: Int
    ) : ScreenTilesItems(title, icon)

    class Food(
            title: String,
            icon: Int
    ) : ScreenTilesItems(title, icon)
}

val beverages = listOf(
        ScreenTilesItems.Beverages("Любимые напитки", R.drawable.cup_sig),
        ScreenTilesItems.Beverages("Холодный кофе", R.drawable.cup_coffee),
        ScreenTilesItems.Beverages("Горячий кофе", R.drawable.coffee),
        ScreenTilesItems.Beverages("Горячий шоколад", R.drawable.cup_choc),
)