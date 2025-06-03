package com.thechance.tomandjerry.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.DarkBlue
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.PrimaryColor
import com.thechance.tomandjerry.ui.theme.TomKitchenPriceInfoCardColor

@Composable
fun ProductNameContainer(){
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
        ) {
            Text(
                text = "Electric Tom pasta",
                fontWeight = FontWeight.Medium,
                fontFamily = IbmPlexSansArabic,
                fontSize = 20.sp,
                color = Color(0xDE1F1F1E),
                letterSpacing = 0.5.sp
            )
            SpacerVertical12()
            PriceInfoCard(currentPrice = "5", color = TomKitchenPriceInfoCardColor, modifier = Modifier.width(93.dp))
        }
        Icon(
            modifier = Modifier
                .size(24.dp)
                .align(Alignment.CenterVertically),
            tint = DarkBlue,
            painter = painterResource(R.drawable.favorite_icon),
            contentDescription = "favorite"
        )
    }
}