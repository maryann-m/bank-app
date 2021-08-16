package com.ekenya.rnd.etourism.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ekenya.rnd.etourism.R
import com.ekenya.rnd.etourism.databinding.ShopItemBinding
import com.ekenya.rnd.etourism.models.ShopItem


class ShopAdapter (private val shopCategoryItem: List<ShopItem>) : RecyclerView.Adapter<ShopAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = ShopItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val paymentBean: ShopItem = shopCategoryItem[position]
        holder.bind(paymentBean)


        holder.addtoBag.setOnClickListener {
            it.findNavController().navigate(R.id.action_navigation_dashboard_to_itemDetailFragment)
        }
    }

    override fun getItemCount(): Int = shopCategoryItem.size

    class ViewHolder(private val itemBinding: ShopItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        val addtoBag = itemBinding.addtobagbtn
        fun bind(catego: ShopItem) {
            itemBinding.bookTitle.text = catego.title
        }
    }
}