package com.rmb.bitirmeprojesi.model

import android.support.annotation.DrawableRes
import java.io.Serializable

data class StoreModel(
    val storeName: String?,
    val location: String?,
    val score: String?,
    @DrawableRes val storeImage: Int?,
    val productList: List<ProductItem>?,
    val content: String?,
    val address: String?,
    val discountRemaining: Long,
    val openClosedHour: String?,
):Serializable
