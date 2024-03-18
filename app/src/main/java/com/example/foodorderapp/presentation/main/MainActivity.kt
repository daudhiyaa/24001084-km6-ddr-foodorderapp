package com.example.foodorderapp.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foodorderapp.adapter.FoodsAdapter
import com.example.foodorderapp.adapter.CategoryAdapter
import com.example.foodorderapp.data.datasource.catalogueData
import com.example.foodorderapp.data.datasource.categoryData
import com.example.foodorderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val categoryAdapter = CategoryAdapter()
    private val foodsAdapter = FoodsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListCategory()
        setListCatalogue()
    }

    private fun setListCategory() {
        binding.rvCategory.apply {
            adapter = this@MainActivity.categoryAdapter
        }
        categoryAdapter.submitData(categoryData)
    }

    private fun setListCatalogue() {
        binding.rvCatalogue.apply {
            adapter = this@MainActivity.foodsAdapter
        }
        foodsAdapter.submitData(catalogueData)
    }
}