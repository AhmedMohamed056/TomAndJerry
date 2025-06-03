package com.thechance.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.thechance.tomandjerry.R

@Composable
fun PastaPlateBox(innerPadding: PaddingValues) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(innerPadding)
            .padding(top = 18.dp, end = 24.dp),
        contentAlignment = Alignment.TopEnd
    ) {
        Image(
            modifier = Modifier
                .size(width = 188.dp, height = 168.dp),
            painter = painterResource(R.drawable.pasta_plate),
            contentDescription = "pasta",
            contentScale = ContentScale.Crop
        )
    }
}