package com.rmb.bitirmeprojesi.model

import android.support.annotation.DrawableRes

data class ProductItem(
    val productName: String?,
    val noDiscountedPrice: Double?,
    val discountedPrice: Double?, //indirimli
    @DrawableRes val productImage: Int
)
