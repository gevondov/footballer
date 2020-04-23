package com.gevondov.core.screen.views.list.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gevondov.core.screen.views.list.ListValue

class CompositeAdapter(
    private val delegates: List<DelegateAdapter>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items = emptyList<ListValue.Item>()

    fun updateItems(newItems: List<ListValue.Item>) {
        items = newItems
        notifyDataSetChanged() // TODO Add diffUtils
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        val item = items[position]
        val index = delegates.indexOfFirst { it.canHandleItem(item) }
        check(index != -1) { "There is no delegate for item=$item" }
        return index
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return delegates[viewType].createViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        val delegate = delegates.find { it.canHandleItem(item) }
        checkNotNull(delegate) { "There is no delegate for item=$item" }
        delegate.bindViewHolder(holder, item)
    }
}
