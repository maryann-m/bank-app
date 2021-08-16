package com.ekenya.rnd.etourism.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.databinding.PaymentoptionitemBinding
import com.ekenya.rnd.etourism.models.Paymentoption


class PaymentsOptionsAdapter(private val listItems: List<Paymentoption>) : RecyclerView.Adapter<PaymentsOptionsAdapter.ViewHolder>()  {


    class ViewHolder(private val itemBinding: PaymentoptionitemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: Paymentoption) {
            itemBinding.paymentlogo.setBackgroundResource(item.icon)
            itemBinding.option.text = item.option
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = PaymentoptionitemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)


        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val livetrip: Paymentoption = listItems[position]

        holder.bind(livetrip)
        holder.itemView.setOnClickListener(View.OnClickListener {
            when (livetrip.option) {
                "Mpesa" -> {
                    it.findNavController().navigate(R.id.action_topUpFragment_to_mpesaFragment)
                }
                "Airtel"-> {
                    it.findNavController().navigate(R.id.action_topUpFragment_to_airtelFragment)
                }
                "Bank Cards" -> {
                    it.findNavController().navigate(R.id.action_topUpFragment_to_bankCardsFragment)
                }
                "Pesa Link" ->{
                    it.findNavController().navigate(R.id.action_topUpFragment_to_pesaLinkFragment)
                }
                "Chaza Card" ->{
                    it.findNavController().navigate(R.id.action_topUpFragment_to_mpesaFragment)
                }
            }

        })


    }

    override fun getItemCount(): Int {
        return  listItems.size
    }

}