package com.rmb.bitirmeprojesi.presentation.storedetail

import com.rmb.bitirmeprojesi.model.ProductItem

interface ProductItemClickListener {
    fun onAddButtonClick(productItem: ProductItem)
}