package com.example.foodorderapp.model

import androidx.annotation.DrawableRes
import java.util.UUID

data class Catalogue(
    var id: String = UUID.randomUUID().toString(),
    @DrawableRes
    var image: Int,
    var name: String,
    var Price: Double,
)
