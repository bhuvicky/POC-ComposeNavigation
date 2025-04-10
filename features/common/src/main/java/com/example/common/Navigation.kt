package com.example.common

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController

object GraphRoute {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
    const val PROFILE = "profile_graph"
    const val SETTINGS = "settings_graph"
    const val DETAILS = "details_graph"
}
/*
sealed class AuthScreen(val route: String) {
    object Login : AuthScreen(route = "LOGIN/{userId}") {
        fun createRoute(userId: Int) = "LOGIN/$userId"
    }
    object SignUp : AuthScreen(route = "SIGN_UP")
    object Forgot : AuthScreen(route = "FORGOT")
}*/

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "HOME",
        title = "HOME",
        icon = Icons.Default.Home
    )

    object Profile : BottomBarScreen(
        route = "PROFILE",
        title = "PROFILE",
        icon = Icons.Default.Person
    )

    object Settings : BottomBarScreen(
        route = "SETTINGS",
        title = "SETTINGS",
        icon = Icons.Default.Settings
    )
}

object Destination {
    const val INFORMATION_SCREEN = "information_screen"
}

/*sealed class DetailsScreen(val route: String) {
    object Information : DetailsScreen(route = "INFORMATION")
    object Overview : DetailsScreen(route = "OVERVIEW/{data}")  {
        fun createRoute(data: String) = "OVERVIEW/$data"
    }
}*/

val LocalNavController = compositionLocalOf<NavHostController> { error("No navController found") }