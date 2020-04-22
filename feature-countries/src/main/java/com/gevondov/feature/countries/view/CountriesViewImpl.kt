package com.gevondov.feature.countries.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gevondov.feature.countries.databinding.FeatureCountriesBinding
import com.gevondov.feature.countries.presenter.CountriesPresenter
import org.koin.core.scope.Scope

class CountriesViewImpl(
    private val scope: Scope,
    private val binding: FeatureCountriesBinding,
    private val presenter: CountriesPresenter
) : Fragment(), CountriesView {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.close()
    }

}
