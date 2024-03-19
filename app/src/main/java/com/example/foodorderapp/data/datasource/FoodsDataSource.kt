package com.example.foodorderapp.data.datasource

import com.example.foodorderapp.R
import com.example.foodorderapp.data.model.Food

interface FoodsDataSource {
    fun getFoodData(): List<Food>
}

class FoodsDataSourceImpl() : FoodsDataSource {
    override fun getFoodData(): List<Food> {
        return mutableListOf(
            Food(
                image = R.drawable.food_cheese_burger,
                name = "Cheese Burger",
                price = 13000.0,
                desc = "Cheese Burger Description",
                location = "Jl. Toko Cheese Burger"
            ),
            Food(
                image = R.drawable.food_croissant,
                name = "Croissant",
                price = 10000.0,
                desc = "Croissant Description",
                location = "Jl. Toko Croissant"
            ),
            Food(
                image = R.drawable.food_dimsum,
                name = "Dimsum",
                price = 12000.0,
                desc = "Dimsum Description",
                location = "Jl. Toko Dimsum"
            ),
            Food(
                image = R.drawable.food_french_fries,
                name = "French Fries",
                price = 8000.0,
                desc = "French Fries Description",
                location = "Jl. Toko French Fries"
            ),
            Food(
                image = R.drawable.food_fried_chicken,
                name = "Fried Chicken",
                price = 15000.0,
                desc = "Fried Chicken Description",
                location = "Jl. Toko Fried Chicken"
            ),
            Food(
                image = R.drawable.food_grilled_chicken,
                name = "Grilled Chicken",
                price = 17000.0,
                desc = "Grilled Chicken Description",
                location = "Jl. Toko Grilled Chicken"
            ),
            Food(
                image = R.drawable.food_noodle,
                name = "Noodle",
                price = 10000.0,
                desc = "Noodle Description",
                location = "Jl. Toko Noodle"
            ),
            Food(
                image = R.drawable.food_spaghetti,
                name = "Spaghetti",
                price = 12000.0,
                desc = "Spaghetti Description",
                location = "Jl. Toko Spaghetti"
            ),
            Food(
                image = R.drawable.food_sushi,
                name = "Sushi",
                price = 20000.0,
                desc = "Sushi Description",
                location = "Jl. Toko Sushi"
            ),
        )
    }

}