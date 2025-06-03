package com.thechance.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.TomKitchenDetailsSubTextColor
import com.thechance.tomandjerry.ui.theme.TomKitchenPriceInfoCardColor
import com.thechance.tomandjerry.ui.theme.TomKitchenTextColor

@Composable
fun TomAccountCard(
    painter: Painter,
    title:String,
    subTitle: String,
    cardColor: Color
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = cardColor,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(start = 12.dp, end = 10.dp, top = 8.dp, bottom = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.size(40.dp),
                painter = painter,
                contentDescription = "evil",
                tint = Color.Unspecified
            )
            SpacerHorizontal10()
            Column(
                modifier = Modifier,
            ) {
                Text(
                    text = title,
                    fontWeight = FontWeight.W600,
                    fontFamily = IbmPlexSansArabic,
                    fontSize = 16.sp,
                    color = TomKitchenTextColor,
                    style = TextStyle(
                        lineHeight = 16.sp,
                        lineHeightStyle = LineHeightStyle(
                            alignment = LineHeightStyle.Alignment.Top,
                            trim = LineHeightStyle.Trim.None
                        )
                    )
                )
                Text(
                    text = subTitle,
                    fontWeight = FontWeight.W500,
                    fontFamily = IbmPlexSansArabic,
                    fontSize = 12.sp,
                    color = TomKitchenDetailsSubTextColor,
                    style = TextStyle(
                        lineHeight = 16.sp,
                        lineHeightStyle = LineHeightStyle(
                            alignment = LineHeightStyle.Alignment.Top,
                            trim = LineHeightStyle.Trim.None
                        )
                    )
                )
            }
        }
    }
}