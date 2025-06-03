package com.thechance.tomandjerry.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.TomKitchenTextColor

@Composable
fun TomKitchenProductDescription(){
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
            fontSize = 14.sp,
            fontWeight = FontWeight.W500,
            fontFamily = IbmPlexSansArabic,
            color = TomKitchenTextColor
        )
    }
}