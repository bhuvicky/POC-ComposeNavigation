package com.example.common.navigation

sealed class DetailsScreen(val route: String) {
    object Information : DetailsScreen(route = Destination.INFORMATION)

    object Overview : DetailsScreen(route = "${Destination.OVERVIEW}/{${Arguments.OS_NAME}}/{${Arguments.OS_VERSION}}")  {
        fun createRoute(osName: String, osVersion: Int) = "${Destination.OVERVIEW}/$osName/$osVersion"
    }
}

