package com.ekenya.rnd.etourism.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ekenya.rnd.etourism.databinding.TripItemInCartBinding
import com.ekenya.rnd.etourism.models.Trip


class TripsItemRecyclerviewAdapter(private val listItems: List<Trip>) : RecyclerView.Adapter<TripsItemRecyclerviewAdapter.TripsViewHolder>()  {


    class TripsViewHolder(private val itemBinding: TripItemInCartBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: Trip) {
            itemBinding.amountTv.text =item.amount






        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripsViewHolder {
        val binding = TripItemInCartBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return TripsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TripsViewHolder, position: Int) {
        val upcomingTrip: Trip = listItems[position]
        holder.bind(upcomingTrip)
    }

    override fun getItemCount(): Int {
        return  listItems.size
    }



}
