package com.thechance.tomandjerry.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.entity.Message.ITEM_ONE
import com.thechance.tomandjerry.entity.Message.ITEM_THREE
import com.thechance.tomandjerry.entity.Message.ITEM_TOW
import com.thechance.tomandjerry.entity.TomAccountData
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.PrimaryColor

@Composable
fun TomAccountContainer(
    tomAccountData: List<TomAccountData>,
    title: String,
){
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = title,
            fontFamily = IbmPlexSansArabic,
            fontSize = 20.sp,
            fontWeight = FontWeight.W700,
            color = Color(0xDE1F1F1E)
        )
        SpacerVertical8()
        TomAccountRow(painterResource(tomAccountData[ITEM_ONE].painter),tomAccountData[ITEM_ONE].title)
        SpacerVertical12()
        TomAccountRow(painterResource(tomAccountData[ITEM_TOW].painter),tomAccountData[ITEM_TOW].title)
        SpacerVertical12()
        TomAccountRow(painterResource(tomAccountData[ITEM_THREE].painter),tomAccountData[ITEM_THREE].title)
    }
}