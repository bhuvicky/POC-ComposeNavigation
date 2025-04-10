package com.example.settings.di

import com.example.common.Feature
import com.example.settings.SettingsFeatureImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
abstract class SettingsFeatureModule {

    @Binds
    @IntoSet
    abstract fun bindsSettingsFeature(featureImpl: SettingsFeatureImpl): Feature
}