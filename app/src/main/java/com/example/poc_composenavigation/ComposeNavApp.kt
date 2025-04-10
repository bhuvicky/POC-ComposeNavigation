package com.example.poc_composenavigation

import android.app.Application
import com.example.common.FeatureRegistry
import com.example.poc_composenavigation.di.FeatureFactoryEntryPoint
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ComposeNavApp: Application() {

    override fun onCreate() {
        super.onCreate()

        val entryPoint = EntryPointAccessors.fromApplication(this,
            FeatureFactoryEntryPoint::class.java
        )
        FeatureRegistry.provider = entryPoint.featureListFactory()
    }
}