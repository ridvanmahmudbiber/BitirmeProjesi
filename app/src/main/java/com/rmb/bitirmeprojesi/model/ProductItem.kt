package com.rmb.bitirmeprojesi.model

import android.support.annotation.DrawableRes

data class ProductItem(
    val productName: String?,
    val noDiscountedPrice: String?,
    val discountedPrice: String?, //indirimli
    @DrawableRes val productImage: Int
)
