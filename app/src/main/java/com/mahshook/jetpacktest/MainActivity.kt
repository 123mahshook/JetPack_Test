package com.mahshook.jetpacktest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingText(name = "world")

        }
    }
}

@Composable
fun GreetingText(name: String) {
    Text(text = "Hello $name!",
        modifier = Modifier
            .height(240.dp)
            .width(2000.dp)
            .padding(all = 24.dp)
            .clickable(
                onClick = {}
            ),
        style = MaterialTheme.typography.button
        /*TextStyle(
            color = Color.Green,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp
        )*/


        )
}



@Preview(showBackground = true)
@Composable
fun DefaultPreviewMainActivity() {
    GreetingText(name = "world")
}