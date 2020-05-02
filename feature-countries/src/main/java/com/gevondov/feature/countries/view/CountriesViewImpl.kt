package com.gevondov.feature.countries.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gevondov.feature.countries.databinding.FeatureCountriesBinding
import com.gevondov.feature.countries.viewmodel.CountriesViewModel
import org.koin.androidx.viewmodel.scope.getViewModel
import org.koin.core.scope.Scope

class CountriesViewImpl(
    private val scope: Scope,
    private val binding: FeatureCountriesBinding
) : Fragment(), CountriesView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        scope.getViewModel<CountriesViewModel>(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return binding.root
    }

}
