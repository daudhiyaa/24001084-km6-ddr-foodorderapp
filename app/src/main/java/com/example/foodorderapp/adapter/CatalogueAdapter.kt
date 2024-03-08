package com.example.foodorderapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorderapp.databinding.ItemCatalogueBinding
import com.example.foodorderapp.model.Catalogue
import com.example.foodorderapp.utils.toIndonesianFormat

class CatalogueAdapter : RecyclerView.Adapter<CatalogueAdapter.CatalogueViewHolder>() {
    private val data = mutableListOf<Catalogue>()

    fun submitData(items: List<Catalogue>) {
        data.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogueViewHolder {
        return CatalogueViewHolder(
            ItemCatalogueBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CatalogueViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class CatalogueViewHolder(private val binding: ItemCatalogueBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Catalogue) {
            binding.ivCatalogueImage.setImageResource(item.image)
            binding.ivCatalogueName.text = item.name
            binding.ivCataloguePrice.text = item.price.toIndonesianFormat()
        }
    }
}