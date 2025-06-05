package com.thechance.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.PriceInfoCardColor
import com.thechance.tomandjerry.ui.theme.PrimaryColor
import com.thechance.tomandjerry.ui.theme.SearchTextColor
import com.thechance.tomandjerry.ui.theme.SecondaryColor

@Composable
fun CheapTomCard(
    imageResId: Int,
    title: String,
    subTitle: String,
    oldPrice: String? = null,
    currentPrice: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .background(
                color = Color.Transparent,
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        Column(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .height(height = 219.dp)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(16.dp)
                ),
            verticalArrangement = Arrangement.Bottom
        ) {
            Row(
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    PriceInfoCard(oldPrice, currentPrice, PriceInfoCardColor, modifier = Modifier.fillMaxWidth())
                }
                AddToCartIcon()
            }
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    modifier = modifier
                        .align(Alignment.TopCenter),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = imageResId),
                    contentDescription = "cheap tom card photo"
                )
            }
            Column(
                modifier = Modifier
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = title,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    fontFamily = IbmPlexSansArabic,
                    color = PrimaryColor,
                )
                Text(
                    text = subTitle,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    fontFamily = IbmPlexSansArabic,
                    color = SearchTextColor,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun PreviewCheapTomCard() {
    CheapTomCard(
        R.drawable.sport_tom,
        "Sport Tom",
        "He runs 1 meter... trips over his boot.",
        "5",
        "3"
    )
}