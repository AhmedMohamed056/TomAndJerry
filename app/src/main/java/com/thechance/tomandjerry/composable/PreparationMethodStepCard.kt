package com.thechance.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.ui.theme.DetailsCardIconColor
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.TomKitchenPriceInfoCardColor
import com.thechance.tomandjerry.ui.theme.TomKitchenTextColor

@Composable
fun PreparationMethodStepCard(
    numberOfStep:String,
    stepDescription:String
){
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(
                            topEnd = 12.dp,
                            bottomEnd = 12.dp
                        )
                    )
                    .padding(vertical = 2.dp)
                    .padding(start = 28.dp)
                    .height(32.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stepDescription,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    fontFamily = IbmPlexSansArabic,
                    color = TomKitchenTextColor,
                    letterSpacing = 0.5.sp
                )
            }
        }
        Box(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = CircleShape
                )
                .border(
                    width = 1.dp,
                    color = TomKitchenPriceInfoCardColor,
                    shape = CircleShape
                )
                .size(36.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = numberOfStep,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = IbmPlexSansArabic,
                color = DetailsCardIconColor,
                letterSpacing = 0.5.sp
            )
        }
    }
}