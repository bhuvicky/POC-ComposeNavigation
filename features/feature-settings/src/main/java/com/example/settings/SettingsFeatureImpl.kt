package com.example.settings

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.common.BottomBarScreen
import com.example.common.ComposePage
import com.example.common.GraphRoute
import com.example.common.SettingsFeature
import com.example.settings.layouts.SettingsScreen
import javax.inject.Inject


class SettingsFeatureImpl @Inject constructor(): SettingsFeature {

    override fun getMainComposable(params: Map<String, String>): ComposePage {
        return ComposePage { }
    }

    override fun addNavGraph(navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.navigation(
            route = GraphRoute.SETTINGS,
            startDestination = BottomBarScreen.Settings.route
        ) {
            composable(
                route = BottomBarScreen.Settings.route
            ) {
                SettingsScreen()
            }
        }
    }
}