package com.example.foodorderapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.foodorderapp.R
import com.example.foodorderapp.adapter.CategoryAdapter
import com.example.foodorderapp.adapter.FoodsAdapter
import com.example.foodorderapp.adapter.OnItemClickedListener
import com.example.foodorderapp.data.datasource.FoodsDataSource
import com.example.foodorderapp.data.datasource.FoodsDataSourceImpl
import com.example.foodorderapp.data.datasource.categoriesData
import com.example.foodorderapp.data.model.Food
import com.example.foodorderapp.databinding.FragmentFoodListBinding
import com.example.foodorderapp.presentation.fooddetail.FoodDetailActivity

class FoodListFragment : Fragment() {
    private lateinit var binding: FragmentFoodListBinding
    private var foodsAdapter: FoodsAdapter? = null
    private var isUsingGridMode: Boolean = true
    private val dataSource: FoodsDataSource by lazy {
        FoodsDataSourceImpl()
    }

    private val categoryAdapter = CategoryAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFoodListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindFoodList(true)
        setListCategory()
        setClickAction()
    }

    private fun setListCategory() {
        binding.rvCategory.apply {
            adapter = this@FoodListFragment.categoryAdapter
        }
        categoryAdapter.submitData(categoriesData)
    }

    private fun setClickAction() {
        binding.ibChangeMode.setOnClickListener {
            isUsingGridMode = !isUsingGridMode
            changeBtnIcon()
            bindFoodList(isUsingGridMode)
        }
    }

    private fun changeBtnIcon() {
        binding.ibChangeMode.setImageResource(if (isUsingGridMode) R.drawable.ic_grid else R.drawable.ic_list)
    }

    private fun bindFoodList(isUsingGrid: Boolean) {
        val listMode = if (isUsingGrid) FoodsAdapter.MODE_GRID else FoodsAdapter.MODE_LIST
        foodsAdapter =
            FoodsAdapter(
                listMode = listMode,
                listener = object : OnItemClickedListener<Food> {
                    override fun onItemClicked(item: Food) {
                        navigateToDetail(item)
                    }
                },
            )
        binding.rvFoodList.apply {
            adapter = this@FoodListFragment.foodsAdapter
            layoutManager = GridLayoutManager(requireContext(), if (isUsingGrid) 2 else 1)
        }
        foodsAdapter?.submitData(dataSource.getFoodData())
    }

    private fun navigateToDetail(item: Food) {
        val navController = findNavController()
        val bundle = bundleOf(Pair(FoodDetailActivity.EXTRAS_ITEM, item))
        navController.navigate(R.id.action_foodListFragment_to_foodDetailActivity, bundle)
    }
}