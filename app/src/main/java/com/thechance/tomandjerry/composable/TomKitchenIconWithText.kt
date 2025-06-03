package com.thechance.tomandjerry.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic

@Composable
fun TomKitchenIconWithText(
    painter: Painter,
    title: String
){
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier
                .size(24.dp)
                .padding(end = 8.dp),
            painter = painter,
            contentDescription = "ruler",
            tint = Color.White
        )
        Text(
            text = title,
            fontWeight = FontWeight.Medium,
            fontFamily = IbmPlexSansArabic,
            color = Color(0xDEFFFFFF),
            fontSize = 16.sp,
            letterSpacing = 0.5.sp
        )
    }
}