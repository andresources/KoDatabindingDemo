package com.milsmile.databindingdemo.example3_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.milsmile.databindingdemo.databinding.ItemRowBinding


class MyAdapter(private var list:MutableList<DataModel>,var context:Context) : DeleteClickListener,EditClickListener,RecyclerView.Adapter<MyViewHolder>(){
    private lateinit var binding: ItemRowBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list.get(position))
        holder.itemRowBinding.deleteClickListener = this
        holder.itemRowBinding.editClickListener = this
    }

    override fun editClicked(model: DataModel) {
        Toast.makeText(context,"Edit : "+model.androidName,Toast.LENGTH_LONG).show()
    }

    override fun deleteClicked(model: DataModel) {
        Toast.makeText(context,"Delete : "+model.androidName,Toast.LENGTH_LONG).show()
    }
}