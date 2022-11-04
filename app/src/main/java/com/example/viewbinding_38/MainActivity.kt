package com.example.viewbinding_38

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewbinding_38.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val a = 150
    val b = 250

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAddition.setOnClickListener {
            val result = a + b
            binding.textView.text = "Результат сложения равен: $result"
        }

        binding.buttonSubtraction.setOnClickListener {
            val result2 = a - b
            binding.textView.text = "Результат вычитания равен: $result2"
        }

        binding.buttonMultiplication.setOnClickListener {
            val result3 = a * b
            binding.textView.text = "Результат умножения равен: $result3 "
        }
    }
}