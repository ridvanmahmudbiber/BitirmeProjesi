package com.rmb.bitirmeprojesi.presentation.storedetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.rmb.bitirmeprojesi.adapter.ProductAdapter
import com.rmb.bitirmeprojesi.databinding.FragmentStoreDetailBinding
import com.rmb.bitirmeprojesi.model.ProductItem
import com.rmb.bitirmeprojesi.presentation.SharedViewModel

class StoreDetailFragment : Fragment() {
    private var _binding: FragmentStoreDetailBinding? = null
    private val binding get() = _binding!!

    private lateinit var sharedViewModel: SharedViewModel

    private lateinit var productAdapter: ProductAdapter

    private val args: StoreDetailFragmentArgs by navArgs()

    private var boughtedProductList: MutableList<ProductItem>? = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentStoreDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivStoreImage.setImageResource(args.storeItem.storeImage!!)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        sharedViewModel = ViewModelProvider(requireActivity())[SharedViewModel::class.java]

        productAdapter = ProductAdapter(
            productList = args.storeItem.productList!!,
            productItemClickListener = object : ProductItemClickListener {
                override fun onAddButtonClick(productItem: ProductItem) {
                    boughtedProductList?.add(productItem)
                    sharedViewModel.sendData(boughtedProductList?.toList())
                    Snackbar.make(
                        requireView(),
                        "Ürün sepetinize eklendi!",
                        Snackbar.LENGTH_SHORT
                    ).setAction("Action", null).show()
                }
            }
        )

        binding.rvProduct.apply {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = productAdapter
            setHasFixedSize(true)
        }
    }
}