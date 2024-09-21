package com.example.coffeeorderapp.home.ui

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeorderapp.home.domain.models.ScreenTilesItems
import com.example.coffeeorderapp.home.domain.models.beverages
import com.example.coffeeorderapp.main.ui.theme.DarkGreen

@Composable
fun HomeScreen(modifier: Modifier) {
    Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
                text = "Home", color = Color.DarkGray
        )
    }
}

@Composable
fun SelectTiles(
        onItemClick: () -> Unit = {},
        onViewAllItemClick: () -> Unit = {},
        items: List<ScreenTilesItems>
) {
    val titleText = if (items[0] is ScreenTilesItems.Beverages) "Напитки" else "Еда"
    Column {
        Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 4.dp)
        ) {
            Text(
                    text = titleText, color = Color.Black, fontSize = 24.sp
            )
            Spacer(Modifier.weight(1f))
            Text(
                    text = "Показать больше",
                    maxLines = 1,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .wrapContentHeight()
                        .clickable(enabled = true) { onViewAllItemClick() },
                    color = DarkGreen,
            )
        }
        LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(4.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(items) { item ->
                Tile(item = item)
            }
        }
    }
}

@Composable
fun Tile(
        modifier: Modifier = Modifier,
        onItemClick: () -> Unit = {},
        item: ScreenTilesItems
) {
    Row(
            modifier = modifier
                .background(Color.LightGray, RoundedCornerShape(24.dp))
                .padding(6.dp),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
                painter = painterResource(item.icon),
                contentDescription = null,
                modifier = Modifier
                    .clip(
                            CircleShape
                    )
                    .background(Color.White)
                    .padding(4.dp)
        )
        Text(text = item.title, modifier = Modifier.padding(horizontal = 6.dp))
    }
}


@Preview(showBackground = true, widthDp = 400)
@Composable
private fun SelectTilesPreview() {
    SelectTiles(items = beverages)
}

@Preview
@Composable
private fun TilePreview() {
    Tile(item = beverages[0])
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen(modifier = Modifier)
}