package com.binar.myproject.adapterrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.my_name_item.view.*

class FruitAdapter (val listBuah : ArrayList<MyFruit>) : RecyclerView.Adapter<FruitAdapter.ViewHolder>() {

    //Class Holder
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    // Membuat Holder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_name_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBuah.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tvNamaBuah.text=listBuah[position].namaBuah
        Glide.with(holder.itemView.context).load(listBuah[position].gambarBuah).into(holder.itemView.ivGambarBuah)
    }
}