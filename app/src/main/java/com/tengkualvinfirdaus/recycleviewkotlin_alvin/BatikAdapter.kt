package com.tengkualvinfirdaus.recycleviewkotlin_alvin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BatikAdapter (private val context: Context, private val batik: List<Batik>, val listener: (Batik) ->Unit)
    : RecyclerView.Adapter<BatikAdapter.BatikViewHolder>(){

    class BatikViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val imgBatik = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameBatik = view.findViewById<TextView>(R.id.tv_item_name)
        val descBatik = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(batik: Batik, listener: (Batik) -> Unit) {
            imgBatik.setImageResource(batik.imgBatik)
            nameBatik.text = batik.nameBatik
            descBatik.text = batik.descBatik
            itemView.setOnClickListener{listener(batik)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BatikViewHolder {
        return BatikViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_batik,parent, false)
        )
    }

    override fun onBindViewHolder(holder: BatikViewHolder, position: Int) {
        holder.bindView(batik[position], listener)
    }

    override fun getItemCount(): Int = batik.size
}