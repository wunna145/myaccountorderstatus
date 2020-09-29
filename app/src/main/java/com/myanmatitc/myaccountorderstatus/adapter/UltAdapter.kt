package com.myanmatitc.myaccountorderstatus.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myanmatitc.myaccountorderstatus.R
import com.myanmatitc.myaccountorderstatus.model.Ult
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.ult_recycler.view.*
import kotlinx.android.synthetic.main.ult_recycler.view.img

class UltAdapter (var ultList: ArrayList<Ult>)  : RecyclerView.Adapter<UltAdapter.UltViewHolder>(){
    class UltViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(ult: Ult){
            itemView.label.text =ult.label
            itemView.img.setImageResource(ult.img)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UltAdapter.UltViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.ult_recycler,parent,false)
        return UltViewHolder(view)
    }

    override fun getItemCount(): Int =ultList.size

    override fun onBindViewHolder(holder: UltAdapter.UltViewHolder, position: Int) {
        holder.bind(ultList[position])
    }

}