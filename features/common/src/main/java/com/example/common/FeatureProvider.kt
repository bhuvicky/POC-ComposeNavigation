package com.example.common

interface FeatureProvider {
    fun <T : Feature> getFeature(clazz: Class<T>): T?
}