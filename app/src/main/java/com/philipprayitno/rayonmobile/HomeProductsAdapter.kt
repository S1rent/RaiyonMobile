package com.philipprayitno.rayonmobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class HomeProductsAdapter(val productList: ArrayList<Product>): RecyclerView.Adapter<HomeProductsAdapter.ListViewHolder>() {

    interface OnItemClickCallback {
        fun onItemClicked(data: Product)
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_product_picture)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeProductsAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.item_row_product,
                parent,
                false
            )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: HomeProductsAdapter.ListViewHolder, position: Int) {
        val product = productList[position]
        Glide.with(holder.itemView.context)
            .load(product.photo)
            .into(holder.imgPhoto)
        holder.tvName.text = product.name
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(productList[holder.adapterPosition])
        }
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
}