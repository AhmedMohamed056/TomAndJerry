package com.thechance.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.thechance.tomandjerry.entity.CheapTomCardItem
import com.thechance.tomandjerry.ui.theme.JerryStoreScreenColor

@Composable
fun CheapTomGrid(cheapTomCardItems: List<CheapTomCardItem>, innerPadding: PaddingValues) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(color = JerryStoreScreenColor)
            .padding(innerPadding)
            .padding(horizontal = 16.dp, vertical = 2.dp)
    ) {
        item(span = { GridItemSpan(maxLineSpan) }) {
            TopAppBar()
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
                SearchBar()
        }

        item(span = { GridItemSpan(maxLineSpan) }) {
            PromotionBanner()
        }
        item(span = { GridItemSpan(maxLineSpan) }) {
            CheapTomSection()
        }
        items(cheapTomCardItems) { item ->
            CheapTomCard(
                imageResId = item.imageResId,
                title = item.title,
                subTitle = item.subTitle,
                oldPrice = item.oldPrice,
                currentPrice = item.currentPrice,
                modifier = Modifier
                    .size(width = item.imageWidth, height = item.imageHeight)
                    .offset(y = item.imageOffsetY)
            )
        }
    }
}