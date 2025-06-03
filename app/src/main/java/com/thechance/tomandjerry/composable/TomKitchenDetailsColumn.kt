package com.thechance.tomandjerry.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.PrimaryColor

@Composable
fun TomKitchenDetailsColumn(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.padding(bottom = 8.dp),
            text = "Details",
            fontSize = 18.sp,
            fontFamily = IbmPlexSansArabic,
            fontWeight = FontWeight.Medium,
            color = PrimaryColor.copy(alpha = 87f),
            letterSpacing = 0.5.sp
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.weight(1f)
            ) {
                DetailCard(painterResource(R.drawable.temperature),"1000 V","Temperature ")
            }
            SpacerHorizontal8()
            Box(
                modifier = Modifier.weight(1f)
            ) {
                DetailCard(painterResource(R.drawable.timer),"3 sparks","Time")
            }
            SpacerHorizontal8()
            Box(
                modifier = Modifier.weight(1f)
            ) {
                DetailCard(painterResource(R.drawable.evil),"1M 12K","No. of deaths")
            }
        }
    }
}