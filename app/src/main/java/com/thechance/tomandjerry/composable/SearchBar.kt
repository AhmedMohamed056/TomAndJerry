package com.thechance.tomandjerry.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.SearchTextColor

@Composable
fun SearchBar(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Card(
            modifier = Modifier
                .weight(1f),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(Color.White),
            border = BorderStroke(1.dp, Color(0x14A5A6A4))
        ) {
            Row(
                modifier = Modifier
                    .padding(12.dp)
                    .size(width = 248.dp, height = 24.dp)
            ) {
                val modifier = Modifier.padding(1.5.dp)
                Icon(
                    modifier = modifier,
                    painter = painterResource(R.drawable.search_normal),
                    contentDescription = "Search Icon",
                    tint = SearchTextColor
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    modifier = modifier.weight(1f),
                    text = "Search about tom ...",
                    color = SearchTextColor,
                    fontFamily = IbmPlexSansArabic,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                )
            }
        }
        FilterIcon()
    }
}