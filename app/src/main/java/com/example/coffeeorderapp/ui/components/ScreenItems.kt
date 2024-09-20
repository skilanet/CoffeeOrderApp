package com.example.coffeeorderapp.ui.components

import androidx.annotation.DrawableRes
import com.example.coffeeorderapp.R

enum class ScreenItems(@DrawableRes val iconId: Int) {
    Home(R.drawable.main),
    Pay(R.drawable.credit_card),
    Review(R.drawable.reviews),
    Profile(R.drawable.account)
}