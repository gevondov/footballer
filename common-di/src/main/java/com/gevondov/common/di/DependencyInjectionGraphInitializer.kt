package com.gevondov.common.di

import android.app.Application
import com.gevondov.common.navigation.di.MODULE_NAVIGATION
import com.gevondov.feature.countries.di.MODULE_COUNTRIES
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

object DependencyInjectionGraphInitializer {

    fun initGraph(application: Application) {
        startKoin {
            androidContext(application)
            modules(
                MODULE_NAVIGATION,
                MODULE_COUNTRIES
            )
        }
    }

}
