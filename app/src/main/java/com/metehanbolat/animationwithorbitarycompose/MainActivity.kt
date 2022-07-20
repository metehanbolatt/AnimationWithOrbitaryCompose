package com.metehanbolat.animationwithorbitarycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.animationwithorbitarycompose.ui.theme.AnimationWithOrbitaryComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimationWithOrbitaryComposeTheme {
                
            }
        }
    }
}