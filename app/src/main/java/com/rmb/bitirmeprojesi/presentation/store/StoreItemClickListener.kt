package com.rmb.bitirmeprojesi.presentation.store

import com.rmb.bitirmeprojesi.model.StoreModel

interface StoreItemClickListener {
    fun onItemClick(productList: StoreModel)
}