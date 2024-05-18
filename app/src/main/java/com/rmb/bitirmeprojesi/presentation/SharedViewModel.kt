package com.rmb.bitirmeprojesi.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rmb.bitirmeprojesi.model.ProductItem
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class SharedViewModel: ViewModel() {

    //private var productListInBasket: MutableList<ProductItem> = mutableListOf()
    private val _sharedFlow= MutableSharedFlow<List<ProductItem>?>(replay = 1)
    val sharedFlow= _sharedFlow.asSharedFlow()

    fun sendData(data:List<ProductItem>?){
        viewModelScope.launch {
            _sharedFlow.emit(data)
        }
    }
}