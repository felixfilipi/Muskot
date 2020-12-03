package com.muse.muskot


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.chrisbanes.photoview.PhotoView
import kotlinx.android.synthetic.main.activity_main4.*
import java.util.*
import kotlin.collections.ArrayList


class ExtraActivity : AppCompatActivity() {

    val arrayList1 = ArrayList<Model2>()
    val displayList1 = ArrayList<Model2>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra)


        arrayList1.add(Model2("Koleksi yang Menonjol", "Prominent collection description", R.drawable.extra1))
        arrayList1.add(Model2("Event-Event", "Events description", R.drawable.event1))
        arrayList1.add(Model2("Fasilitas-Fasilitas", "Facilites description", R.drawable.pasar1))

        displayList1.addAll(arrayList1)
        val myAdapter = MyAdapter2 (displayList1,this)
        ViewCompat.setNestedScrollingEnabled(recyclerView, false);
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter


    }

    override fun onCreateOptionsMenu(menu2: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu2, menu2)
        val menuItem = menu2!!.findItem(R.id.search2)

        if (menuItem != null){

            val searchView = menuItem.actionView as SearchView

            searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {

                    if(newText!!.isNotEmpty()){

                        displayList1.clear()
                        val search = newText.toLowerCase(Locale.getDefault())
                        arrayList1.forEach{

                            if(it.title.toLowerCase(Locale.getDefault()). contains(search)){
                                displayList1.add(it)
                            }
                        }
                        recyclerView.adapter!!.notifyDataSetChanged()
                    }

                    else{

                        displayList1.clear()
                        displayList1.addAll(arrayList1)
                        recyclerView.adapter!!.notifyDataSetChanged()
                    }
                    return true
                }

            })
        }
        return super.onCreateOptionsMenu(menu2)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

}




