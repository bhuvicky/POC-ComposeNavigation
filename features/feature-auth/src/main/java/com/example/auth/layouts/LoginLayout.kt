package com.example.auth.layouts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.example.common.navigation.AuthScreen
import com.example.common.GraphRoute
import com.example.common.LocalNavController

@Composable
fun LoginLayout() {
    val navController = LocalNavController.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(GraphRoute.HOME) {
                    val startDestination = navController.graph.findStartDestination().id
                    popUpTo(startDestination) { inclusive = true }
                }
            },
            text = "LOGIN",
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier.clickable {
                navController.navigate(AuthScreen.SignUp.route)
            },
            text = "Sign Up",
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            fontWeight = FontWeight.Medium
        )
        Text(
            modifier = Modifier.clickable {
                navController.navigate(AuthScreen.Forgot.route)
            },
            text = "Forgot Password",
            fontSize = MaterialTheme.typography.bodyMedium.fontSize,
            fontWeight = FontWeight.Medium
        )
    }
}