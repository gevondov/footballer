package com.gevondov.feature.countries.model

import com.gevondov.common.models.feature.Country

// TODO Move implementation to separate module
class CountriesModelImpl : CountriesModel {

    override fun loadCountries() = (1..10).map { Country("Country $it") }

}
