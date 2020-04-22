package com.gevondov.common.navigation

import androidx.fragment.app.FragmentFactory
import com.gevondov.feature.countries.view.CountriesViewImpl
import org.koin.core.KoinComponent
import org.koin.core.get

class CommonFragmentFactory : FragmentFactory(), KoinComponent {

    override fun instantiate(classLoader: ClassLoader, className: String) = when (className) {
        CountriesViewImpl::class.java.name -> get<CountriesViewImpl>()
        else -> super.instantiate(classLoader, className)
    }

}
