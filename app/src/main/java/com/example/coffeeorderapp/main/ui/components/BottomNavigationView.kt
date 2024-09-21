package com.example.coffeeorderapp.main.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.coffeeorderapp.main.ui.theme.LightGreen

@Composable
fun BottomNavigationView(navController: NavController = rememberNavController()) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val unSelectedColor = LightGreen
    val selectedColor = Color.White
    NavigationBar(
            modifier = Modifier.clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)),
            containerColor = Color.Black,
    ) {
        ScreenItems.entries.forEach { item ->
            NavigationBarItem(selected = currentRoute == item.name, onClick = {
                navController.navigate(item.name) {
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                }
            }, icon = {
                Icon(
                        painter = painterResource(item.iconId),
                        contentDescription = null,
                        tint = if (currentRoute == item.name) selectedColor else unSelectedColor,
                        modifier = Modifier.size(24.dp)
                )
            }, colors = NavigationBarItemColors(
                    selectedIconColor = selectedColor,
                    selectedTextColor = selectedColor,
                    disabledIconColor = unSelectedColor,
                    disabledTextColor = unSelectedColor,
                    selectedIndicatorColor = Color.Transparent,
                    unselectedIconColor = Color.Transparent,
                    unselectedTextColor = Color.Transparent
            )
            )
        }
    }
}

@Composable
@Preview
fun BottomNavigationViewPreview() {
    BottomNavigationView()
}