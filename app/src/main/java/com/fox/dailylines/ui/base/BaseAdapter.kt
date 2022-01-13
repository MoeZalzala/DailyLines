package com.fox.dailylines.ui.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.fox.dailylines.BR

abstract class BaseAdapter<T>(
    private var _items: List<T>
) : RecyclerView.Adapter<BaseAdapter.BaseViewHolder>() {

    abstract fun getLayoutID(): Int

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder =
        ItemViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                getLayoutID(),
                parent,
                false

            )
        )

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val currentItem = _items[position]
        when(holder){
            is ItemViewHolder ->{
               // holder.binding.setVariable(BR.item, currentItem)
            }
        }
    }

    override fun getItemCount(): Int {
        return _items.size
    }

    abstract class BaseViewHolder(val binding: ViewDataBinding) :
        RecyclerView.ViewHolder(binding.root)

    class ItemViewHolder(binding: ViewDataBinding) : BaseViewHolder(binding)
}