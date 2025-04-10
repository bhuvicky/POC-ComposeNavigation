package com.example.details.di

import com.example.common.Feature
import com.example.details.DetailsFeatureImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
abstract class DetailsFeatureModule {

    @Binds
    @IntoSet
    abstract fun bindsDetailsFeature(featureImpl: DetailsFeatureImpl): Feature
}