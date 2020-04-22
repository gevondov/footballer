package com.gevondov.common.containers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ContainerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory = ContainerFragmentFactory()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)
    }
}
