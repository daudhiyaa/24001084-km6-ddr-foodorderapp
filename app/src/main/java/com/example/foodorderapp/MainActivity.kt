package com.example.foodorderapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foodorderapp.adapter.CatalogueAdapter
import com.example.foodorderapp.adapter.CategoryAdapter
import com.example.foodorderapp.constant.catalogueData
import com.example.foodorderapp.constant.categoryData
import com.example.foodorderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val categoryAdapter = CategoryAdapter()
    private val catalogueAdapter = CatalogueAdapter()

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
            adapter = this@MainActivity.catalogueAdapter
        }
        catalogueAdapter.submitData(catalogueData)
    }
}