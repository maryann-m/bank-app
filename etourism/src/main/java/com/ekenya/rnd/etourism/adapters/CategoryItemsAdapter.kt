package com.ekenya.rnd.etourism.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ekenya.rnd.etourism.databinding.ShopCategoryItemBinding
import com.ekenya.rnd.etourism.models.ShopCategoryItem


class CategoryItemsAdapter(private val shopCategoryItem: List<ShopCategoryItem>) : RecyclerView.Adapter<CategoryItemsAdapter.PaymentHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentHolder {
        val itemBinding = ShopCategoryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PaymentHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: PaymentHolder, position: Int) {
        val paymentBean: ShopCategoryItem = shopCategoryItem[position]
        holder.bind(paymentBean)
    }

    override fun getItemCount(): Int = shopCategoryItem.size

    class PaymentHolder(private val itemBinding: ShopCategoryItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(catego: ShopCategoryItem) {
            itemBinding.categoryTitle.text = catego.title
            itemBinding.categoryIcon.setBackgroundResource(catego.id)
        }
    }
    }