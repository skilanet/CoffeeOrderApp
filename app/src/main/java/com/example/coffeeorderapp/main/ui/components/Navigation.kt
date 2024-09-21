package com.example.coffeeorderapp.main.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.coffeeorderapp.home.ui.HomeScreen
import com.example.coffeeorderapp.pay.ui.PayScreen
import com.example.coffeeorderapp.profile.ui.ProfileScreen
import com.example.coffeeorderapp.reviews.ui.ReviewsScreen

@Composable
fun Navigation(modifier: Modifier, navController: NavHostController = rememberNavController()){
    NavHost(
            navController = navController,
            startDestination = ScreenItems.Home.name,
            modifier = modifier
    ){
        composable(route = ScreenItems.Home.name) {
            HomeScreen(Modifier)
        }
        composable(route = ScreenItems.Pay.name) {
            PayScreen(Modifier)
        }
        composable(route = ScreenItems.Review.name) {
            ReviewsScreen(Modifier)
        }
        composable(route = ScreenItems.Profile.name) {
            ProfileScreen(Modifier)
        }
    }
}