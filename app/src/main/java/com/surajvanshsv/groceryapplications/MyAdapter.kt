package com.surajvanshsv.groceryapplications

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


// the adapeter act as bridge btw data source and recycler view ui component

class MyAdapter(val itemList: ArrayList<ItemModel>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent , false )

        return MyViewHolder(v)
    }

    override fun onBindViewHolder(
        holder: MyViewHolder,
        position: Int
    ) {
        holder.itemTitle.text = itemList[position].name
        holder.itemDesc.text = itemList[position].desc
        holder.itemImg.setImageResource(itemList[position].img)

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    // ViewHolder : holding references of the view for the single item in recycler view
    // item view represents the view of a single item of recycler view
    inner class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImg : ImageView
        var itemTitle : TextView
        var itemDesc : TextView

        init {
            itemImg = itemView.findViewById<ImageView>(R.id.imageView)
            itemTitle = itemView.findViewById<TextView>(R.id.title_txt)
            itemDesc = itemView.findViewById<TextView>(R.id.description_text)

            itemView.setOnClickListener {
                Toast.makeText(itemView.context,
                    "You Choose ${itemList[adapterPosition].name}",
                    Toast.LENGTH_SHORT).show()
            }
        }

    }



}