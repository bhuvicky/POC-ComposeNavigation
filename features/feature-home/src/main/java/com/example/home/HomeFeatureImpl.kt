package com.example.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.common.BottomBarScreen
import com.example.common.ComposePage
import com.example.common.GraphRoute
import com.example.common.HomeFeature
import com.example.home.layouts.HomeScreen
import javax.inject.Inject

class HomeFeatureImpl @Inject constructor(): HomeFeature {

    override fun getMainComposable(params: Map<String, String>): ComposePage {
        return ComposePage { }
    }

    override fun addNavGraph(navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.navigation(
            route = GraphRoute.HOME,
            startDestination = BottomBarScreen.Home.route
        ) {
            composable(
                route = BottomBarScreen.Home.route
            ) {
                HomeScreen()
            }
            /*composable(
                route = com.example.poc_composenavigation.HomeFeature.Detail.route,
                arguments = listOf(
                    navArgument(DetailFeature.Argument.USER_ID) { type = NavType.StringType }
                )
            )*/
        }
    }
}