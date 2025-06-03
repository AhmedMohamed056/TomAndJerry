package com.thechance.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic

@Composable
fun PromotionBanner(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color.Transparent,
                shape = RoundedCornerShape(16.dp)
            ),
        contentAlignment = Alignment.BottomCenter

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
                .height(height = 92.dp)
                .background(brush = Brush.linearGradient(
                    colors = listOf(Color(0xFF03446A),Color(0xFF0685D0))),
                    shape = RoundedCornerShape(16.dp)
                ),
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 12.dp, top = 12.dp, end = 12.dp, bottom = 12.dp)
                    .width(220.dp),
            ) {
                Text(
                    text = "Buy 1 Tom and get 2 for free",
                    fontFamily = IbmPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    fontSize = 16.sp,
                    maxLines = 1,
                )
                Text(
                    text = "Adopt Tom! (Free Fail-Free Guarantee)",
                    fontFamily = IbmPlexSansArabic,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xCCFFFFFF),
                    fontSize = 12.sp,
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
            ,
            contentAlignment = Alignment.TopEnd
        ) {
            Icon(
                modifier = Modifier
                    .size(width = 140.dp, height = 106.dp),
                painter = painterResource(R.drawable.ellipse1),
                contentDescription = "ellipse1",
                tint = Color.Unspecified
            )
        }
        Image(
            modifier = Modifier
                .size(width = 115.38.dp, height = 108.dp)
                .align(Alignment.TopEnd),
            painter = painterResource(R.drawable.tom_money_photo),
            contentDescription = "Tom holding money",
            contentScale = ContentScale.FillBounds
        )
    }
}