package com.example.week3odev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week3odev2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}