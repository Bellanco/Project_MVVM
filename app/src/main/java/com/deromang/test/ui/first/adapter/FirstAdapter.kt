package com.deromang.test.ui.first.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.deromang.test.model.ListResponseModel

class FirstAdapter(
    private val context: Context,
    private val listener: FirstViewHolder.OnItemClickListener
) :
    RecyclerView.Adapter<FirstViewHolder>() {

    private val modelList: MutableList<ListResponseModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder =
        FirstViewHolder.from(parent, listener)

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.bindView(modelList[position], context)
    }

    override fun getItemCount(): Int = modelList.size

    fun addAll(models: MutableList<ListResponseModel>){
        modelList.clear()
        modelList.addAll(models)
        notifyDataSetChanged()
    }

}