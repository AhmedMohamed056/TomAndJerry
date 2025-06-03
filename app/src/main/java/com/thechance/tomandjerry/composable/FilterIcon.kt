package com.thechance.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.DarkBlue

@Composable
fun FilterIcon(){
    Box(
        modifier = Modifier
            .size(48.dp)
            .background(
                color = DarkBlue,
                shape = RoundedCornerShape(12.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier,
            painter = painterResource(R.drawable.filter_horizontal),
            contentDescription = "filter",
            tint = Color.White
        )
    }
}