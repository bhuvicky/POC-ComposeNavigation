package com.example.poc_composenavigation

import androidx.navigation.NavGraphBuilder
import com.example.common.Feature
import com.example.common.FeatureProvider
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FeatureListFactory @Inject constructor(
    private val features: Set<@JvmSuppressWildcards Feature>
): FeatureProvider {

    internal fun registerAll(navGraphBuilder: NavGraphBuilder) {
        features.forEach {
            println("xxxxx log Registering feature: ${it.javaClass.simpleName}")
            it.addNavGraph(navGraphBuilder)
        }
    }

    override fun <T : Feature> getFeature(clazz: Class<T>): T? {
        return features.firstOrNull { clazz.isInstance(it) } as? T
    }
}