package com.muse.muskot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager

class garbarta_activity : AppCompatActivity() {

    internal lateinit var viewPager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garbarata_activity)

        viewPager = findViewById<View>(R.id.viewPager) as ViewPager
        val adapter = ViewPageAdapter1(this)
        viewPager.adapter = adapter
    }
}
