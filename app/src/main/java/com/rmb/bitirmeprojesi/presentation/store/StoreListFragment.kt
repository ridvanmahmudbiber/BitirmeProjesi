package com.rmb.bitirmeprojesi.presentation.store

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.rmb.bitirmeprojesi.R
import com.rmb.bitirmeprojesi.adapter.StoreAdapter
import com.rmb.bitirmeprojesi.databinding.FragmentStoreListBinding
import com.rmb.bitirmeprojesi.model.StoreModel
import com.rmb.bitirmeprojesi.presentation.login.LoginFragmentDirections


class StoreListFragment : Fragment() {

    private var _binding: FragmentStoreListBinding? = null
    private val binding get() = _binding!!

    val storeList = listOf(
        StoreModel(
            productName = "Fıstıklı Baklava",
            storeLocation = "Istanbul",
            standardPrice = "599.99 TL",
            discountedPrice = "449.99 TL",
            discountRemaining = 2000000,
            storeName = "Aşçıbaşı",
            productImage = R.drawable.fistikli_baklava
        ),
        StoreModel(
            productName = "Ekler",
            storeLocation = "Istanbul",
            standardPrice = "299.99 TL",
            discountedPrice = "199.99 TL",
            discountRemaining = 3000000,
            storeName = "Şahin Pastanesi",
            productImage = R.drawable.ekler
        ),
        StoreModel(
            productName = "Ispanaklı Börek",
            storeLocation = "Istanbul",
            standardPrice = "399.99 TL",
            discountedPrice = "299.99 TL",
            discountRemaining = 6000000,
            storeName = "Sarıyer Börekçisi",
            productImage = R.drawable.ispanakli_borek
        ),
        StoreModel(
            productName = "Yaş Pasta",
            storeLocation = "Istanbul",
            standardPrice = "399.99 TL",
            discountedPrice = "299.99 TL",
            discountRemaining = 1600000,
            storeName = "Hakan Pastanesi",
            productImage = R.drawable.yas_pasta
        ),
        StoreModel(
            productName = "Kıymalı Börek",
            storeLocation = "Istanbul",
            standardPrice = "499.99 TL",
            discountedPrice = "399.99 TL",
            discountRemaining = 400000,
            storeName = "Meşhur Börekçi",
            productImage = R.drawable.kiymali_borek
        ),
        StoreModel(
            productName = "Soğuk Baklava",
            storeLocation = "Istanbul",
            standardPrice = "699.99 TL",
            discountedPrice = "549.99 TL",
            discountRemaining = 40000,
            storeName = "Kılıçoğlu Pastanesi",
            productImage = R.drawable.soguk_baklava
        ),
        StoreModel(
            productName = "Su Böreği",
            storeLocation = "Istanbul",
            standardPrice = "349.99 TL",
            discountedPrice = "274.99 TL",
            discountRemaining = 4000,
            storeName = "Börek Dünyası",
            productImage = R.drawable.suboregi
        ),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStoreListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvStoreList.layoutManager = LinearLayoutManager(requireContext())
        val storeAdapter = StoreAdapter(storeList,
            object : StoreItemClickListener {
                override fun onItemClick() {
                    findNavController().navigate(StoreListFragmentDirections.actionStoreListFragmentToStoreDetailFragment())
                }
            })
        binding.rvStoreList.adapter = storeAdapter

    }
}