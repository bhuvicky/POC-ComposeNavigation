package com.example.poc_composenavigation.di

import com.example.common.FeatureProvider
import com.example.poc_composenavigation.FeatureListFactory
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class FeatureProviderModule {
    @Binds
    abstract fun bindFeatureProvider(factory: FeatureListFactory): FeatureProvider
}