package com.thechance.tomandjerry.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.DarkBlue
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.PriceInfoCardColor

@Composable
fun PriceInfoCard(oldPrice: String?=null,currentPrice:String,color: Color,modifier: Modifier){
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(color),
    ) {
        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(vertical = 6.dp, horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.padding(end = 4.dp),
                painter = painterResource(R.drawable.money_bag),
                contentDescription = "money bag",
                tint = DarkBlue
            )
                if (oldPrice != null) {
                    Box(
                        modifier = Modifier.padding(end = 1.dp),
                    ) {
                        Text(
                            text = oldPrice,
                            fontWeight = FontWeight.Medium,
                            fontFamily = IbmPlexSansArabic,
                            fontSize = 12.sp,
                            color = DarkBlue,
                            textDecoration = TextDecoration.LineThrough,
                            style = TextStyle(
                                lineHeightStyle = LineHeightStyle(
                                    alignment = LineHeightStyle.Alignment.Top,
                                    trim = LineHeightStyle.Trim.None
                                )
                            )
                        )
                    }
                }
                Text(
                    modifier = Modifier.padding(end = 1.dp),
                    text = currentPrice,
                    fontWeight = FontWeight.Medium,
                    fontFamily = IbmPlexSansArabic,
                    fontSize = 12.sp,
                    color = DarkBlue,
                    style = TextStyle(
                        lineHeightStyle = LineHeightStyle(
                            alignment = LineHeightStyle.Alignment.Top,
                            trim = LineHeightStyle.Trim.None
                        )
                    )
                )
                Text(
                    text = "cheeses",
                    fontWeight = FontWeight.Medium,
                    fontFamily = IbmPlexSansArabic,
                    fontSize = 12.sp,
                    color = DarkBlue,
                    style = TextStyle(
                        lineHeightStyle = LineHeightStyle(
                            alignment = LineHeightStyle.Alignment.Top,
                            trim = LineHeightStyle.Trim.None
                        )
                    )
                )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewPriceInfoCard(){
    PriceInfoCard(null,"3",PriceInfoCardColor, Modifier.fillMaxWidth())
}
