package com.example.foodorderapp.presentation.fooddetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorderapp.databinding.ActivityDetailBinding

class FoodDetailActivity : AppCompatActivity() {

    private val binding : ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}