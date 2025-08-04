package com.example.designpattern.designpattern

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.designpattern.databinding.ItemTodolistBinding

class TodoListAdapter() :
    RecyclerView.Adapter<TodoListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding =
            ItemTodolistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.binding.apply {

        }
    }

    override fun getItemCount(): Int {
        return 0
    }

    inner class ViewHolder(val binding: ItemTodolistBinding) :
        RecyclerView.ViewHolder(binding.root)
}