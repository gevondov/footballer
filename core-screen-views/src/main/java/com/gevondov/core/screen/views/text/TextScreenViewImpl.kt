package com.gevondov.core.screen.views.text

import android.widget.TextView

class TextScreenViewImpl(
    private val textView: TextView
) : TextScreenView {

    override fun draw(value: String?) {
        textView.text = value
    }

}
