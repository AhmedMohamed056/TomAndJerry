package com.thechance.tomandjerry.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.composable.SpacerHorizontal8
import com.thechance.tomandjerry.composable.SpacerVertical12
import com.thechance.tomandjerry.composable.SpacerVertical24
import com.thechance.tomandjerry.composable.SpacerVertical8
import com.thechance.tomandjerry.composable.TomAccountCard
import com.thechance.tomandjerry.composable.TomAccountContainer
import com.thechance.tomandjerry.composable.TomAccountRow
import com.thechance.tomandjerry.entity.TomAccountFavoriteFood
import com.thechance.tomandjerry.entity.TomAccountSettings
import com.thechance.tomandjerry.ui.theme.ButtonColor
import com.thechance.tomandjerry.ui.theme.ChaseTimeCardColor
import com.thechance.tomandjerry.ui.theme.HeartbrokenCardColor
import com.thechance.tomandjerry.ui.theme.HuntingTimeCardColor
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.PrimaryColor
import com.thechance.tomandjerry.ui.theme.TomAndJerryTheme
import com.thechance.tomandjerry.ui.theme.TomKitchenCardColor
import com.thechance.tomandjerry.ui.theme.TomKitchenDetailsSubTextColor
import com.thechance.tomandjerry.ui.theme.TomKitchenPriceInfoCardColor
import com.thechance.tomandjerry.ui.theme.whiteAlphaColor

@Composable
fun TomAccount(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(color = TomKitchenCardColor)
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = ButtonColor)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier
                        .padding(top = 14.dp)
                        .size(width = 113.dp, height = 146.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier
                            .size(64.dp)
                            .border(
                                1.dp,
                                color = Color(0x261F1F1E),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .clip(shape = RoundedCornerShape(12.dp)),
                        painter = painterResource(R.drawable.tom_account_img),
                        contentDescription = "tom",
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Tom ",
                        color = Color.White,
                        fontWeight = FontWeight.W500,
                        fontFamily = IbmPlexSansArabic,
                        fontSize = 18.sp,
                        letterSpacing = 0.sp
                    )
                    Text(
                        text = "specializes in failure!",
                        color = Color(0xCCFFFFFF),
                        fontWeight = FontWeight.W400,
                        fontFamily = IbmPlexSansArabic,
                        fontSize = 12.sp,
                        letterSpacing = 0.sp
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Box(
                        modifier = Modifier
                            .size(width = 97.dp, height = 25.dp)
                            .background(
                                color = whiteAlphaColor,
                                shape = RoundedCornerShape(40.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Edit foolishness",
                            color = Color.White,
                            fontWeight = FontWeight.Medium,
                            fontFamily = IbmPlexSansArabic,
                            fontSize = 10.sp,
                            letterSpacing = 0.sp
                        )
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = 42.dp),
                contentAlignment = Alignment.TopEnd
            ) {
                Icon(
                    painter = painterResource(R.drawable.background_shape1),
                    contentDescription = "back1",
                    tint = Color.Unspecified
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = 55.dp,(-54).dp),
                contentAlignment = Alignment.TopStart
            ) {
                Icon(
                    painter = painterResource(R.drawable.background_shape2),
                    contentDescription = "back1",
                    tint = Color.Unspecified
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 166.dp),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            color = TomKitchenCardColor,
                            shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp)
                        )
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                    ) {
                        Box(
                            modifier = Modifier.weight(1f)
                        ) {
                            TomAccountCard(
                                painterResource(R.drawable.no_of_quarrels),
                                "2M 12K",
                                "No. of quarrels",
                                TomKitchenPriceInfoCardColor
                            )
                        }
                        SpacerHorizontal8()
                        Box(
                            modifier = Modifier.weight(1f)
                        ) {
                            TomAccountCard(
                                painterResource(R.drawable.chase_time), "+500 h", "Chase time",
                                ChaseTimeCardColor
                            )
                        }
                    }
                    SpacerVertical8()
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .padding(bottom = 16.dp, start = 16.dp, end = 16.dp)
                    ) {
                        Box(
                            modifier = Modifier.weight(1f)
                        ) {
                            TomAccountCard(
                                painterResource(R.drawable.hunting_times),
                                "2M 12K",
                                "Hunting times",
                                HuntingTimeCardColor
                            )
                        }
                        SpacerHorizontal8()
                        Box(
                            modifier = Modifier.weight(1f)
                        ) {
                            TomAccountCard(
                                painterResource(R.drawable.heartbroken),
                                "3M 7K",
                                "Heartbroken",
                                HeartbrokenCardColor
                            )
                        }
                    }
                    SpacerVertical8()
                    TomAccountContainer(TomAccountSettings,"Tom settings")
                    SpacerVertical12()
                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth(),
                        thickness = 1.dp,
                        color = Color(0x14001A1F)
                    )
                    SpacerVertical12()
                    TomAccountContainer(TomAccountFavoriteFood,"His favorite foods")
                    SpacerVertical24()
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "v.TomBeta",
                            fontFamily = IbmPlexSansArabic,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            color = TomKitchenDetailsSubTextColor
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TomAccountPreview() {
    TomAndJerryTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            TomAccount(innerPadding)
        }
    }
}