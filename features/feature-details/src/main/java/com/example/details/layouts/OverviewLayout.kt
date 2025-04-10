package com.example.details.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.common.navigation.Destination
import com.example.details.viewModels.OverviewViewModel
import kotlin.toString

@Composable
fun OverviewLayout() {
    val viewModel = hiltViewModel<OverviewViewModel>()
    Column(
        modifier = Modifier.fillMaxSize().background(Color.LightGray),
                verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = Destination.OVERVIEW.uppercase(),
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )

        Row(modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = viewModel.osName.toString(),
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = MaterialTheme.typography.headlineLarge.fontSize,
                fontWeight = FontWeight.Bold
            )

            Text(
                modifier = Modifier.padding(start = 16.dp),
                text = viewModel.osVersion.toString(),
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = MaterialTheme.typography.headlineLarge.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
    }
}