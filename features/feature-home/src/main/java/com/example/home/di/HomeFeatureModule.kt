package com.example.home.di

import com.example.common.Feature
import com.example.home.HomeFeatureImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
abstract class HomeFeatureModule {

    @Binds
    @IntoSet
    abstract fun bindsHomeFeature(featureImpl: HomeFeatureImpl): Feature
}