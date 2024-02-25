package com.emmutua.applicationone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.emmutua.applicationone.ui.theme.ApplicationOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApplicationOneTheme {
                MemoriesApp()
            }
        }
    }
}

@Composable
fun MemoriesApp() {
    DetailedScreen()
}

@Preview(showSystemUi = true)
@Composable
fun PreviewMyCode() {
    MemoriesApp()
}

/**
 * Data - Remote/ Local
 * Domain - Bs logic -> Optional
 * UI - seen
 */