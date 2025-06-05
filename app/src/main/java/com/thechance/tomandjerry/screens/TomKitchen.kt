package com.thechance.tomandjerry.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.composable.ButtonStyle
import com.thechance.tomandjerry.composable.ProductNameContainer
import com.thechance.tomandjerry.composable.SpacerVertical16
import com.thechance.tomandjerry.composable.SpacerVertical24
import com.thechance.tomandjerry.composable.TomKitchenDetailsColumn
import com.thechance.tomandjerry.composable.TomKitchenHeaderComponents
import com.thechance.tomandjerry.composable.TomKitchenLazyColumn
import com.thechance.tomandjerry.composable.TomKitchenProductDescription
import com.thechance.tomandjerry.entity.PreparationMethodStepCardDummyItems
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.PrimaryColor
import com.thechance.tomandjerry.ui.theme.TomAndJerryTheme
import com.thechance.tomandjerry.ui.theme.TomKitchenCardColor
import com.thechance.tomandjerry.ui.theme.TomKitchenHeaderColor

@Composable
fun TomKitchen(innerPadding: PaddingValues) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
        .padding(innerPadding)
        ,
        contentAlignment = Alignment.TopStart
    ) {
        Icon(
            modifier = Modifier,
            painter = painterResource(R.drawable.ellipse2),
            contentDescription = "ellipse2",
            tint = Color.Unspecified
        )
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(color = TomKitchenHeaderColor)
            .padding(top = 162.dp)

    ) {
                TomKitchenLazyColumn(PreparationMethodStepCardDummyItems)
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding)
                .background(
                    color = Color.White
                )
                .border(
                    width = 1.dp,
                    color = PrimaryColor.copy(alpha = .12f)
                )
                .padding(horizontal = 16.dp, vertical = 15.dp),
        ) {
            ButtonStyle(text = "Add to cart", oldPrice = "5 cheeses", newPrice = "3 cheeses") {

            }
        }
    }
    TomKitchenHeaderComponents(innerPadding)
}

@Preview(showBackground = true)
@Composable
fun TomKitchenPreview() {
    TomAndJerryTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            TomKitchen(innerPadding)
        }
    }
}