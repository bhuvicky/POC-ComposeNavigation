package com.example.profile

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.common.BottomBarScreen
import com.example.common.ComposePage
import com.example.common.Feature
import com.example.common.GraphRoute
import com.example.common.ProfileFeature
import com.example.profile.layouts.ProfileScreen
import javax.inject.Inject

class ProfileFeatureImpl @Inject constructor(): ProfileFeature {

    override fun getMainComposable(params: Map<String, String>): ComposePage {
        return ComposePage { }
    }

    override fun addNavGraph(navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.navigation(
            route = GraphRoute.PROFILE,
            startDestination = BottomBarScreen.Profile.route
        ) {
            composable(
                route = BottomBarScreen.Profile.route
            ) {
                ProfileScreen()
            }
        }
    }
}