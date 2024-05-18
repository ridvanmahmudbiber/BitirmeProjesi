package com.rmb.bitirmeprojesi.adapter

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rmb.bitirmeprojesi.databinding.ProductItemCardBinding
import com.rmb.bitirmeprojesi.model.ProductItem
import com.rmb.bitirmeprojesi.presentation.storedetail.ProductItemClickListener

class ProductAdapter(
    val productList: List<ProductItem>,
    private val productItemClickListener: ProductItemClickListener
) : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    class ProductHolder(val binding: ProductItemCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductAdapter.ProductHolder {
        val binding =
            ProductItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductAdapter.ProductHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.binding.tvProductName.text = productList[position].productName
        holder.binding.tvNoDiscountPrice.text = productList[position].noDiscountedPrice.toString()
        holder.binding.tvDiscountPrice.text = productList[position].discountedPrice.toString()
        holder.binding.ivProductImage.setImageBitmap(
            getResizedBitmap(
                BitmapFactory.decodeResource(
                    holder.itemView.resources,
                    productList[position].productImage
                ), 1024
            )
        )

        holder.binding.btnAddProduct.setOnClickListener {
            productItemClickListener.onAddButtonClick(productList[position])
        }
    }

    override fun getItemCount(): Int {
        return productList.size
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