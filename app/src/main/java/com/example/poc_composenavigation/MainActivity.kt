package com.example.poc_composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.common.LocalNavController
import com.example.poc_composenavigation.ui.theme.POCComposeNavigationTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var featureListFactory: FeatureListFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            POCComposeNavigationTheme {
                RootNavigationGraph(
                    navController = LocalNavController.current,
                    featureListFactory = featureListFactory
                )
            }
        }
    }
}