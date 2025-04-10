package com.example.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.auth.layouts.ForgotPasswordLayout
import com.example.auth.layouts.LoginLayout
import com.example.auth.layouts.SignupLayout
import com.example.common.navigation.AuthScreen
import com.example.common.AuthFeature
import com.example.common.ComposePage
import com.example.common.GraphRoute
import javax.inject.Inject

class AuthFeatureImpl @Inject constructor(): AuthFeature {


    override fun getMainComposable(params: Map<String, String>): ComposePage {
        return ComposePage { }
    }

    override fun addNavGraph(navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.navigation(
            route = GraphRoute.AUTHENTICATION,
            startDestination = AuthScreen.Login.route
        ) {
            composable(route = AuthScreen.Login.route) {
                LoginLayout()
            }
            composable(route = AuthScreen.SignUp.route) {
                SignupLayout()
            }
            composable(route = AuthScreen.Forgot.route) {
                ForgotPasswordLayout()
            }
        }

    }
}