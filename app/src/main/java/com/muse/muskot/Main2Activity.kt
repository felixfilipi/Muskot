package com.muse.muskot

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Button_about.setOnClickListener {
            val intent = Intent(this, Main3Activity::class.java);
            startActivity(intent);
        }

        Button_map_muskot.setOnClickListener {
            val intent = Intent(this, Main4Activity::class.java);
            startActivity(intent);
        }
        button_ar.setOnClickListener {
            val intent = Intent(this, Main5Activity::class.java);
            startActivity(intent);
        }
        Button_ticket.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.traveloka.com/en-id/activities/indonesia/product/museum-angkut-tickets-jatim-park-group-2000625477098"))
            startActivity(intent)
        }

        button_goo_maps.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/place/Museum+Angkut+Malang/@-7.8788203,112.5180388,17z/data=!3m1!4b1!4m5!3m4!1s0x2e78876f26bf722d:0x4c3f0d08417fd649!8m2!3d-7.8788256!4d112.5202275?hl=id"))
            startActivity(intent)
        }


    }
}
