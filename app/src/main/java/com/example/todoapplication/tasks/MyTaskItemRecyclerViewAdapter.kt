package com.example.todoapplication.tasks

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.todoapplication.R

import kotlinx.android.synthetic.main.fragment_taskitem.view.*

class MyTaskItemRecyclerViewAdapter(
    private val items: MutableList<Task>
) : RecyclerView.Adapter<MyTaskItemRecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val itemName = view.item_name
        val btDeleteButton = view.bt_remove_item
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_taskitem, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemName.text = items[position].name

        holder.btDeleteButton.setOnClickListener {
            removeItem(position)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    private fun removeItem(position: Int) {
        items.removeAt(position)
        notifyItemRemoved(position)
        notifyDataSetChanged()
    }

    fun addItem(item: Task) {
        items.add(item)
        notifyDataSetChanged()
    }

}
