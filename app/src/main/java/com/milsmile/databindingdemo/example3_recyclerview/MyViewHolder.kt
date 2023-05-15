package com.milsmile.databindingdemo.example3_recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.milsmile.databindingdemo.databinding.ItemRowBinding

class MyViewHolder(var itemRowBinding: ItemRowBinding) : RecyclerView.ViewHolder(itemRowBinding.root) {
    fun bind(m: DataModel){
        itemRowBinding.model = m
    }
}