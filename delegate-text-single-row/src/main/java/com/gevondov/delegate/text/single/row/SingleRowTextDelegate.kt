package com.gevondov.delegate.text.single.row

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gevondov.core.screen.views.list.ListValue
import com.gevondov.core.screen.views.list.adapter.DelegateAdapter
import com.gevondov.delegate.text.single.row.databinding.DelegateSingleRowTextBinding

class SingleRowTextDelegate : DelegateAdapter {

    override fun canHandleItem(item: ListValue.Item) = item is SingleRowTextItem

    override fun createViewHolder(parent: ViewGroup) = SingleRowTextViewHolder(
        DelegateSingleRowTextBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun bindViewHolder(
        holder: RecyclerView.ViewHolder,
        item: ListValue.Item,
        payloads: List<String>?
    ) {
        require(holder is SingleRowTextViewHolder)
        require(item is SingleRowTextItem)
        holder.bind(item, payloads)
    }
}
