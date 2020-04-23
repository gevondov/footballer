package com.gevondov.feature.countries.presenter

import com.gevondov.feature.countries.model.CountriesModel
import com.gevondov.feature.countries.store.CountriesStateStore

class CountriesPresenterImpl(
    private val stateStore: CountriesStateStore,
    private val model: CountriesModel
) : CountriesPresenter {

    init {
        stateStore.applyState(
            toolbarTitle = "Countries"
        )

        stateStore.applyState(
            countries = model.loadCountries()
        )
    }

}
