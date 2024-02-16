package com.emmutua.applicationone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CreateAccount(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Create Account")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Fill your information below or register with your social account")
        Text(text = "Name")
        MyTextField(value = "")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Email")
        MyTextField(value = "")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Password")
        TextField(modifier = Modifier.fillMaxWidth(),value = "", onValueChange = {}, trailingIcon = { IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.visibility), contentDescription = "")
        }})
        Row {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector =  Icons.Default.CheckCircle, contentDescription = "")

            }
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Agreee with terms and cond")
            }
        }
        Button(modifier = Modifier.fillMaxWidth(),onClick = { /*TODO*/ }) {
            Text(text = "Sign Up")
        }
    }
}

@Composable
fun MyTextField(value : String) {
    TextField(modifier = Modifier.fillMaxWidth(),value = value, onValueChange = {})
}

@Preview(showSystemUi = true)
@Composable
fun MyPrevFun() {
    CreateAccount()
}