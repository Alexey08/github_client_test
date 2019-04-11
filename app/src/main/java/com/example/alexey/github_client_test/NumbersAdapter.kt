@file:Suppress("DEPRECATION")

package com.example.alexey.github_client_test


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

@Suppress("DEPRECATION")

class NumbersAdapter(private val numberItems: Int) : RecyclerView.Adapter<NumbersAdapter.NumberViewHolder>() {

    private var context: Context? = null

    init {
        viewHolderCount = 1
    }

    @SuppressLint("SetTextI18n")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val context= parent.context
        val layoutIdForListItem = R.layout.number_list_item
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(layoutIdForListItem, parent, false)
        val viewHolder = NumberViewHolder(view)
        viewHolder.viewHolderIndex.text = "ViewHolder Index: $viewHolderCount"
        viewHolderCount++
        return viewHolder
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return numberItems
    }

    inner class NumberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var listItemNumberView: TextView
        var viewHolderIndex: TextView

        init {
            context = itemView.context
            listItemNumberView = itemView.findViewById(R.id.tv_number_item)
            viewHolderIndex = itemView.findViewById(R.id.tv_view_holder_number)

            itemView.setOnClickListener {
                var intent = Intent()
                when (adapterPosition) {
                    0 -> intent = Intent(context, ChildActivity::class.java)
                    1 -> intent = Intent(context, ChildActivity::class.java)
                    2 -> intent = Intent(context, ChildActivity::class.java)
                    3 -> intent = Intent(context, ChildActivity::class.java)
                    4 -> intent = Intent(context, ChildActivity::class.java)
                    5 -> intent = Intent(context, ChildActivity::class.java)
                    6 -> intent = Intent(context, ChildActivity::class.java)
                    7 -> intent = Intent(context, ChildActivity::class.java)
                    8 -> intent = Intent(context, ChildActivity::class.java)
                    9 -> intent = Intent(context, ChildActivity::class.java)
                }
                context!!.startActivity(intent)
            }

        }

        fun bind(listIndex: Int) {
            listItemNumberView.text = listIndex.toString()
        }
    }

    companion object {
        private var viewHolderCount: Int = 1
    }
}
