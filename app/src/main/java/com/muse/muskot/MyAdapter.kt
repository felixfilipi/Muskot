package com.muse.muskot

import android.content.Context
import android.content.Intent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.row.view.*


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
                    "You clicked over Hall",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position == 1){

                Toast.makeText(
                    context,
                    "You clicked over Area Garbarata",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position == 2){

                Toast.makeText(
                    context,
                    "You clicked over Runway 27 Airport",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position == 3){

                Toast.makeText(
                    context,
                    "You clicked over Pecinan Zone",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position == 4){

                Toast.makeText(
                    context,
                    "You clicked over Batavia Zone",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position == 5){

                Toast.makeText(
                    context,
                    "You clicked over America Zone",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position == 6){

                Toast.makeText(
                    context,
                    "You clicked over Europe Zone",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position == 7){

                Toast.makeText(
                    context,
                    "You clicked over Buckingham Palace",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position == 8){

                Toast.makeText(
                    context,
                    "You clicked over Las Vegas",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position == 9){

                Toast.makeText(
                    context,
                    "You clicked over Hollywood",
                    Toast.LENGTH_LONG
                ).show()
            }

            if(position == 10){

                Toast.makeText(
                    context,
                    "You clicked over Pasar Apung",
                    Toast.LENGTH_LONG
                ).show()
        }

        val model = arrayList.get(position)
           if(position == 0){
               val intent = Intent(context,hall_activity::class.java)
               context.startActivity(intent)
           }

        }
    }


}