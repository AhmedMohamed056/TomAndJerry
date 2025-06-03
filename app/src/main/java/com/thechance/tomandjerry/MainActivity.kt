package com.thechance.tomandjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.thechance.tomandjerry.screens.JerryStore
import com.thechance.tomandjerry.screens.SecretEpisodes
import com.thechance.tomandjerry.screens.TomAccount
import com.thechance.tomandjerry.screens.TomKitchen
import com.thechance.tomandjerry.ui.theme.TomAndJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomAndJerryTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //JerryStore(innerPadding)
                    //SecretEpisodes(innerPadding)
                    //TomAccount(innerPadding)
                    TomKitchen(innerPadding)
                }
            }
        }
    }
}