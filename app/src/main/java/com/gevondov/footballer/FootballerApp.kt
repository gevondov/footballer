package com.gevondov.footballer

import android.app.Application
import com.gevondov.common.di.DependencyInjectionGraphInitializer

class FootballerApp : Application() {

    override fun onCreate() {
        super.onCreate()
        DependencyInjectionGraphInitializer.initGraph(this)
    }

}
