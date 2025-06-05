package com.thechance.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BadgedBox
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.DarkBlue
import com.thechance.tomandjerry.ui.theme.IbmPlexSansArabic
import com.thechance.tomandjerry.ui.theme.PrimaryColor
import com.thechance.tomandjerry.ui.theme.SecondaryColor

@Composable
fun NotificationIconWithBadge(){
    BadgedBox(
        modifier = Modifier
            .padding(8.dp)
            .offset(x = 8.dp),
        badge = {
            Box(
                modifier = Modifier.offset(y = (-3).dp)
            ) {
                Box(
                    modifier = Modifier
                        .background(DarkBlue, shape = CircleShape)
                        .size(14.dp, height = 15.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "3",
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.W500,
                        fontFamily = IbmPlexSansArabic,
                        style = TextStyle(
                            lineHeightStyle = LineHeightStyle(
                                alignment = LineHeightStyle.Alignment.Top,
                                trim = LineHeightStyle.Trim.Both
                            )
                        )
                    )
                }
            }
        }
    ) {
        Icon(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = PrimaryColor.copy(alpha = 0.15f),
                    shape = RoundedCornerShape(12.dp),
                )
                .padding(8.dp),
            painter = painterResource(R.drawable.notification_alert),
            contentDescription = "notification",

            )
    }
}