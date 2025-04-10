package com.example.profile.di

import com.example.common.Feature
import com.example.profile.ProfileFeatureImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
abstract class ProfileFeatureModule {

    @Binds
    @IntoSet
    abstract fun bindsProfileFeature(featureImpl: ProfileFeatureImpl): Feature
}