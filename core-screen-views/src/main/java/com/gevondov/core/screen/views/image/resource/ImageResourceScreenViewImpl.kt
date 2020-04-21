package com.gevondov.core.screen.views.image.resource

import android.widget.ImageView

class ImageResourceScreenViewImpl(
    private val imageView: ImageView
) : ImageResourceScreenView {

    override fun draw(value: Int?) {
        if (value != null) {
            imageView.setImageResource(value)
        } else {
            imageView.setImageDrawable(null)
        }
    }
}