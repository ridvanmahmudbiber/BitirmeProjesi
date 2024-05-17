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
import com.rmb.bitirmeprojesi.model.ProductItem
import com.rmb.bitirmeprojesi.model.StoreModel


class StoreListFragment : Fragment() {

    private var _binding: FragmentStoreListBinding? = null
    private val binding get() = _binding!!

    val storeList = listOf(

        StoreModel(
            storeName = "Aşçıbaşı",
            location = "Sivas Merkez (5.6 km)",
            score = "4.0 (100+)",
            storeImage = R.drawable.fistikli_baklava,
            productList = listOf(
                ProductItem(
                    productName = "Ekmek Kadayıfı (250 gr.)",
                    noDiscountedPrice = 75.00,
                    discountedPrice = 150.00,
                    productImage = R.drawable.fistikli_baklava
                ),
                ProductItem(
                    productName = "Cevizli Midye (250 kg.)",
                    noDiscountedPrice = 116.00,
                    discountedPrice = 400.66,
                    productImage = R.drawable.fistikli_baklava
                ),
                ProductItem(
                    productName = "Soğuk Baklava (250 gr.)",
                    noDiscountedPrice = 130.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Sütlü Nuriye (250 gr.)",
                    noDiscountedPrice = 97.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kabak Tatlısı (250 gr.)",
                    noDiscountedPrice = 70.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                )
            )
        ),
        StoreModel(
            storeName = "Livam Pastanesi",
            location = "Sivas Merkez (1.5 km)",
            score = "3.0 (500+)",
            storeImage = R.drawable.ekler,
            productList = listOf(
                ProductItem(
                    productName = "Ekler (1 kg.)",
                    noDiscountedPrice = 429.99,
                    discountedPrice = 199.99,
                    productImage = R.drawable.ekler
                ),
                ProductItem(
                    productName = "Sütlü Nuriye (500 gr.)",
                    noDiscountedPrice = 349.00,
                    discountedPrice = 454.66,
                    productImage = R.drawable.fistikli_baklava
                ),
                ProductItem(
                    productName = "Meyveli Pasta (4 Kişilik)",
                    noDiscountedPrice = 340.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Pasta (8-10 Kişilik)",
                    noDiscountedPrice = 450.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tatlı Kuru Pasta (1kg.)",
                    noDiscountedPrice = 429.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tuzlu Kuru Pasta (1kg.)",
                    noDiscountedPrice = 429.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Özel Cevizli Baklava (500 gr.)",
                    noDiscountedPrice = 349.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                )
            )
        ),
        StoreModel(
            storeName = "Çiğ Köfteci Ömer Usta",
            location = "Sivas Merkez (2.6 km)",
            score = "4.4 (500+)",
            storeImage = R.drawable.ekler,
            productList = listOf(
                ProductItem(
                    productName = "Çiğ Köfte (250 gr.)",
                    noDiscountedPrice = 94.00,
                    discountedPrice = 299.99,
                    productImage = R.drawable.ispanakli_borek
                ),
                ProductItem(
                    productName = "Çiğ Köfte (500 gr.)",
                    noDiscountedPrice = 172.00,
                    discountedPrice = 454.66,
                    productImage = R.drawable.fistikli_baklava
                ),
                ProductItem(
                    productName = "Çiğ Köfte (750 gr.)",
                    noDiscountedPrice = 231.00,
                    discountedPrice = 454.66,
                    productImage = R.drawable.fistikli_baklava
                ),
                ProductItem(
                    productName = "Çiğ Köfte (1 kg.)",
                    noDiscountedPrice = 298.00,
                    discountedPrice = 454.66,
                    productImage = R.drawable.fistikli_baklava
                )
            )
        ),
        StoreModel(
            storeName = "Kampüs Pilav",
            location = "Cumhuriyet Üniversitesi Kampüsü (1.7 km)",
            score = "4.5 (2000+)",
            storeImage = R.drawable.yas_pasta,
            productList = listOf(
                ProductItem(
                    productName = "Nohutlu Pilav (Medium)",
                    noDiscountedPrice = 90.00,
                    discountedPrice = 299.99,
                    productImage = R.drawable.yas_pasta
                ),
                ProductItem(
                    productName = "Nohutlu Pilav (Large)",
                    noDiscountedPrice = 100.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tavuklu Nohutlu Pilav (Large)",
                    noDiscountedPrice = 145.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Nohutlu Pilav (Jumbo)",
                    noDiscountedPrice = 120.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tavuklu Nohutlu Pilav (Jumbo)",
                    noDiscountedPrice = 205.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                )
            )
        ),
        StoreModel(
            storeName = "Albatros Cafe & Restaurant",
            location = "Cumhuriyet Üniversitesi Kampüsü (1.2 km)",
            score = "4.1 (5000+)",
            storeImage = R.drawable.kiymali_borek,
            productList = listOf(
                ProductItem(
                    productName = "Beyaz Peynirli Gözleme",
                    noDiscountedPrice = 120.00,
                    discountedPrice = 399.99,
                    productImage = R.drawable.kiymali_borek
                ),
                ProductItem(
                    productName = "Patatesli Gözleme",
                    noDiscountedPrice = 120.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kaşarlı Gözleme",
                    noDiscountedPrice = 120.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kıymalı Gözleme",
                    noDiscountedPrice = 120.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Beyaz Peynirli Çi Börek (4 Adet)",
                    noDiscountedPrice = 140.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Patatesli Çi Börek (4 Adet)",
                    noDiscountedPrice = 140.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kaşarlı Çi Börek (4 Adet)",
                    noDiscountedPrice = 140.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kıymalı Çi Börek (4 Adet)",
                    noDiscountedPrice = 140.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                )
            )
        ),
        StoreModel(
            storeName = "Coffy",
            location = "Cumhuriyet Üniversitesi Kampüsü (2.3 km)",
            score = "3.5 (22)",
            storeImage = R.drawable.soguk_baklava,
            productList = listOf(
                ProductItem(
                    productName = "Çikolata Dolgulu Kruvasan",
                    noDiscountedPrice = 100.00,
                    discountedPrice = 549.99,
                    productImage = R.drawable.soguk_baklava
                ),
                ProductItem(
                    productName = "Çok Tahıllı Kruvasan",
                    noDiscountedPrice = 65.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tereyağlı Kruvasan",
                    noDiscountedPrice = 55.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Fındık Kremalı Kruvasan",
                    noDiscountedPrice = 65.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Karışık Sandviç (Sıcak)",
                    noDiscountedPrice = 100.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Peynirli Sandviç (Sıcak)",
                    noDiscountedPrice = 100.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Füme Etli Peynirli Bagel Sandviç",
                    noDiscountedPrice = 120.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Ezine Peynirli Focaccia Sandviç",
                    noDiscountedPrice = 120.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Köri Soslu & Tavuklu Baget Sandviç)",
                    noDiscountedPrice = 130.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Atem Bazlama Sandviç)",
                    noDiscountedPrice = 120.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Cookie)",
                    noDiscountedPrice = 65.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Donut)",
                    noDiscountedPrice = 65.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çilekli Cookie)",
                    noDiscountedPrice = 65.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Muffin)",
                    noDiscountedPrice = 80.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Mozaik Kek (Dilim)",
                    noDiscountedPrice = 90.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Limonlu Cheesecake",
                    noDiscountedPrice = 110.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Frambuazlı Cheesecake",
                    noDiscountedPrice = 110.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tiramisu",
                    noDiscountedPrice = 90.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Orman Meyveli Pasta",
                    noDiscountedPrice = 95.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Cookie Crumble Donut",
                    noDiscountedPrice = 70.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                )
            )
        ),
        StoreModel(
            storeName = "Hamur Abla Ev Yemekleri",
            location = "Sivas Merkez (3.2 km)",
            score = "3.6 (10000+)",
            storeImage = R.drawable.suboregi,
            productList = listOf(
                ProductItem(
                    productName = "Mercimek Çorbası",
                    noDiscountedPrice = 55.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tavuk Çorbası",
                    noDiscountedPrice = 55.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tavuk Kavurma",
                    noDiscountedPrice = 95.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Etli Mantar Sote",
                    noDiscountedPrice = 95.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Karnıyarık",
                    noDiscountedPrice = 95.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Etli Taze Fasulye",
                    noDiscountedPrice = 95.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kuru Fasulye",
                    noDiscountedPrice = 95.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Biber Dolması",
                    noDiscountedPrice = 95.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Pirinç Pilavı",
                    noDiscountedPrice = 55.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Bulgur Pilavı",
                    noDiscountedPrice = 55.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Spaghetti",
                    noDiscountedPrice = 55.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                )
            )
        ),
        StoreModel(
            storeName = "Beşler Pastanesi",
            location = "Sivas Merkez (1.9 km)",
            score = "3.3 (100+)",
            storeImage = R.drawable.suboregi,
            productList = listOf(
                ProductItem(
                    productName = "Çikolatalı Yaş Pasta (0-6 Kişilik)",
                    noDiscountedPrice = 380.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Meyveli Yaş Pasta (0-6 Kişilik)",
                    noDiscountedPrice = 380.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Yaş Pasta (8-10 Kişilik)",
                    noDiscountedPrice = 400.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Meyveli Yaş Pasta (8-10 Kişilik)",
                    noDiscountedPrice = 400.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Baton Pasta",
                    noDiscountedPrice = 400.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Baton Pasta",
                    noDiscountedPrice = 400.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Cevizli Özel Baklava (500 gr.)",
                    noDiscountedPrice = 240.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Cevizli Burma (500 gr.)",
                    noDiscountedPrice = 240.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Fıstıklı Özel Baklava (500 gr.)",
                    noDiscountedPrice = 420.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Fıstıklı Kaymaklı Şöbiyet (500 gr.)",
                    noDiscountedPrice = 420.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Sütlü Nuriye (500 gr.)",
                    noDiscountedPrice = 260.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Fıstıklı Kaymaklı Havuç Dilimi (500 gr.)",
                    noDiscountedPrice = 425.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tuzlu Kuru Pasta (500 gr.)",
                    noDiscountedPrice = 230.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tatlı Kuru Pasta (500 gr.)",
                    noDiscountedPrice = 230.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                )
            )
        ),
        StoreModel(
            storeName = "Sema Hanım'ın Yeri",
            location = "Sivas Merkez (3.6 km)",
            score = "4.5 (10000+)",
            storeImage = R.drawable.suboregi,
            productList = listOf(
                ProductItem(
                    productName = "Etli Nohut",
                    noDiscountedPrice = 55.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Fırında Tavuk Baget",
                    noDiscountedPrice = 65.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kadınbudu Köfte ",
                    noDiscountedPrice = 65.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kuru Fasulye",
                    noDiscountedPrice = 55.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Pilav",
                    noDiscountedPrice = 50.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Bulgur Pilavı",
                    noDiscountedPrice = 50.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Makarna",
                    noDiscountedPrice = 50.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                )
            )
        ),
        StoreModel(
            storeName = "Cafe Standart",
            location = "Sivas Merkez (2.8 km)",
            score = "3.6 (100+)",
            storeImage = R.drawable.suboregi,
            productList = listOf(
                ProductItem(
                    productName = "Tavuklu Sandviç",
                    noDiscountedPrice = 160.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Nugget Sandviç",
                    noDiscountedPrice = 170.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tavuk Wrap",
                    noDiscountedPrice = 160.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Izgara Tavuk Sandviç",
                    noDiscountedPrice = 170.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Standarts Sandviç",
                    noDiscountedPrice = 130.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Karışık Sandviç",
                    noDiscountedPrice = 140.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Köri Soslu Makarna",
                    noDiscountedPrice = 140.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Ton Balıklı Makarna",
                    noDiscountedPrice = 175.00,
                    discountedPrice = 274.99,
                    productImage = R.drawable.suboregi
                )
            )
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