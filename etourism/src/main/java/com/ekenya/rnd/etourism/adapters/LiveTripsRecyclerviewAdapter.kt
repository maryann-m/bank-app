package com.ekenya.rnd.etourism.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ekenya.rnd.etourism.databinding.LivesafariItemBinding
import com.ekenya.rnd.etourism.models.LiveTrip



class LiveTripsRecyclerviewAdapter(private val listItems: List<LiveTrip>) : RecyclerView.Adapter<LiveTripsRecyclerviewAdapter.LiveTripViewHolder>()  {

    class LiveTripViewHolder(private val itemBinding: LivesafariItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: LiveTrip) {

            itemBinding.liveTitle.text = item.title
            itemBinding.livesafaribacground.setBackgroundResource(item.background)





        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LiveTripViewHolder {
        val binding = LivesafariItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return LiveTripViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LiveTripViewHolder, position: Int) {
        val livetrip: LiveTrip = listItems[position]
        holder.bind(livetrip)
    }

    override fun getItemCount(): Int {
        return  listItems.size
    }
}