package com.ekenya.rnd.etourism.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ekenya.rnd.etourism.databinding.ProfilephotoitemBinding
import com.ekenya.rnd.etourism.models.Photo


class PhotosAdapter(private val listItems: List<Photo>) : RecyclerView.Adapter<PhotosAdapter.ViewHolder>()  {


    class ViewHolder(private val itemBinding: ProfilephotoitemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: Photo) {


            itemBinding.photo.setBackgroundResource(item.image)





        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ProfilephotoitemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)


        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val livetrip: Photo = listItems[position]

        holder.bind(livetrip)
    }

    override fun getItemCount(): Int {
        return  listItems.size
    }

}