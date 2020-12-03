package com.muse.muskot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager

class hall_activity : AppCompatActivity() {

    internal lateinit var viewPager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hall_activity)

        viewPager = findViewById<View>(R.id.viewPager) as ViewPager
        val adapter = ViewPageAdapter(this)
        viewPager.adapter = adapter
    }
}
