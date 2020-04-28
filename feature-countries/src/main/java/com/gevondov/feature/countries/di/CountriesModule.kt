package com.gevondov.feature.countries.di

import android.view.LayoutInflater
import com.gevondov.core.screen.views.list.ListScreenViewImpl
import com.gevondov.core.screen.views.text.TextScreenViewImpl
import com.gevondov.core.screen.views.toolbar.ToolbarScreenViewImpl
import com.gevondov.delegate.text.single.row.SingleRowTextDelegate
import com.gevondov.feature.countries.databinding.FeatureCountriesBinding
import com.gevondov.feature.countries.model.CountriesModel
import com.gevondov.feature.countries.model.CountriesModelImpl
import com.gevondov.feature.countries.presenter.CountriesViewModel
import com.gevondov.feature.countries.screen.CountriesScreen
import com.gevondov.feature.countries.store.CountriesStateStore
import com.gevondov.feature.countries.view.CountriesViewImpl
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val MODULE_COUNTRIES = module {

    scope<CountriesViewImpl> {

        factory { CountriesViewImpl(this, get()) }

        viewModel { CountriesViewModel(this, get(), get()) }

        scoped { FeatureCountriesBinding.inflate(LayoutInflater.from(androidContext())) }

        scoped<CountriesModel> { CountriesModelImpl() }

        scoped { CountriesStateStore(get()) }

        scoped {
            val binding = get<FeatureCountriesBinding>()
            CountriesScreen(
                toolbarView = ToolbarScreenViewImpl(
                    titleView = TextScreenViewImpl(binding.toolbarTitle)
                ),
                countriesView = ListScreenViewImpl(binding.countries, listOf(
                    SingleRowTextDelegate()
                ))
            )
        }

    }

}
