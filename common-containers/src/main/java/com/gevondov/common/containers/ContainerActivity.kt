package com.gevondov.common.containers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gevondov.common.navigation.CommonFragmentFactory

class ContainerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory = CommonFragmentFactory()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)
    }
}
