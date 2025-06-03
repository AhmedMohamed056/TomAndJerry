package com.thechance.tomandjerry.entity

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class CheapTomCardItem(
    val id: Int,
    val imageResId: Int,
    val title: String,
    val subTitle: String,
    val oldPrice: String? = null,
    val currentPrice: String,
    val imageWidth: Dp = 0.dp,
    val imageHeight: Dp = 0.dp,
    val imageOffsetX: Dp = 0.dp,
    val imageOffsetY: Dp = 0.dp
)
