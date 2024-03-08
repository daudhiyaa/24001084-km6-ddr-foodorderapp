package com.example.foodorderapp.constant

import com.example.foodorderapp.R
import com.example.foodorderapp.model.Catalogue
import com.example.foodorderapp.model.Category

val categoryData = listOf<Category>(
    Category(image = R.drawable.category_rice2, name = "Rice"),
    Category(image = R.drawable.category_noodle, name = "Noodle"),
    Category(image = R.drawable.category_beverage3, name = "Beverage"),
    Category(image = R.drawable.category_dessert, name = "Dessert"),
    Category(image = R.drawable.category_snack2, name = "Snack")
)

val catalogueData = listOf<Catalogue>(
    Catalogue(image = R.drawable.catalogue_nasiliwetsolo, name = "Nasi Liwet", price = 10000.0),
    Catalogue(image = R.drawable.catalogue_selatsolo, name = "Selat Solo", price = 17000.0),
    Catalogue(image = R.drawable.catalogue_serabisolo, name = "Serabi Solo", price = 5000.0),
    Catalogue(image = R.drawable.catalogue_sosissolo, name = "Sosis Solo", price = 3000.0),
    Catalogue(image = R.drawable.catalogue_timlosolo, name = "Timlo Solo", price = 12000.0)
)