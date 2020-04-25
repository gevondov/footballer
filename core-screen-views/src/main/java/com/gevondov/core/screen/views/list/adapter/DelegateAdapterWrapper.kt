package com.gevondov.core.screen.views.list.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gevondov.core.screen.views.list.ListValue

internal class DelegateAdapterWrapper<VH : RecyclerView.ViewHolder, I : ListValue.Item>(
    private val delegateAdapter: DelegateAdapter<VH, I>
) {

    fun canHandleItem(item: ListValue.Item): Boolean {
        return delegateAdapter.canHandleItem(item)
    }

    fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return delegateAdapter.createViewHolder(parent)
    }

    @Suppress("UNCHECKED_CAST")
    fun bindViewHolder(holder: RecyclerView.ViewHolder, item: ListValue.Item, payloads: List<String>?) {
        delegateAdapter.bindViewHolder(holder as VH, item as I, payloads)
    }

}
