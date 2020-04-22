package com.gevondov.feature.countries.di

import android.view.LayoutInflater
import com.gevondov.core.screen.views.list.ListScreenViewImpl
import com.gevondov.core.screen.views.text.TextScreenViewImpl
import com.gevondov.core.screen.views.toolbar.ToolbarScreenViewImpl
import com.gevondov.feature.countries.databinding.FeatureCountriesBinding
import com.gevondov.feature.countries.presenter.CountriesPresenter
import com.gevondov.feature.countries.presenter.CountriesPresenterImpl
import com.gevondov.feature.countries.screen.CountriesScreen
import com.gevondov.feature.countries.store.CountriesStateStore
import com.gevondov.feature.countries.view.CountriesViewImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val MODULE_COUNTRIES = module {

    factory {
        val viewScope = getKoin().createScope<CountriesViewImpl>()
        CountriesViewImpl(viewScope, viewScope.get(), viewScope.get())
    }

    scope<CountriesViewImpl> {

        scoped { FeatureCountriesBinding.inflate(LayoutInflater.from(androidContext())) }

        scoped<CountriesPresenter> { CountriesPresenterImpl(get()) }

        scoped { CountriesStateStore(get()) }

        scoped {
            val binding = get<FeatureCountriesBinding>()
            CountriesScreen(
                toolbarView = ToolbarScreenViewImpl(
                    titleView = TextScreenViewImpl(binding.toolbarTitle)
                ),
                countriesView = ListScreenViewImpl(binding.countries)
            )
        }

    }

}
