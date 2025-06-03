package com.thechance.tomandjerry.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.thechance.tomandjerry.entity.PreparationMethodStepCardItem

@Composable
fun TomKitchenLazyColumn( preparationMethodStepCardDummyItems: List<PreparationMethodStepCardItem>){
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
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