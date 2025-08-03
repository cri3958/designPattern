package com.example.designpattern

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.designpattern.databinding.ItemDesignPatternBinding

class DesignPatternAdapter(private val list: List<DesignPattern>) :
    RecyclerView.Adapter<DesignPatternAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding =
            ItemDesignPatternBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.binding.apply{
            itemTextView.text = list.getOrNull(position)?.name ?: ""
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(val binding: ItemDesignPatternBinding) :
        RecyclerView.ViewHolder(binding.root)
}