package com.gevondov.common.di

import android.app.Application
import com.gevondov.feature.countries.di.COUNTRIES_MODULE
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

object DependencyInjectionGraphInitializer {

    fun initGraph(application: Application) {
        startKoin {
            androidContext(application)
            modules(
                COUNTRIES_MODULE
            )
        }
    }

}
