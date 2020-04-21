package com.gevondov.feature.countries.presenter

import com.gevondov.common.models.feature.Country
import com.gevondov.feature.countries.store.CountriesStateStore

class CountriesPresenterImpl(
    private val stateStore: CountriesStateStore
) : CountriesPresenter {

    fun init() {
        stateStore.applyState(
            toolbarTitle = "Countries",
            countries = (1..10).map { Country("Country $it") }
        )
    }

    fun onCountries(countries: List<Country>) {
        stateStore.applyState(
            countries = countries
        )
    }


}
