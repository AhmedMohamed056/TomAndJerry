package com.thechance.tomandjerry.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.thechance.tomandjerry.R

@Composable
fun TomKitchenHeaderComponents(innerPadding: PaddingValues) {
    PastaPlateBox(innerPadding)
    Column (
        modifier = Modifier
            .width(width = 160.dp)
            .padding(innerPadding)
            .padding(top = 40.dp, start = 16.dp),
    ) {
        TomKitchenIconWithText(painterResource(R.drawable.ruler),"High tension")
        SpacerVertical16()
        TomKitchenIconWithText(painterResource(R.drawable.chef),"Shocking foods")
    }
}