package com.rmb.bitirmeprojesi.presentation.basket

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.rmb.bitirmeprojesi.adapter.BasketAdapter
import com.rmb.bitirmeprojesi.databinding.FragmentBasketBinding
import com.rmb.bitirmeprojesi.model.ProductItem
import com.rmb.bitirmeprojesi.presentation.SharedViewModel
import kotlinx.coroutines.flow.collectLatest
import java.math.BigDecimal
import java.math.RoundingMode


class BasketFragment : Fragment() {
    private var _binding: FragmentBasketBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModelShared: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBasketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelShared = ViewModelProvider(requireActivity())[SharedViewModel::class.java]

        lifecycleScope.launchWhenCreated {
            viewModelShared.sharedFlow.collectLatest {
                //Data or the word 'Hello' sent from Fragment A not being Received Here
                populateUI(it)
                setupRecycyler(it)
            }
        }

    }

    private fun populateUI(productList: List<ProductItem>?) {
        var totalPrice = 0.0
        productList?.forEach {
            val stringPrice = it.discountedPrice?.replace(" TL", "")
            totalPrice += stringPrice?.toDouble() ?: 0.0
        }
        with(binding) {
            if (productList.isNullOrEmpty().not()){
                val bigDecimal = BigDecimal(totalPrice).setScale(2, RoundingMode.HALF_EVEN)
                tvTotalPrice.text = bigDecimal.toString()
            }else{
                setGoneViews()
                llEmptyState.visibility = View.VISIBLE
            }

            btnBasketApprove.setOnClickListener {
                Snackbar.make(
                    requireView(),
                    "Siparişiniz hazırlanıyor!",
                    Snackbar.LENGTH_SHORT
                ).setAction("Action", null).show()
                setGoneViews()
                llEmptyState.visibility = View.VISIBLE
                viewModelShared.sendData(null)
            }
        }
    }

    private fun setupRecycyler(productList: List<ProductItem>?) {
        binding.rvProducts.layoutManager = LinearLayoutManager(requireContext())
        val storeAdapter = BasketAdapter(productList)
        binding.rvProducts.adapter = storeAdapter
    }

    private fun setGoneViews(){
        with(binding){
            btnBasketApprove.visibility = View.GONE
            rvProducts.visibility = View.GONE
            llTotalPrice.visibility = View.GONE
            view.visibility = View.GONE
        }
    }
}