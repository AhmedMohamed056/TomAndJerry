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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.DarkBlue
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.PrimaryColor


@Composable
fun CheapTomSection(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp, bottom = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Cheap tom section",
            fontFamily = IbmPlexSansArabic,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            color = PrimaryColor
        )
        Row(
            modifier = Modifier,
        ) {
            Text(
                modifier = Modifier.padding(end = 4.dp),
                text = "View all",
                fontFamily = IbmPlexSansArabic,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                color = DarkBlue
            )
            Icon(
                modifier = Modifier
                    .size(width = 12.dp, height = 12.dp)
                    .align(Alignment.CenterVertically),
                painter = painterResource(R.drawable.arrow_right_1),
                contentDescription = "arrow",
                tint = DarkBlue
            )
        }
    }
}