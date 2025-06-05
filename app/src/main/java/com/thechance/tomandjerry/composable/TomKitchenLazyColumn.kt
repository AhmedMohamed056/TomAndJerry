package com.thechance.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.entity.PreparationMethodStepCardItem
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.PrimaryColor
import com.thechance.tomandjerry.ui.theme.TomKitchenCardColor

@Composable
fun TomKitchenLazyColumn( preparationMethodStepCardDummyItems: List<PreparationMethodStepCardItem>){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = TomKitchenCardColor,
                shape = RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp)
            )
            .padding(start = 16.dp, end = 16.dp, bottom = 85.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item{
            SpacerVertical24()
        }
        item{
            ProductNameContainer()
        }
        item{
            TomKitchenProductDescription()
        }
        item{
            SpacerVertical16()
        }
        item{
            TomKitchenDetailsColumn()
        }
        item{
            SpacerVertical16()
        }
        item{
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Preparation method",
                    fontFamily = IbmPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    letterSpacing = 0.5.sp,
                    color = PrimaryColor
                )
            }
        }
        items(
            items = preparationMethodStepCardDummyItems,
            key = { item -> item.id }
        ) { item->
            PreparationMethodStepCard(
                numberOfStep = item.numberOfStep,
                stepDescription = item.stepDescription
            )
        }
    }
}