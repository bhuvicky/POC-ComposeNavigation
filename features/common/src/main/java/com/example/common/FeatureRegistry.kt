package com.example.common

object FeatureRegistry {
    lateinit var provider: FeatureProvider

    fun <T : Feature> getFeature(clazz: Class<T>): T? = provider.getFeature(clazz)
}