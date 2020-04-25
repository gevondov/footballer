package com.gevondov.delegate.text.single.row

import androidx.recyclerview.widget.RecyclerView
import com.gevondov.delegate.text.single.row.databinding.DelegateSingleRowTextBinding

class SingleRowTextViewHolder(
    private val binding: DelegateSingleRowTextBinding
) : RecyclerView.ViewHolder(
    binding.root
) {

    fun bind(item: SingleRowTextItem, payloads: List<String>?) {
        binding.text.text = item.text
    }

}
