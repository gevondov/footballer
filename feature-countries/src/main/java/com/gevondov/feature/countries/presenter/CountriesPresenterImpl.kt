package com.gevondov.feature.countries.presenter

import com.gevondov.feature.countries.store.CountriesStateStore

class CountriesPresenterImpl(
    private val stateStore: CountriesStateStore
) : CountriesPresenter {

    init {
        stateStore.applyState(
            toolbarTitle = "Countries"
        )
    }

}
