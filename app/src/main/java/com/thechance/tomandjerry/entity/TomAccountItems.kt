package com.thechance.tomandjerry.entity

import com.thechance.tomandjerry.R

val TomAccountSettings = listOf(
    TomAccountData(
        painter = R.drawable.bed_single,
        title = "Change sleeping place"
    ),
    TomAccountData(
        painter = R.drawable.cat,
        title = "Meow settings"
    ),
    TomAccountData(
        painter = R.drawable.fridge,
        title = "Password to open the fridge"
    )
)
val TomAccountFavoriteFood = listOf(
    TomAccountData(
        painter = R.drawable.alert,
        title = "Mouses"
    ),
    TomAccountData(
        painter = R.drawable.hamburger,
        title = "Last stolen meal"
    ),
    TomAccountData(
        painter = R.drawable.sleeping_face,
        title = "Change sleep mood"
    )
)

 object Message{
    const val ITEM_ONE = 0
    const val ITEM_TOW = 1
    const val ITEM_THREE = 2
}