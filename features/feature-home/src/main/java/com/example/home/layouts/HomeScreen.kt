package com.example.home.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.common.BottomBarScreen
import com.example.common.GraphRoute
import com.example.common.LocalNavController
import com.example.common.navigation.DetailsScreen
import com.example.home.viewmodel.HomeViewModel

@Composable
fun HomeScreen() {
    val navController = LocalNavController.current
    val viewModel = hiltViewModel<HomeViewModel>()
    val composePage = viewModel.composePage.collectAsStateWithLifecycle()

    LaunchedEffect(Unit) {
        viewModel.loadInformationPage()
    }

    Column(
        modifier = Modifier.fillMaxSize().background(Color.LightGray),
//        contentAlignment = Alignment.Center
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier
//                .fillMaxWidth()
//                .fillMaxHeight(0.5f)
                .clickable {
                navController.navigate(DetailsScreen.Information.route)
            },
            text = BottomBarScreen.Home.route,
            textAlign = TextAlign.Center,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )

        composePage.value?.Page()

        Text(
            modifier = Modifier
//                .fillMaxWidth()
//                .fillMaxHeight(0.5f)
                .clickable {
                    navController.navigate(GraphRoute.DETAILS)
                },
            text = BottomBarScreen.Home.route,
            textAlign = TextAlign.Center,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}