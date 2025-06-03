package com.thechance.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.PrimaryColor
import com.thechance.tomandjerry.ui.theme.SecondaryColor

@Composable
fun TopAppBar(){
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(R.drawable.profile_image),
            contentDescription = "profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .size(48.dp)
        )
        Column(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.5.dp)
        ) {
            Text(
                text = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = IbmPlexSansArabic,
                color = PrimaryColor
            )
            Text(
                text = "Which Tom do you want to buy?",
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = IbmPlexSansArabic,
                color = SecondaryColor
            )
        }
        SpacerRowWeight()
        NotificationIconWithBadge()
    }
}