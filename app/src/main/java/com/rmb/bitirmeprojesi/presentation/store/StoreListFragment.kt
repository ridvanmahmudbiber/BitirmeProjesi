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
                    noDiscountedPrice = "75.00 TL",
                    discountedPrice = "59.99 TL",
                    productImage = R.drawable.fistikli_baklava
                ),
                ProductItem(
                    productName = "Cevizli Midye (250 kg.)",
                    noDiscountedPrice = "116.00 TL",
                    discountedPrice = "89.99 TL",
                    productImage = R.drawable.fistikli_baklava
                ),
                ProductItem(
                    productName = "Soğuk Baklava (250 gr.)",
                    noDiscountedPrice = "130.00 TL",
                    discountedPrice = "99.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Sütlü Nuriye (250 gr.)",
                    noDiscountedPrice = "97.00 TL",
                    discountedPrice = "69.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kabak Tatlısı (250 gr.)",
                    noDiscountedPrice = "70.00 TL",
                    discountedPrice = "54.99 TL",
                    productImage = R.drawable.suboregi
                )
            ),
            content = "Ev Yemekleri, Tatlı, Tavuk",
            address = "Gültepe Mah. Farabi Cad. İva Park No:22",
            discountRemaining = 2000000,
            openClosedHour = "09:00 - 22:00"
        ),
        StoreModel(
            storeName = "Livam Pastanesi",
            location = "Sivas Merkez (1.5 km)",
            score = "3.0 (500+)",
            storeImage = R.drawable.ekler,
            productList = listOf(
                ProductItem(
                    productName = "Ekler (1 kg.)",
                    noDiscountedPrice = "430.00 TL",
                    discountedPrice = "349.99 TL",
                    productImage = R.drawable.ekler
                ),
                ProductItem(
                    productName = "Sütlü Nuriye (500 gr.)",
                    noDiscountedPrice = "349.00 TL",
                    discountedPrice = "299.99 TL",
                    productImage = R.drawable.fistikli_baklava
                ),
                ProductItem(
                    productName = "Meyveli Pasta (4 Kişilik)",
                    noDiscountedPrice = "340.00 TL",
                    discountedPrice = "274.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Pasta (8-10 Kişilik)",
                    noDiscountedPrice = "450.00 TL",
                    discountedPrice = "349.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tatlı Kuru Pasta (1kg.)",
                    noDiscountedPrice = "429.00 TL",
                    discountedPrice = "349.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tuzlu Kuru Pasta (1kg.)",
                    noDiscountedPrice = "429.00 TL",
                    discountedPrice = "349.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Özel Cevizli Baklava (500 gr.)",
                    noDiscountedPrice = "349.00 TL",
                    discountedPrice = "299.99 TL",
                    productImage = R.drawable.suboregi
                )
            ),
            content = "Pastane & Fırın",
            address = "Kılavuz mahallesi Emir Paşa Cad. No:76",
            discountRemaining = 3000000,
            openClosedHour = "09:00 - 21:00"
        ),
        StoreModel(
            storeName = "Çiğ Köfteci Ömer Usta",
            location = "Sivas Merkez (2.6 km)",
            score = "4.4 (500+)",
            storeImage = R.drawable.ekler,
            productList = listOf(
                ProductItem(
                    productName = "Çiğ Köfte (250 gr.)",
                    noDiscountedPrice = "94.00 TL",
                    discountedPrice = "79.99 TL",
                    productImage = R.drawable.ispanakli_borek
                ),
                ProductItem(
                    productName = "Çiğ Köfte (500 gr.)",
                    noDiscountedPrice = "172.00 TL",
                    discountedPrice = "139.99 TL",
                    productImage = R.drawable.fistikli_baklava
                ),
                ProductItem(
                    productName = "Çiğ Köfte (750 gr.)",
                    noDiscountedPrice = "231.00 TL",
                    discountedPrice = "189.99 TL",
                    productImage = R.drawable.fistikli_baklava
                ),
                ProductItem(
                    productName = "Çiğ Köfte (1 kg.)",
                    noDiscountedPrice = "298.00 TL",
                    discountedPrice = "249.99 TL",
                    productImage = R.drawable.fistikli_baklava
                )
            ),
            content = "Çiğ Köfte",
            address = "Yahya Bey Cd. Kızılırmak, Yahya Bey Cd., 58070",
            discountRemaining = 3000000,
            openClosedHour = "08:00 - 23:00"
        ),
        StoreModel(
            storeName = "Kampüs Pilav",
            location = "Cumhuriyet Üniversitesi Kampüsü (1.7 km)",
            score = "4.5 (2000+)",
            storeImage = R.drawable.yas_pasta,
            productList = listOf(
                ProductItem(
                    productName = "Nohutlu Pilav (Medium)",
                    noDiscountedPrice = "90.00 TL",
                    discountedPrice = "79.99 TL",
                    productImage = R.drawable.yas_pasta
                ),
                ProductItem(
                    productName = "Nohutlu Pilav (Large)",
                    noDiscountedPrice = "100.00 TL",
                    discountedPrice = "74.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tavuklu Nohutlu Pilav (Large)",
                    noDiscountedPrice = "145.00 TL",
                    discountedPrice = "109.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Nohutlu Pilav (Jumbo)",
                    noDiscountedPrice = "120.00 TL",
                    discountedPrice = "274.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tavuklu Nohutlu Pilav (Jumbo)",
                    noDiscountedPrice = "205.00 TL",
                    discountedPrice = "169.99 TL",
                    productImage = R.drawable.suboregi
                )
            ),
            content = "Kebap & Türk Mutfağı, Pilav",
            address = "Eğri Köprü Mh. İsmet Yılmaz Bulv. No:52",
            discountRemaining = 2000000,
            openClosedHour = "08:00 - 21:00"
        ),
        StoreModel(
            storeName = "Albatros Cafe & Restaurant",
            location = "Cumhuriyet Üniversitesi Kampüsü (1.2 km)",
            score = "4.1 (5000+)",
            storeImage = R.drawable.kiymali_borek,
            productList = listOf(
                ProductItem(
                    productName = "Beyaz Peynirli Gözleme",
                    noDiscountedPrice = "120.00 TL",
                    discountedPrice = "99.99 TL",
                    productImage = R.drawable.kiymali_borek
                ),
                ProductItem(
                    productName = "Patatesli Gözleme",
                    noDiscountedPrice = "120.00 TL",
                    discountedPrice = "99.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kaşarlı Gözleme",
                    noDiscountedPrice = "120.00 TL",
                    discountedPrice = "99.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kıymalı Gözleme",
                    noDiscountedPrice = "120.00 TL",
                    discountedPrice = "99.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Beyaz Peynirli Çi Börek (4 Adet)",
                    noDiscountedPrice = "140.00 TL",
                    discountedPrice = "109.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Patatesli Çi Börek (4 Adet)",
                    noDiscountedPrice = "140.00 TL",
                    discountedPrice = "109.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kaşarlı Çi Börek (4 Adet)",
                    noDiscountedPrice = "140.00 TL",
                    discountedPrice = "109.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kıymalı Çi Börek (4 Adet)",
                    noDiscountedPrice = "140.00 TL",
                    discountedPrice = "109.99 TL",
                    productImage = R.drawable.suboregi
                )
            ),
            content = "Dünya Mutfağı, Kebap & Türk Mutfağı",
            address = "Cumhuriyet Üniversitesi Vakıf Çarşısı No:15",
            discountRemaining = 3000000,
            openClosedHour = "09:00 - 21:00"
        ),
        StoreModel(
            storeName = "Coffy",
            location = "Cumhuriyet Üniversitesi Kampüsü (2.3 km)",
            score = "3.5 (22)",
            storeImage = R.drawable.soguk_baklava,
            productList = listOf(
                ProductItem(
                    productName = "Çikolata Dolgulu Kruvasan",
                    noDiscountedPrice = "100.00 TL",
                    discountedPrice = "79.99 TL",
                    productImage = R.drawable.soguk_baklava
                ),
                ProductItem(
                    productName = "Çok Tahıllı Kruvasan",
                    noDiscountedPrice = "65.00 TL",
                    discountedPrice = "49.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tereyağlı Kruvasan",
                    noDiscountedPrice = "55.00 TL",
                    discountedPrice = "44.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Fındık Kremalı Kruvasan",
                    noDiscountedPrice = "65.00 TL",
                    discountedPrice = "54.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Karışık Sandviç (Sıcak)",
                    noDiscountedPrice = "100.00 TL",
                    discountedPrice = "79.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Peynirli Sandviç (Sıcak)",
                    noDiscountedPrice = "100.00 TL",
                    discountedPrice = "79.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Füme Etli Peynirli Bagel Sandviç",
                    noDiscountedPrice = "120.00 TL",
                    discountedPrice = "94.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Ezine Peynirli Focaccia Sandviç",
                    noDiscountedPrice = "120.00 TL",
                    discountedPrice = "94.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Köri Soslu & Tavuklu Baget Sandviç)",
                    noDiscountedPrice = "130.00 TL",
                    discountedPrice = "99.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Atem Bazlama Sandviç)",
                    noDiscountedPrice = "120.00 TL",
                    discountedPrice = "94.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Cookie)",
                    noDiscountedPrice = "65.00 TL",
                    discountedPrice = "49.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Donut)",
                    noDiscountedPrice = "65.00 TL",
                    discountedPrice = "49.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çilekli Cookie)",
                    noDiscountedPrice = "65.00 TL",
                    discountedPrice = "49.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Muffin)",
                    noDiscountedPrice = "80.00 TL",
                    discountedPrice = "64.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Mozaik Kek (Dilim)",
                    noDiscountedPrice = "90.00 TL",
                    discountedPrice = "74.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Limonlu Cheesecake",
                    noDiscountedPrice = "110.00 TL",
                    discountedPrice = "84.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Frambuazlı Cheesecake",
                    noDiscountedPrice = "110.00 TL",
                    discountedPrice = "84.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tiramisu",
                    noDiscountedPrice = "90.00 TL",
                    discountedPrice = "74.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Orman Meyveli Pasta",
                    noDiscountedPrice = "95.00 TL",
                    discountedPrice = "74.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Cookie Crumble Donut",
                    noDiscountedPrice = "70.00 TL",
                    discountedPrice = "59.99 TL",
                    productImage = R.drawable.suboregi
                )
            ),
            content = "Kahve, Sandviç, Tatlı, Kruvasan",
            address = "Yenişehir Mah. Dr. Rahmi Karahasan Cad. 52. Sok No:2",
            discountRemaining = 4000000,
            openClosedHour = "09:00 - 22:00"
        ),
        StoreModel(
            storeName = "Hamur Abla Ev Yemekleri",
            location = "Sivas Merkez (3.2 km)",
            score = "3.6 (10000+)",
            storeImage = R.drawable.suboregi,
            productList = listOf(
                ProductItem(
                    productName = "Mercimek Çorbası",
                    noDiscountedPrice = "55.00 TL",
                    discountedPrice = "39.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tavuk Çorbası",
                    noDiscountedPrice = "55.00 TL",
                    discountedPrice = "39.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tavuk Kavurma",
                    noDiscountedPrice = "95.00 TL",
                    discountedPrice = "74.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Etli Mantar Sote",
                    noDiscountedPrice = "95.00 TL",
                    discountedPrice = "74.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Karnıyarık",
                    noDiscountedPrice = "95.00 TL",
                    discountedPrice = "74.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Etli Taze Fasulye",
                    noDiscountedPrice = "95.00 TL",
                    discountedPrice = "74.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kuru Fasulye",
                    noDiscountedPrice = "95.00 TL",
                    discountedPrice = "74.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Biber Dolması",
                    noDiscountedPrice = "95.00 TL",
                    discountedPrice = "74.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Pirinç Pilavı",
                    noDiscountedPrice = "55.00 TL",
                    discountedPrice = "44.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Bulgur Pilavı",
                    noDiscountedPrice = "55.00 TL",
                    discountedPrice = "44.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Spaghetti",
                    noDiscountedPrice = "55.00 TL",
                    discountedPrice = "44.99 TL",
                    productImage = R.drawable.suboregi
                )
            ),
            content = "Ev Yemekleri, Kebap & Türk Mutfağı",
            address = "Sularbaşı Mah.İmam Hatip Sok.No:1",
            discountRemaining = 3000000,
            openClosedHour = "09:00 - 21:00"
        ),
        StoreModel(
            storeName = "Beşler Pastanesi",
            location = "Sivas Merkez (1.9 km)",
            score = "3.3 (100+)",
            storeImage = R.drawable.suboregi,
            productList = listOf(
                ProductItem(
                    productName = "Çikolatalı Yaş Pasta (0-6 Kişilik)",
                    noDiscountedPrice = "380.00 TL",
                    discountedPrice = "319.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Meyveli Yaş Pasta (0-6 Kişilik)",
                    noDiscountedPrice = "380.00 TL",
                    discountedPrice = "319.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Yaş Pasta (8-10 Kişilik)",
                    noDiscountedPrice = "400.00 TL",
                    discountedPrice = "329.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Meyveli Yaş Pasta (8-10 Kişilik)",
                    noDiscountedPrice = "400.00 TL",
                    discountedPrice = "329.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Baton Pasta",
                    noDiscountedPrice = "400.00 TL",
                    discountedPrice = "329.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Çikolatalı Baton Pasta",
                    noDiscountedPrice = "400.00 TL",
                    discountedPrice = "329.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Cevizli Özel Baklava (500 gr.)",
                    noDiscountedPrice = "240.00 TL",
                    discountedPrice = "199.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Cevizli Burma (500 gr.)",
                    noDiscountedPrice = "240.00 TL",
                    discountedPrice = "199.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Fıstıklı Özel Baklava (500 gr.)",
                    noDiscountedPrice = "420.00 TL",
                    discountedPrice = "349.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Fıstıklı Kaymaklı Şöbiyet (500 gr.)",
                    noDiscountedPrice = "420.00 TL",
                    discountedPrice = "349.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Sütlü Nuriye (500 gr.)",
                    noDiscountedPrice = "260.00 TL",
                    discountedPrice = "199.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Fıstıklı Kaymaklı Havuç Dilimi (500 gr.)",
                    noDiscountedPrice = "425.00 TL",
                    discountedPrice = "349.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tuzlu Kuru Pasta (500 gr.)",
                    noDiscountedPrice = "230.00 TL",
                    discountedPrice = "189.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tatlı Kuru Pasta (500 gr.)",
                    noDiscountedPrice = "230.00 TL",
                    discountedPrice = "189.99 TL",
                    productImage = R.drawable.suboregi
                )
            ),
            content = "Pastane & Fırın, Tatlı",
            address = "Emek Mah. Zafer Cad. No:23/A",
            discountRemaining = 4000000,
            openClosedHour = "07:00 - 21:00"
        ),
        StoreModel(
            storeName = "Sema Hanım'ın Yeri",
            location = "Sivas Merkez (3.6 km)",
            score = "4.5 (10000+)",
            storeImage = R.drawable.suboregi,
            productList = listOf(
                ProductItem(
                    productName = "Etli Nohut",
                    noDiscountedPrice = "55.00 TL",
                    discountedPrice = "44.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Fırında Tavuk Baget",
                    noDiscountedPrice = "65.00 TL",
                    discountedPrice = "49.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kadınbudu Köfte ",
                    noDiscountedPrice = "65.00 TL",
                    discountedPrice = "49.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Kuru Fasulye",
                    noDiscountedPrice = "55.00 TL",
                    discountedPrice = "44.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Pilav",
                    noDiscountedPrice = "50.00 TL",
                    discountedPrice = "39.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Bulgur Pilavı",
                    noDiscountedPrice = "50.00 TL",
                    discountedPrice = "39.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Makarna",
                    noDiscountedPrice = "50.00 TL",
                    discountedPrice = "39.99 TL",
                    productImage = R.drawable.suboregi
                )
            ),
            content = "Ev Yemekleri, Mantı",
            address = "Örtülüpınar Mah. Reşat Şemsettin Firer Sokak No: 7",
            discountRemaining = 3000000,
            openClosedHour = "09:00 - 21:00"
        ),
        StoreModel(
            storeName = "Cafe Standart",
            location = "Sivas Merkez (2.8 km)",
            score = "3.6 (100+)",
            storeImage = R.drawable.suboregi,
            productList = listOf(
                ProductItem(
                    productName = "Tavuklu Sandviç",
                    noDiscountedPrice = "160.00 TL",
                    discountedPrice = "109.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Nugget Sandviç",
                    noDiscountedPrice = "170.00 TL",
                    discountedPrice = "119.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Tavuk Wrap",
                    noDiscountedPrice = "160.00 TL",
                    discountedPrice = "109.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Izgara Tavuk Sandviç",
                    noDiscountedPrice = "170.00 TL",
                    discountedPrice = "119.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Standarts Sandviç",
                    noDiscountedPrice = "130.00 TL",
                    discountedPrice = "89.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Karışık Sandviç",
                    noDiscountedPrice = "140.00 TL",
                    discountedPrice = "99.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Köri Soslu Makarna",
                    noDiscountedPrice = "140.00 TL",
                    discountedPrice = "99.99 TL",
                    productImage = R.drawable.suboregi
                ),
                ProductItem(
                    productName = "Ton Balıklı Makarna",
                    noDiscountedPrice = "175.00 TL",
                    discountedPrice = "129.99 TL",
                    productImage = R.drawable.suboregi
                )
            ),
            content = "Dünya Mutfağı, Kahvaltı & Börek, Tost & Sandviç",
            address = "Örtülüpınar Mah. Ağca bölge Sok. 6/A",
            discountRemaining = 5000000,
            openClosedHour = "09:00 - 20:00"
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
                override fun onItemClick(storeItem: StoreModel) {
                    findNavController().navigate(
                        StoreListFragmentDirections.actionStoreListFragmentToStoreDetailFragment(storeItem)
                    )
                }
            })
        binding.rvStoreList.adapter = storeAdapter

    }
}