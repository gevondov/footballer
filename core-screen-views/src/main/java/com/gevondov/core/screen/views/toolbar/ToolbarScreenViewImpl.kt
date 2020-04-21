package com.gevondov.core.screen.views.toolbar

import com.gevondov.core.screen.views.image.resource.ImageResourceScreenView
import com.gevondov.core.screen.views.text.TextScreenView

class ToolbarScreenViewImpl(
    private val titleView: TextScreenView? = null,
    private val homeIconView: ImageResourceScreenView? = null,
    private val rightIconView: ImageResourceScreenView? = null
) : ToolbarScreenView {

    override fun draw(value: ToolbarValue?, payload: ToolbarPayload?) {
        if (payload == null) {
            titleView?.draw(value?.title)
            homeIconView?.draw(value?.homeIcon)
            rightIconView?.draw(value?.rightIcon)
        } else {
            if (payload.titleChanged) {
                titleView?.draw(value?.title)
            }
            if (payload.homeIconChanged) {
                homeIconView?.draw(value?.homeIcon)
            }
            if (payload.rightIconChanged) {
                rightIconView?.draw(value?.rightIcon)
            }
        }
    }
}
