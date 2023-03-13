package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

private val Any.size: Unit
    get() = Unit
private val Any.name: CharSequence?
    get() {
        TODO("Not yet implemented")
    }
private val Any.surname: CharSequence?
    get() = Unit.toString()

private operator fun Unit.get(position: Int): Any {
    TODO("Not yet implemented")
}

class Adapter(private val array: Unit) : RecyclerView.Adapter<Adapter.MyViewHoldter>() {

    class MyViewHoldter(item : View):RecyclerView.ViewHolder(item){
        val image: ImageView = item.findViewById(R.id.image)
        val name : TextView = item.findViewById(R.id.name)
        val surname : TextView = item.findViewById(R.id.surname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHoldter {
        val myViewHolder =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHoldter(myViewHolder)
    }

    override fun onBindViewHolder(holder: MyViewHoldter, position: Int) {
        
        holder.name.text = array[position].name
        holder.surname.text = array[position].surname

    }

    override fun getItemCount() = Unit
}