package com.example.foodorderapp.presentation.fooddetail

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foodorderapp.data.model.Food
import com.example.foodorderapp.databinding.ActivityDetailBinding
import com.example.foodorderapp.utils.toIndonesianFormat

class FoodDetailActivity : AppCompatActivity() {
    private var totalPrice: Double = 0.0
    private var foodPrice: Double = 0.0
    private var totalFood: Int = 1

    companion object {
        const val EXTRAS_ITEM = "EXTRAS_ITEM"
    }

    private val binding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        handleBackBtn()
        handleCounterBtn()

        /* GET ALL DATA */
        val data = intent.extras?.getParcelable<Food>(EXTRAS_ITEM)

        /* Set Food Price */
        if (data != null) {
            foodPrice = data.price
            totalPrice = foodPrice
        }

        /* Set Content For ==== Detail Food ==== */
        binding.layoutDetailContent.layoutDetailFood.let {
            it.tvDetailFoodName.text = data?.name
            it.tvDetailFoodPrice.text =
                data?.price.toIndonesianFormat()
            it.tvDetailFoodDesc.text = data?.desc
        }

        /* Set Content For ==== Detail Banner ==== */
        if (data != null) {
            totalPrice = data.price
            binding.layoutDetailContent.layoutDetailBanner.ivBannerDetail.setImageResource(data.image)
        }

        /* Set Content For ==== Detail Location ==== */
        binding.layoutDetailContent.layoutDetailLocation.tvLocationDesc.text = data?.location

        /* Set Content For ==== Detail Add To Cart ==== */
        binding.layoutAddToCart.btnAddToCart.text =
            "Tambah ke Keranjang - ${totalPrice.toIndonesianFormat()}"

    }

    private fun handleCounterBtn() {
        binding.layoutAddToCart.let {
            it.btnIncrement.setOnClickListener {
                totalFood++
                totalPrice = totalFood * foodPrice
                binding.layoutAddToCart.btnAddToCart.text =
                    "Tambah ke Keranjang - ${totalPrice.toIndonesianFormat()}"
                binding.layoutAddToCart.tvQtyFood.text = totalFood.toString()
            }

            it.btnDecrement.setOnClickListener {
                if(totalFood > 1) totalFood--
                totalPrice = totalFood * foodPrice
                binding.layoutAddToCart.btnAddToCart.text =
                    "Tambah ke Keranjang - ${totalPrice.toIndonesianFormat()}"
                binding.layoutAddToCart.tvQtyFood.text = totalFood.toString()
            }
        }
    }

    private fun handleBackBtn() {
        binding.layoutDetailContent.layoutDetailBanner.btnBack.setOnClickListener {
            finish()
        }
    }
}