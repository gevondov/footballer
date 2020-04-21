package com.gevondov.core.screen.views.list

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListScreenViewImpl(
    private val recyclerView: RecyclerView
) : ListScreenView {

    init {
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
    }

    override fun draw(value: ListValue?) {

    }
}
