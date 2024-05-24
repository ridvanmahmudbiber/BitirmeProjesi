package com.rmb.bitirmeprojesi.adapter

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rmb.bitirmeprojesi.databinding.BasketItemCardBinding
import com.rmb.bitirmeprojesi.model.ProductItem

class BasketAdapter(
    val productList: List<ProductItem>?
) : RecyclerView.Adapter<BasketAdapter.ProductHolder>() {

    class ProductHolder(val binding: BasketItemCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BasketAdapter.ProductHolder {
        val binding =
            BasketItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BasketAdapter.ProductHolder(binding)
    }

    override fun onBindViewHolder(holder: BasketAdapter.ProductHolder, position: Int) {
        holder.binding.tvPrice.text = productList?.get(position)?.discountedPrice
        holder.binding.tvProductName.text = productList?.get(position)?.productName
        holder.binding.ivProductImage.setImageBitmap(
            productList?.get(position)?.let {
                BitmapFactory.decodeResource(
                    holder.itemView.resources,
                    it.productImage
                )
            }?.let {
                getResizedBitmap(
                    it, 1024
                )
            }
        )
    }

    override fun getItemCount(): Int {
        return productList?.size ?: 0
    }

    fun getResizedBitmap(image: Bitmap, maxSize: Int): Bitmap {
        var width = image.width
        var height = image.height

        val bitmapRatio = width.toFloat() / height.toFloat()
        if (bitmapRatio > 1) {
            width = maxSize
            height = (width / bitmapRatio).toInt()
        } else {
            height = maxSize
            width = (height * bitmapRatio).toInt()
        }

        return Bitmap.createScaledBitmap(image, width, height, true)
    }
}