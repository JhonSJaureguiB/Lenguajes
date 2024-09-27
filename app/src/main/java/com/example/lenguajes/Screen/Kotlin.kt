package com.example.lenguajes.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Scaffold
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.lenguajes.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Kotlin(navController: NavController) {
    Scaffold (
        bottomBar = {
            BottomAppBar(
                content = {
                    IconButton(onClick = {
                        navController.navigate("java")
                    }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Java")
                    }

                    Spacer(modifier = Modifier.weight(1f))

                    IconButton(onClick = {
                        navController.navigate("home")
                    }) {
                        Icon(Icons.Default.Home, contentDescription = "Home")
                    }

                    Spacer(modifier = Modifier.weight(1f))

                    IconButton(onClick = {
                        navController.navigate("javaScript")
                    }) {
                        Icon(Icons.Default.ArrowForward, contentDescription = "JavaScript")
                    }
                }
            )

        }
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Kotlin",
                fontSize = 30.sp,
                color = Color.Magenta,
                modifier = Modifier.padding(16.dp))

            Image(
                painter = painterResource(id = R.drawable.kotlin),
                contentDescription = "Kotlin",
                modifier = Modifier.size(400.dp)
            )
            Box(modifier= Modifier
                .fillMaxWidth(0.9f)
                .align(Alignment.CenterHorizontally)){
                Text(text = "Lenguaje moderno para android, mas conciso y seguro que Java",
                    modifier = Modifier.padding(vertical = 8.dp)
                    ,
                    lineHeight = 20.sp
                )
            }
            Spacer(modifier = Modifier.height(26.dp))
            Text(text = "fun main() {\n" +
                    "    val greeting: String = \"Hola, Kotlin!\"\n" +
                    "    println(greeting)\n" +
                    "}\n")

        }
    }



}
