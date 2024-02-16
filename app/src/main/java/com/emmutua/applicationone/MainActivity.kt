package com.emmutua.applicationone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.emmutua.applicationone.ui.theme.ApplicationOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApplicationOneTheme {
                CreateAccount()
            }
        }
    }
}

@Composable
fun MyApp(){
    Row {
        Text(text = "Hello")
        Text(text = "World")
    }

}


@Preview(showSystemUi = true)
@Composable
fun MyPrev() {
    CreateAccount()
}
