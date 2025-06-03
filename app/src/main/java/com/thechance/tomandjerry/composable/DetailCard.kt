package com.thechance.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.DetailsCardIconColor
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.TomKitchenDetailsSubTextColor
import com.thechance.tomandjerry.ui.theme.TomKitchenPriceInfoCardColor
import com.thechance.tomandjerry.ui.theme.TomKitchenTextColor

@Composable
fun DetailCard(
    painter: Painter,
    title: String,
    subTitle: String
){
    Box(
        modifier = Modifier
            .background(
                color = TomKitchenPriceInfoCardColor,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                modifier = Modifier.size(32.dp),
                painter = painter,
                contentDescription = "temperature",
                tint = DetailsCardIconColor,
            )
            SpacerVertical12()
            Text(
                text = title,
                fontFamily = IbmPlexSansArabic,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                letterSpacing = 0.5.sp,
                color = TomKitchenTextColor
            )
            Text(
                text = subTitle,
                fontFamily = IbmPlexSansArabic,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                letterSpacing = 0.5.sp,
                color = TomKitchenDetailsSubTextColor
            )
        }
    }
}