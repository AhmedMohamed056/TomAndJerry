package com.thechance.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.ui.theme.ButtonColor
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic

@Composable
fun ButtonStyle(
    text: String,
    oldPrice:String,
    newPrice:String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        colors = ButtonDefaults.buttonColors(ButtonColor),
        shape = RoundedCornerShape(16.dp),
        elevation = ButtonDefaults.buttonElevation(0.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = text,
                color = Color(0xDEFFFFFF),
                fontFamily = IbmPlexSansArabic,
                fontWeight = FontWeight.W500,
                fontSize = 16.sp
            )
            Box(
                modifier= Modifier
                    .size(5.dp)
                    .background(
                        color = Color(0x61FFFFFF),
                        shape = CircleShape
                    )
            ) {}
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = newPrice,
                    color = Color.White,
                    fontFamily = IbmPlexSansArabic,
                    fontWeight = FontWeight.W500,
                    fontSize = 14.sp
                )
                Text(
                    text = oldPrice,
                    color = Color(0xCCFFFFFF),
                    fontFamily = IbmPlexSansArabic,
                    fontWeight = FontWeight.W500,
                    fontSize = 12.sp,
                    textDecoration = TextDecoration.LineThrough
                )
            }
        }

    }
}