package com.example.details

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.common.ComposePage
import com.example.common.Destination
import com.example.common.DetailsFeature
import com.example.common.GraphRoute
import com.example.common.navigation.Arguments
import com.example.details.layouts.InformationLayout
import com.example.details.layouts.OverviewLayout
import com.example.common.navigation.DetailsScreen
import javax.inject.Inject

class DetailsFeatureImpl @Inject constructor(): DetailsFeature {

    override fun getMainComposable(params: Map<String, String>): ComposePage {
        return if (params["destination"] == Destination.INFORMATION_SCREEN) {
            ComposePage { InformationLayout() }
        } else {
            ComposePage { }
        }
    }

    override fun addNavGraph(navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.navigation(
            route = GraphRoute.DETAILS,
            startDestination = DetailsScreen.Information.route
        ) {
            composable(
                route = DetailsScreen.Information.route) {
                InformationLayout()
            }
            composable(route = DetailsScreen.Overview.route,
                arguments = listOf(
                    navArgument(Arguments.OS_NAME) { type = NavType.StringType },
                    navArgument(Arguments.OS_VERSION) { type = NavType.IntType }
                )) {
                OverviewLayout()
            }
        }
    }
}