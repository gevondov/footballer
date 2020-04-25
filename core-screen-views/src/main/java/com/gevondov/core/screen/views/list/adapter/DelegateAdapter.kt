package com.gevondov.core.screen.views.list.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gevondov.core.screen.views.list.ListValue

interface DelegateAdapter<VH : RecyclerView.ViewHolder, I : ListValue.Item> {

    fun canHandleItem(item: ListValue.Item): Boolean

    fun createViewHolder(parent: ViewGroup): VH

    fun bindViewHolder(holder: VH, item: I, payloads: List<String>?)

}
