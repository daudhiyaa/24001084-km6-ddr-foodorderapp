package com.example.foodorderapp.data.datasource

import com.example.foodorderapp.R
import com.example.foodorderapp.data.model.Category

val categoriesData = listOf<Category>(
    Category(image = R.drawable.category_rice2, name = "Rice"),
    Category(image = R.drawable.category_noodle, name = "Noodle"),
    Category(image = R.drawable.category_beverage3, name = "Beverage"),
    Category(image = R.drawable.category_dessert, name = "Dessert"),
    Category(image = R.drawable.category_snack2, name = "Snack")
)