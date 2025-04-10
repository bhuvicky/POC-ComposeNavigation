package com.example.poc_composenavigation

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.common.BottomBarScreen
import com.example.common.GraphRoute


@Composable
fun RootNavigationGraph(navController: NavHostController, featureListFactory: FeatureListFactory) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { BottomBar(navController = navController) }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            route = GraphRoute.ROOT,
            startDestination = GraphRoute.AUTHENTICATION
        ) {
//            println("xxxxx log navGraph = ${navController.graph}")
            featureListFactory.registerAll(this)
            /*authNavGraph(navController = navController)
            dashboardNavGraph(navController = navController)*/
        }
    }
}


@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Profile,
        BottomBarScreen.Settings,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    println("xxxxx log dashboard screen current route = ${currentDestination?.route}")

    val bottomBarDestination = currentDestination?.hierarchy?.any {
        it.route in listOf(screens[0].route, screens[1].route, screens[2].route)
    } == true
    println("xxxx log show b.n.b = $bottomBarDestination")
    if (bottomBarDestination) {
        NavigationBar {
            screens.forEach { screen ->
                AddItem(
                    screen = screen,
                    currentDestination = currentDestination,
                    navController = navController
                )
            }
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    NavigationBarItem(
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = "Navigation Icon"
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
//        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
            navController.navigate(screen.route) {
                /*popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true*/
                popUpTo(BottomBarScreen.Home.route) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true
            }
        }
    )
}

const val DASHBOARD_SCREEN = "dashboard_screen"