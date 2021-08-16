package com.ekenya.rnd.etourism.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ekenya.rnd.etourism.databinding.HistoryItemBinding


class HistoryAdapter(private val shopCategoryItem: List<com.ekenya.rnd.etourism.models.HistoryItem>) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = HistoryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val paymentBean: com.ekenya.rnd.etourism.models.HistoryItem = shopCategoryItem[position]
        holder.bind(paymentBean)
    }

    override fun getItemCount(): Int = shopCategoryItem.size

    class ViewHolder(private val itemBinding: HistoryItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(catego: com.ekenya.rnd.etourism.models.HistoryItem) {
            itemBinding.tripdate.text = catego.date
            itemBinding.tripAmount.text = "KSH "+catego.tripAmount
            itemBinding.tripTitle.text = catego.tripTitle
            itemBinding.historyImage.setBackgroundResource(catego.id)

        }
    }

}