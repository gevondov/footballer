package com.gevondov.feature.countries.store

import com.gevondov.common.models.feature.Country
import com.gevondov.core.screen.views.toolbar.ToolbarPayload
import com.gevondov.core.screen.views.toolbar.ToolbarValue
import com.gevondov.feature.countries.screen.CountriesScreen
import com.gevondov.feature.countries.state.CountriesState

class CountriesStateStore(
    private val screen: CountriesScreen
) {

    private var state: CountriesState? = null

    fun applyState(
        toolbarTitle: String? = state?.toolbarTitle,
        countries: List<Country>? = state?.countries
    ) {
        val newState = state?.copy(
            toolbarTitle = toolbarTitle,
            countries = countries
        ) ?: CountriesState(
            toolbarTitle = toolbarTitle,
            countries = countries
        )
        applyState(newState)
    }

    private fun applyState(newState: CountriesState) {
        state?.let { oldState ->
            applyValue(oldState.toolbarTitle, newState.toolbarTitle, this::drawToolbarTitle)
            applyValue(oldState.countries, newState.countries, this::drawCountries)
        } ?: run {
            drawToolbarTitle(newState.toolbarTitle)
            drawCountries(newState.countries)
        }
        state = newState
    }

    private fun drawToolbarTitle(toolbarTitle: String?) {
        screen.toolbarView.draw(ToolbarValue(title = toolbarTitle), ToolbarPayload(titleChanged = true))
    }

    private fun drawCountries(countries: List<Country>?) {
    }

    // TODO Move to parent class
    private inline fun <V> applyValue(oldValue: V, newValue: V, applier: (V) -> Unit) {
        if (oldValue != newValue) {
            applier(newValue)
        }
    }

}
