package com.gevondov.common.navigation.di

import com.gevondov.common.navigation.CommonFragmentFactory
import org.koin.dsl.module

val MODULE_NAVIGATION = module {

    single { CommonFragmentFactory() }

}
