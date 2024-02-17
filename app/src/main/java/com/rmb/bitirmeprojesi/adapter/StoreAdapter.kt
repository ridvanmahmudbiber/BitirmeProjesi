package com.rmb.bitirmeprojesi.adapter

import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rmb.bitirmeprojesi.databinding.StoreCardItemBinding
import com.rmb.bitirmeprojesi.model.StoreModel

class StoreAdapter(val storeList: List<StoreModel>) :
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
        holder.binding.tvheaderText.text = storeList[position].productName
        holder.binding.tvCity.text = storeList[position].storeLocation
        holder.binding.tvOpenCloseHour.text = "Kalan İndirim Süresi: "
        holder.binding.tvStandartPrice.text = storeList[position].standardPrice
        holder.binding.tvDiscountPrice.text = storeList[position].discountedPrice

        downTimerForDiscount(storeList[position].discountRemaining,holder)

        //holder.itemView.setOnClickListener {
        //    val intent = Intent(holder.itemView.context, MainActivity::class.java)
        //    intent.putExtra("landmark", landmarkList.get(position))
        //    holder.itemView.context.startActivity(intent)
        //}

    }

    override fun getItemCount(): Int {
        return storeList.size
    }

    private fun downTimerForDiscount(discountRemaining: Long, holder: StoreHolder){
        val timer = object: CountDownTimer(discountRemaining, 1000) {
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
    }
}