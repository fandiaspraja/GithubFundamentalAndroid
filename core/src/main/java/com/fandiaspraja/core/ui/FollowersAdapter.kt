package com.fandiaspraja.core.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fandiaspraja.core.R
import com.fandiaspraja.core.databinding.ItemSearchBinding
import com.fandiaspraja.core.domain.model.Followers
import java.util.ArrayList

class FollowersAdapter : RecyclerView.Adapter<FollowersAdapter.ListViewHolder>() {


    private var listData = ArrayList<Followers>()
    var onItemClick: ((Followers) -> Unit)? = null

    fun setData(newListData: List<Followers>?) {
        if (newListData == null) return
        listData.clear()
        listData.addAll(newListData)
//        listData[0].isSelected = true

        notifyDataSetChanged()
    }

    fun setSelected(pos: Int){
        for (i in listData.indices){
//            listData[i].isSelected = false
        }
//        listData[pos].isSelected = true

        notifyDataSetChanged()
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemSearchBinding.bind(itemView)
        fun bind(data: Followers){
            with(binding){

                Glide
                    .with(itemView)
                    .load(data.avatar_url)
                    .centerCrop()
                    .into(imgUser)

                tvName.text = data.login
                tvType.text = data.type
            }
        }

        init {

            binding.root.setOnClickListener {
                onItemClick?.invoke(listData[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_search, parent, false))

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listData.size
}