package com.example.coffeeorderapp.main.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.coffeeorderapp.main.ui.components.BottomNavigationView
import com.example.coffeeorderapp.main.ui.components.Navigation

@Composable
fun App(modifier: Modifier){
    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomNavigationView(navController) }) { innerPaddings ->
        Navigation(modifier.padding(innerPaddings), navController)
    }
}

@Composable
@Preview
fun AppPreview(){
    App(Modifier)
}