package com.pedrobruno.meditationui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.pedrobruno.meditationui.ui.HomeScreen
import com.pedrobruno.meditationui.ui.theme.MeditationUiTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUiTheme {
                HomeScreen()
            }
        }
    }
}


@ExperimentalFoundationApi
@Preview
@Composable
fun previewHome(){
    HomeScreen()
}

