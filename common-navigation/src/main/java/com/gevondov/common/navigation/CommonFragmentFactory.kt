package com.gevondov.common.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.gevondov.feature.countries.view.CountriesViewImpl
import org.koin.core.KoinComponent
import org.koin.core.qualifier.TypeQualifier
import kotlin.reflect.KClass

class CommonFragmentFactory : FragmentFactory(), KoinComponent {

    override fun instantiate(classLoader: ClassLoader, className: String) = when (className) {
        CountriesViewImpl::class.java.name -> createFragment<CountriesViewImpl>()
        else -> super.instantiate(classLoader, className)
    }

    private inline fun <reified F : Fragment> createFragment(): F = createFragmentScope(F::class).get()

    private inline fun <reified F : Fragment> createFragmentScope(klass: KClass<F>) =
        getKoin().getOrCreateScope(klass.java.name, TypeQualifier(klass))

}
