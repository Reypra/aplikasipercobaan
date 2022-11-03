package com.example.testproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class StatefulActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EchoText()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EchoText() {
    Column {
        ->
        Text(text = "Bring Me The Horizon")
        OutlinedTextField(value = "Default Value", onValueChange = {})
    }
}