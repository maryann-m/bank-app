package com.ekenya.rnd.etourism.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.databinding.MerchantItemBinding
import com.ekenya.rnd.etourism.models.PaymentHistoryItem


class PaymentsHistoryAdapter(private val listItems: List<PaymentHistoryItem>) : RecyclerView.Adapter<PaymentsHistoryAdapter.ViewHolder>()  {

    class ViewHolder(private val itemBinding: MerchantItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: PaymentHistoryItem) {
            val colors = intArrayOf(R.color.app_red,R.color.yellow,R.color.purple,R.color.app_red)


            itemBinding.merchanticon.setBackgroundResource(item.logo)
            itemBinding.view.setBackgroundResource(colors[position])
            itemBinding.accountnumbertv.text = item.account
            itemBinding.merchanttitle.text = item.merchant
            itemBinding.paymentAmount.text = item.amount




        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = MerchantItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)


        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val livetrip: PaymentHistoryItem = listItems[position]

        holder.bind(livetrip)
    }

    override fun getItemCount(): Int {
        return  listItems.size
    }

}