package com.muse.muskot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager

class america_activity : AppCompatActivity() {

    internal lateinit var viewPager1 : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.america_activity)

        viewPager1 = findViewById<View>(R.id.viewPager) as ViewPager
        val adapter = ViewPageAdapter5(this)
        viewPager1.adapter = adapter
    }
}
