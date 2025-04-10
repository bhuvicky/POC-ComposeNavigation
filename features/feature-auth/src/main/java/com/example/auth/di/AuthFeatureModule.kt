package com.example.auth.di

import com.example.auth.AuthFeatureImpl
import com.example.common.Feature
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
abstract class AuthFeatureModule {

    @Binds
    @IntoSet
    abstract fun bindsAuthFeature(featureImpl: AuthFeatureImpl): Feature
}