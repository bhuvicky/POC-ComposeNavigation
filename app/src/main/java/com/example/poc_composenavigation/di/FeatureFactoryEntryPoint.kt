package com.example.poc_composenavigation.di

import com.example.common.FeatureProvider
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface FeatureFactoryEntryPoint {
    fun featureListFactory(): FeatureProvider
}