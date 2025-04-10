package com.example.details.viewModels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.common.navigation.Arguments
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OverviewViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
): ViewModel() {

    val osName = checkNotNull(savedStateHandle.get<String>(Arguments.OS_NAME))
    val osVersion = savedStateHandle.get<Int>(Arguments.OS_VERSION) ?: -1
}