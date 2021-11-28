package com.example.activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RecycleViewAdapter(val Mylist: List<String>):
    RecyclerView.Adapter<RecycleViewAdapter.ItemHolder>() {
    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
return ItemHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.item_row,
        parent,
        false
    )
)   }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
val mylist2 = Mylist[position]
        holder.itemView.apply {
            tvRow.text = mylist2
        }
    }

    override fun getItemCount(): Int = Mylist.size


}