package com.dicoding.dominospizza

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class ListAdapter (private val listItems: ArrayList<Items>):RecyclerView.Adapter<ListAdapter.ListViewHolder> (){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = listItems[position]

        Glide.with(holder.itemView.context)
            .load(item.images)
            .apply(RequestOptions().override(55,55))
            .into(holder.itemImg)

        holder.tvTitle.text= item.titles
        holder.tvDetail.text=item.descriptions
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listItems[holder.absoluteAdapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImg: ImageView=itemView.findViewById(R.id.menuImage)
        var tvTitle: TextView=itemView.findViewById(R.id.menuTitle)
        var tvDetail: TextView=itemView.findViewById(R.id.menuDetails)
    }

    interface OnItemClickCallback{
        fun onItemClicked(data:Items)
}
}