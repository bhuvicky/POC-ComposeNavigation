package com.example.common.navigation


sealed class AuthScreen(val route: String) {
    object Login : AuthScreen(route = "${Destination.LOGIN}/{${Arguments.USER_ID}}") {
        fun createRoute(userId: Int) = "${Destination.LOGIN}/$userId"
    }
    object SignUp : AuthScreen(route = Destination.SIGN_UP)
    object Forgot : AuthScreen(route = Destination.FORGOT)
}

