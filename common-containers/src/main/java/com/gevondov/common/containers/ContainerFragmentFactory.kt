package com.gevondov.common.containers

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import org.koin.core.KoinComponent
import org.koin.core.get

class ContainerFragmentFactory : FragmentFactory(), KoinComponent {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return if (className == ContainerFragment::class.java.name) {
            ContainerFragment(get())
        } else {
            super.instantiate(classLoader, className)
        }
    }

}
