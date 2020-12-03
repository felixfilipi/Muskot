package com.muse.muskot
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.row.view.*
import kotlinx.android.synthetic.main.row2.view.*


class MyAdapter (val arrayList: ArrayList<Model>,val context: Context) :

    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(model: Model) {
            itemView.titleTv.text = model.title
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

        holder.itemView.setOnClickListener {
            if (position == 0) {

                Toast.makeText(
                    context,
                    "You clicked over Hall",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 1) {

                Toast.makeText(
                    context,
                    "You clicked over Area Garbarata",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 2) {

                Toast.makeText(
                    context,
                    "You clicked over Runway 27 Airport",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 3) {

                Toast.makeText(
                    context,
                    "You clicked over Pecinan Zone",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 4) {

                Toast.makeText(
                    context,
                    "You clicked over Batavia Zone",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 5) {

                Toast.makeText(
                    context,
                    "You clicked over America Zone",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 6) {

                Toast.makeText(
                    context,
                    "You clicked over Europe Zone",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 7) {

                Toast.makeText(
                    context,
                    "You clicked over Buckingham Palace",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 8) {

                Toast.makeText(
                    context,
                    "You clicked over Las Vegas",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 9) {

                Toast.makeText(
                    context,
                    "You clicked over Hollywood",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 10) {

                Toast.makeText(
                    context,
                    "You clicked over Pasar Apung",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 11) {

                Toast.makeText(
                    context,
                    "You clicked over Extra",
                    Toast.LENGTH_LONG
                ).show()
            }

            val model = arrayList.get(position)
            if (position == 0) {
                val intent = Intent(context, hall_activity::class.java)
                context.startActivity(intent)
            }
            if (position == 1) {
                val intent = Intent(context, garbarta_activity::class.java)
                context.startActivity(intent)
            }
            if (position == 2) {
                val intent = Intent(context, runway_activity::class.java)
                context.startActivity(intent)
            }
            if (position == 3) {
                val intent = Intent(context, pecinan_activity::class.java)
                context.startActivity(intent)
            }
            if (position == 4) {
                val intent = Intent(context, batavia_activity::class.java)
                context.startActivity(intent)
            }
            if (position == 5) {
                val intent = Intent(context, america_activity::class.java)
                context.startActivity(intent)
            }
            if (position == 6) {
                val intent = Intent(context, eropa_activity::class.java)
                context.startActivity(intent)
            }
            if (position == 7) {
                val intent = Intent(context, buckingham_activity::class.java)
                context.startActivity(intent)
            }
            if (position == 8) {
                val intent = Intent(context, lasvegas_activity::class.java)
                context.startActivity(intent)
            }
            if (position == 9) {
                val intent = Intent(context, hollywood_activity::class.java)
                context.startActivity(intent)
            }
            if (position == 10) {
                val intent = Intent(context, pasar_activity::class.java)
                context.startActivity(intent)
            }

            if (position == 11) {
                val intent = Intent(context,ExtraActivity::class.java)
                context.startActivity(intent)
            }
        }
        }
        }


class MyAdapter2 (val arrayList1: ArrayList<Model2>,val context: Context) :

    RecyclerView.Adapter<MyAdapter2.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(model: Model2) {
            itemView.titleTv2.text = model.title
            itemView.descriptionTv2.text = model.des
            itemView.imageIv2.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row2, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList1.size
    }


    override fun onBindViewHolder(holder: MyAdapter2.ViewHolder, position: Int) {
        holder.bindItem(arrayList1[position])

        holder.itemView.setOnClickListener {
            if (position == 0) {

                Toast.makeText(
                    context,
                    "You clicked over prominent collection",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 1) {

                Toast.makeText(
                    context,
                    "You clicked over events",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 2) {

                Toast.makeText(
                    context,
                    "You clicked over facilites",
                    Toast.LENGTH_LONG
                ).show()
            }


            val model = arrayList1.get(position)
            if (position == 0) {
                val intent = Intent(context, koleksiActivity::class.java)
                context.startActivity(intent)
            }
            if (position == 1) {
                val intent = Intent(context, EventActivity::class.java)
                context.startActivity(intent)
            }
            if (position == 2) {
                val intent = Intent(context, FasilitasActivity::class.java)
                context.startActivity(intent)
            }


        }
    }
    }
