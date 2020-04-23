package com.gevondov.core.screen.views.list.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gevondov.core.screen.views.list.ListValue

interface DelegateAdapter {

    fun canHandleItem(item: ListValue.Item): Boolean

    fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun bindViewHolder(holder: RecyclerView.ViewHolder, item: ListValue.Item)

}
