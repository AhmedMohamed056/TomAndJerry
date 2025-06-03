package com.thechance.tomandjerry.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.thechance.tomandjerry.composable.CheapTomGrid
import com.thechance.tomandjerry.entity.tomCardDummyItems
import com.thechance.tomandjerry.ui.theme.TomAndJerryTheme

@Composable
fun JerryStore(innerPadding: PaddingValues) {
    CheapTomGrid(tomCardDummyItems,innerPadding)
}

@Preview(showBackground = true)
@Composable
fun JerryStorePreview() {
    TomAndJerryTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            JerryStore(innerPadding)
        }
    }
}