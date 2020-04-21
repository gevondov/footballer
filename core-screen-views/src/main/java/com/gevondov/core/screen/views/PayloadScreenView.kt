package com.gevondov.core.screen.views

interface PayloadScreenView<V, P> : ScreenView<V> {

    override fun draw(value: V?) {
        draw(value, null)
    }

    fun draw(value: V?, payload: P?)

}
