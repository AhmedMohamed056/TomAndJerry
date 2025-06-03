package com.thechance.tomandjerry.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.thechance.tomandjerry.R
import com.thechance.tomandjerry.ui.theme.DarkBlue
import com.thechance.tomandjerry.ui.theme.SecondaryColor

@Composable
fun AddToCartIcon(){
    Icon(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = DarkBlue,
                shape = RoundedCornerShape(8.dp),
            )
            .padding(7.dp),
        painter = painterResource(R.drawable.add_to_cart_icon),
        contentDescription = "add to cart",
        tint = DarkBlue

        )
}