package com.gevondov.feature.countries.model

import com.gevondov.common.models.feature.Country

interface CountriesModel {

    fun loadCountries(): List<Country>

}
