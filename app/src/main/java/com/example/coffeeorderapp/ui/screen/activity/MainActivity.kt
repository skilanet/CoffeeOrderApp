package com.example.coffeeorderapp.ui.screen.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.coffeeorderapp.ui.screen.App
import com.example.coffeeorderapp.ui.theme.CoffeeOrderAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoffeeOrderAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPaddings ->
                    App(
                            Modifier.padding(
                                    innerPaddings
                            )
                    )
                }
            }
        }
    }
}

