package com.example.foodorderapp.data.datasource

import com.example.foodorderapp.R
import com.example.foodorderapp.data.model.Food

interface FoodDataSource {
    fun getFoodData(): List<Food>
}

class FoodDataSourceImpl() : FoodDataSource {
    override fun getFoodData(): List<Food> {
        return mutableListOf(
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
            ),
        )
    }

}