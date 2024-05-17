package com.rmb.bitirmeprojesi.model

import android.support.annotation.DrawableRes

data class StoreModel(
    val storeName: String?,
    val location: String?,
    val score: String?,
    @DrawableRes val storeImage: Int?,
    val productList: List<ProductItem>?
)
