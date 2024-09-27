package com.example.lenguajes.Screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun navigationExample() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            Home(navController)
        }
        composable(
            route = "kotlin"
        ) { backStackEntry ->
            Kotlin(navController)
        }
        composable(route="javaScript") { backStackEntry ->
            JavaScript(navController)
        }
        composable(route="mySQL") { backStackEntry ->
            MySQL(navController)
        }
        composable(route="c++") { backStackEntry ->
            C(navController)
        }
        composable(route="java") { backStackEntry ->
           Java(navController)
        }

    }
}