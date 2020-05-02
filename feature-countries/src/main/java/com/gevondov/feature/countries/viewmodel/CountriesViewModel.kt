package com.gevondov.feature.countries.viewmodel

import androidx.lifecycle.ViewModel
import com.gevondov.feature.countries.model.CountriesModel
import com.gevondov.feature.countries.store.CountriesStateStore
import org.koin.core.scope.Scope

class CountriesViewModel(
    private val scope: Scope,
    private val stateStore: CountriesStateStore,
    private val model: CountriesModel
) : ViewModel() {

    init {
        stateStore.applyState(
            toolbarTitle = "Countries"
        )

        stateStore.applyState(
            countries = model.loadCountries()
        )
    }

    override fun onCleared() {
        super.onCleared()
        scope.close()
    }

}
