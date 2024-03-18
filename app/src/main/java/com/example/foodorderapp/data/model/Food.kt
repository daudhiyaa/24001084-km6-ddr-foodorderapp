package com.example.foodorderapp.data.model

import androidx.annotation.DrawableRes
import java.util.UUID

data class Food(
    var id: String = UUID.randomUUID().toString(),
    @DrawableRes
    var image: Int,
    var name: String,
    var price: Double,
)
