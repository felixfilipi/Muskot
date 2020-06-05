package com.muse.muskot

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.muse.muskot.Model
import kotlinx.android.synthetic.main.activity_main4.view.*
import kotlinx.android.synthetic.main.row.view.*
import kotlin.contracts.Returns

class MyAdapter (val arrayList: ArrayList<Model>,val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindItem (model: Model){
            itemView.titleTv.text=model.title
            itemView.descriptionTv.text = model.des
            itemView.imageIv.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(arrayList[position])

        holder.itemView.setOnClickListener{
            if(position == 0){

                Toast.makeText(
                    context,
                    "You clicked over Google Maps",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position == 1){

                Toast.makeText(
                    context,
                    "You clicked over Google Maps",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position == 2){

                Toast.makeText(
                    context,
                    "You clicked over Google Maps",
                    Toast.LENGTH_LONG
                ).show()
            }


        }
    }
}