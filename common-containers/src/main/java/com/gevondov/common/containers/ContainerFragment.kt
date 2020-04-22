package com.gevondov.common.containers

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.gevondov.common.navigation.CommonFragmentFactory

class ContainerFragment(
    private val commonFragmentFactory: CommonFragmentFactory
) : NavHostFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        childFragmentManager.fragmentFactory = commonFragmentFactory
        super.onCreate(savedInstanceState)
    }

}
