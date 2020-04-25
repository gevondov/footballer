package com.gevondov.core.screen.views.list

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gevondov.core.screen.views.list.adapter.CompositeAdapter
import com.gevondov.core.screen.views.list.adapter.DelegateAdapter
import com.gevondov.core.screen.views.list.adapter.DelegateAdapterWrapper

class ListScreenViewImpl(
    private val recyclerView: RecyclerView,
    private val delegates: List<DelegateAdapter<*, *>>
) : ListScreenView {

    private val adapter = CompositeAdapter(delegates.map { DelegateAdapterWrapper(it) })

    init {
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
        recyclerView.adapter = adapter
    }

    override fun draw(value: ListValue?) {
        adapter.updateItems(value?.items ?: emptyList())
    }
}
