package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class halorey : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Black)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Surface(
                    color = Color.Yellow,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Halo Reynaldi",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(8.dp,12.dp,12.dp,8.dp),
                        color = Color.Red
                    )
                }
                Surface(
                    color = Color.Blue,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Rada Diedankeun",
                        color = Color.White,
                        modifier = Modifier.padding(8.dp,10.dp,10.dp,8.dp)
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.oliver),
                    contentDescription = "Gambar"

                )

            }
        }
    }
}