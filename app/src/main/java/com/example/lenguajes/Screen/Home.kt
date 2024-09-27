package com.example.lenguajes.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lenguajes.R
import androidx.compose.foundation.layout.size

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun Home(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "LENGUAJES DE PROGRAMACION",
            fontSize = 30.sp,
            color = Color.Magenta,
            modifier = Modifier.padding(16.dp))
        Spacer(modifier = Modifier.height(26.dp))
        Image(
            painter = painterResource(id = R.drawable.lenguajes),
            contentDescription = "Lemguajes",
            modifier = Modifier.size(400.dp)
        )
        Row {
            Spacer(modifier = Modifier.weight(0.1f))
        Button(onClick = {
            navController.navigate("kotlin")
        }) {
            Text(text = "Kotlin")
        }
            Spacer(modifier = Modifier.weight(0.1f))
        Button(onClick = {
            navController.navigate("javaScript")
        }) {
            Text(text = "Java Script")
        }
            Spacer(modifier = Modifier.weight(0.1f))
        Button(onClick = {
            navController.navigate("mySQL")
        }) {
            Text(text = "MySQL")
        }
            Spacer(modifier = Modifier.weight(0.1f))
        Button(onClick = {
            navController.navigate("c++")
        }) {
            Text(text = "C++")
        }
            Spacer(modifier = Modifier.weight(0.1f))
        Button(onClick = {
            navController.navigate("java")
        }) {
            Text(text = "Java")
        }
            Spacer(modifier = Modifier.weight(0.1f))
        }

    }
}