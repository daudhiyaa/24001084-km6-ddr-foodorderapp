package com.example.foodorderapp.data.datasource

import com.example.foodorderapp.R
import com.example.foodorderapp.data.model.Category
import com.example.foodorderapp.data.model.Food

val categoryData = listOf<Category>(
    Category(image = R.drawable.category_rice2, name = "Rice"),
    Category(image = R.drawable.category_noodle, name = "Noodle"),
    Category(image = R.drawable.category_beverage3, name = "Beverage"),
    Category(image = R.drawable.category_dessert, name = "Dessert"),
    Category(image = R.drawable.category_snack2, name = "Snack")
)

val catalogueData = listOf<Food>(
    Food(
        image = R.drawable.food_cheese_burger,
        name = "Cheese Burger",
        price = 13000.0
    ),
    Food(
        image = R.drawable.food_croissant,
        name = "Croissant",
        price = 10000.0
    ),
    Food(
        image = R.drawable.food_dimsum,
        name = "Dimsum",
        price = 12000.0
    ),
    Food(
        image = R.drawable.food_french_fries,
        name = "French Fries",
        price = 8000.0
    ),
    Food(
        image = R.drawable.food_fried_chicken,
        name = "Fried Chicken",
        price = 15000.0
    ),
    Food(
        image = R.drawable.food_grilled_chicken,
        name = "Grilled Chicken",
        price = 17000.0
    ),
    Food(
        image = R.drawable.category_noodle,
        name = "Noodle",
        price = 10000.0
    ),
    Food(
        image = R.drawable.food_spaghetti,
        name = "Spaghetti",
        price = 12000.0
    ),
    Food(
        image = R.drawable.food_sushi,
        name = "Sushi",
        price = 20000.0
    )
)