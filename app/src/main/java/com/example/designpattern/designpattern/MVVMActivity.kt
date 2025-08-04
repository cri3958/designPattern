package com.example.designpattern.designpattern

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.designpattern.databinding.ActivityTodolistBinding

class MVVMActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTodolistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTodolistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.todoListRecyclerview.apply {
            layoutManager = LinearLayoutManager(this@MVVMActivity)
            adapter = TodoListAdapter()
        }
    }
}