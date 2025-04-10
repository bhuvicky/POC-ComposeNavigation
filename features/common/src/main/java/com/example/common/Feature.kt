package com.example.common

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder

interface Feature {

    /*
    * dynamically embedding a Composable from one feature into another
    *
    * */
    fun getMainComposable(params: Map<String, String>): ComposePage

    fun addNavGraph(navGraphBuilder: NavGraphBuilder)
}

data class ComposePage(val Page: @Composable () -> Unit)