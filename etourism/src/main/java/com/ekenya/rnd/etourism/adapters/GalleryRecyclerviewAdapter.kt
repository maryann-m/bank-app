package com.ekenya.rnd.etourism.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ekenya.rnd.etourism.databinding.GalleryitemBinding
import com.ekenya.rnd.etourism.models.GalleryItem


class GalleryRecyclerviewAdapter(private val listItems: List<GalleryItem>) : RecyclerView.Adapter<GalleryRecyclerviewAdapter.ViewHolder>()  {
  private lateinit var  more: TextView

    class ViewHolder(private val itemBinding: GalleryitemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: GalleryItem) {


            itemBinding.livesafaribacground.setBackgroundResource(item.image)





        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = GalleryitemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        more = binding.moreTv

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val livetrip: GalleryItem = listItems[position]
        if (position ==  listItems.size-1){
            more.visibility = View.VISIBLE

        }
        holder.bind(livetrip)
    }

    override fun getItemCount(): Int {
        return  listItems.size
    }

}

/*
class GalleryRecyclerviewAdapter(private val listItems: List<GalleryItem>) : RecyclerView.Adapter<GalleryRecyclerviewAdapter.ViewHolder>()  {
  private lateinit var  more: TextView

    class ViewHolder(private val itemBinding: GalleryitemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: GalleryItem) {


            itemBinding.livesafaribacground.setBackgroundResource(item.image)





        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = GalleryitemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        more = binding.moreTv

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val livetrip: GalleryItem = listItems[position]
        if (position ==  listItems.size-1){
            more.visibility = View.VISIBLE

        }
        holder.bind(livetrip)
    }

    override fun getItemCount(): Int {
        return  listItems.size
    }

}*/
