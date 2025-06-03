package com.thechance.tomandjerry.composable

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun RowScope.SpacerRowWeight(){
    Spacer(modifier = Modifier.weight(1f))
}