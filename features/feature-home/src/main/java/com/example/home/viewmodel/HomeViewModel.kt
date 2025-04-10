package com.example.home.viewmodel

import androidx.lifecycle.ViewModel
import com.example.common.ComposePage
import com.example.common.Destination
import com.example.common.DetailsFeature
import com.example.common.FeatureRegistry
import com.example.common.HomeFeature
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
) : ViewModel() {

    private val _composePage = MutableStateFlow<ComposePage?>(null)
    val composePage: StateFlow<ComposePage?> = _composePage.asStateFlow()

    fun loadInformationPage() {
        val detailsFeature = FeatureRegistry.getFeature(DetailsFeature::class.java)
        _composePage.value = detailsFeature?.getMainComposable(mapOf("destination" to Destination.INFORMATION_SCREEN))
    }
}