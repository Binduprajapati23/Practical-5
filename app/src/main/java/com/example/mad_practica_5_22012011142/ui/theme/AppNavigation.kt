package com.example.mad_practica_5_22012011142.ui.theme

import com.example.mad_practica_5_22012011142.Screen.Login




import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        // Login screen
        composable("login") {
            Login(onSignUpClick = { navController.navigate("register") })
        }
        // Register screen
        composable("register") {
            RegisterPage(onLoginClick = { navController.navigate("login") })
        }
    }
}

@Composable
fun RegisterPage(onLoginClick: () -> Unit) {

}
