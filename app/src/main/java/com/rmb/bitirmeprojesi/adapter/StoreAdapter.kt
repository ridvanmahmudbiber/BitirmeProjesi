package com.rmb.bitirmeprojesi.adapter

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rmb.bitirmeprojesi.databinding.StoreCardItemBinding
import com.rmb.bitirmeprojesi.model.StoreModel
import com.rmb.bitirmeprojesi.presentation.store.StoreItemClickListener

class StoreAdapter(
    val storeList: List<StoreModel>,
    private val storeItemClickListener: StoreItemClickListener
) :
    RecyclerView.Adapter<StoreAdapter.StoreHolder>() {

    class StoreHolder(val binding: StoreCardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreHolder {
        val binding =
            StoreCardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StoreHolder(binding)
    }

    override fun onBindViewHolder(holder: StoreHolder, position: Int) {
        holder.binding.tvheaderText.text = storeList[position].storeName
        holder.binding.tvCity.text = storeList[position].location
        holder.binding.tvStoreScore.text = storeList[position].score
        /*holder.binding.tvOpenCloseHour.text = "Kalan İndirim Süresi: "
        holder.binding.tvStandartPrice.text = storeList[position].standardPrice
        holder.binding.tvDiscountPrice.text = storeList[position].discountedPrice */
        holder.binding.ivStoreImage.setImageBitmap(
            getResizedBitmap(
                BitmapFactory.decodeResource(
                    holder.itemView.resources,
                    storeList[position].storeImage?: 0
                ), 1024
            )
        )

        //downTimerForDiscount(storeList[position].discountRemaining, holder)

        holder.itemView.setOnClickListener {

            storeItemClickListener.onItemClick()

        }

    }

    override fun getItemCount(): Int {
        return storeList.size
    }

    /* private fun downTimerForDiscount(discountRemaining: Long, holder: StoreHolder) {
        val timer = object : CountDownTimer(discountRemaining, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val hours = millisUntilFinished / (1000 * 60 * 60)
                val minutes = (millisUntilFinished % (1000 * 60 * 60)) / (1000 * 60)
                val seconds = ((millisUntilFinished % (1000 * 60 * 60)) % (1000 * 60) / 1000)
                holder.binding.tvDiscountRemaining.text = "$hours:$minutes:$seconds"
            }

            override fun onFinish() {
                holder.binding.tvDiscountRemaining.text = ""
                holder.binding.tvOpenCloseHour.text = "İndirimin süresi doldu."
            }
        }
        timer.start()
    } */

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