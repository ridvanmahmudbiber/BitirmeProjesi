package com.rmb.bitirmeprojesi.model

data class StoreModel(
    val productName: String,
    val storeLocation: String,
    val standardPrice : String,
    val discountedPrice : String,
    val discountRemaining: Long,
    val storeName: String,
    val productImage: Int,
)
