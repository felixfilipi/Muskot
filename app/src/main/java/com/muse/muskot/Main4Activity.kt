package com.muse.muskot


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import androidx.appcompat.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.chrisbanes.photoview.PhotoView
import kotlinx.android.synthetic.main.activity_main4.*
import java.util.*
import kotlin.collections.ArrayList


class Main4Activity : AppCompatActivity() {

    val arrayList = ArrayList<Model>()
    val displayList = ArrayList<Model>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        val photoView =  findViewById(R.id.photo_view) as PhotoView
        photoView.setImageResource(R.drawable.peta_zona)


        arrayList.add(Model("Hall", "This is Hall description", R.drawable.hall))
        arrayList.add(Model("Area Garbarata", "This is Area Garbarata description", R.drawable.area_garbarata))
        arrayList.add(Model("Runway 27 Airport", "This is Runway 27 Airport description", R.drawable.runway27airport))
        arrayList.add(Model("Pecinan Zone", "This is Pecinan Zone description", R.drawable.pecinan_zone))
        arrayList.add(Model("Batavia Zone", "This is Batavia Zone description", R.drawable.batavia_zone))
        arrayList.add(Model("America Zone", "This is America Zone description", R.drawable.america_zone))
        arrayList.add(Model("Europe Zone", "This is Europe Zone description", R.drawable.europe_zone))
        arrayList.add(Model("Buckingham Palace", "This is Buckingham Palace description", R.drawable.buckingham))
        arrayList.add(Model("Las Vegas", "This is Las Vegas description", R.drawable.las_vegas))
        arrayList.add(Model("Hollywood", "This is Hollywood description", R.drawable.hollywood))
        arrayList.add(Model("Pasar Apung", "This is Pasar Apung description", R.drawable.pasar_apung))
        arrayList.add(Model("Extra", "This is Extra description", R.drawable.extra))

        displayList.addAll(arrayList)
        val myAdapter = MyAdapter (displayList,this)
        ViewCompat.setNestedScrollingEnabled(recyclerView, false);
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu, menu)
        val menuItem = menu!!.findItem(R.id.search)

        if (menuItem != null){

            val searchView = menuItem.actionView as SearchView

            val editText = searchView.findViewById<EditText>(androidx.appcompat.R.id.search_src_text)
            editText.hint = "Search..."

            searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {

                    if(newText!!.isNotEmpty()){

                        displayList.clear()
                        val search = newText.toLowerCase(Locale.getDefault())
                        arrayList.forEach{

                            if(it.title.toLowerCase(Locale.getDefault()). contains(search)){
                                displayList.add(it)
                            }
                        }
                        recyclerView.adapter!!.notifyDataSetChanged()
                    }

                    else{

                        displayList.clear()
                        displayList.addAll(arrayList)
                        recyclerView.adapter!!.notifyDataSetChanged()

                    }
                   return true
                }

            })
        }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

}




