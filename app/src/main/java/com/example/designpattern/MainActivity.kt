package com.example.designpattern

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.designpattern.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.designPatternRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = DesignPatternAdapter(DesignPatternEnum.entries.map {
                DesignPattern(it.name, it.exampleClass)
            })
        }
    }
}