package com.muse.muskot

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class ViewPageAdapter(private val context: Context) : PagerAdapter(){
    private var layoutInflater: LayoutInflater?=null
    private val images = arrayOf(R.drawable.hall, R.drawable.hall1,R.drawable.hall2,R.drawable.hall3,R.drawable.hall4,R.drawable.hall5)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
    return view === `object`
    }
    override fun getCount(): Int {
       return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout, null)
        val image = v.findViewById<View>(R.id.image_view) as ImageView
        image.setImageResource(images[position])

        val vp= container as ViewPager
        vp.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}



class ViewPageAdapter1(private val context: Context) : PagerAdapter(){
    private var layoutInflater: LayoutInflater?=null
    private val images = arrayOf(R.drawable. area_garbarata, R.drawable.areagarbarata1,R.drawable.garbarata2,R.drawable.garbarata3)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout, null)
        val image = v.findViewById<View>(R.id.image_view) as ImageView
        image.setImageResource(images[position])

        val vp= container as ViewPager
        vp.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}

class ViewPageAdapter2(private val context: Context) : PagerAdapter(){
    private var layoutInflater: LayoutInflater?=null
    private val images = arrayOf(R.drawable.runway27airport, R.drawable. runway1,R.drawable.runway2,R.drawable.runway3)

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout, null)
        val image = v.findViewById<View>(R.id.image_view) as ImageView
        image.setImageResource(images[position])

        val vp= container as ViewPager
        vp.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}

class ViewPageAdapter3(private val context: Context) : PagerAdapter(){
    private var layoutInflater: LayoutInflater?=null
    private val images = arrayOf(R.drawable.pecinan_zone, R.drawable. pecinan1,R.drawable.pecinan2)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout, null)
        val image = v.findViewById<View>(R.id.image_view) as ImageView
        image.setImageResource(images[position])

        val vp= container as ViewPager
        vp.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}

class ViewPageAdapter4(private val context: Context) : PagerAdapter(){
    private var layoutInflater: LayoutInflater?=null
    private val images = arrayOf(R.drawable.batavia_zone, R.drawable. batavia1,R.drawable.batavia2,R.drawable.batavia3,R.drawable.batavia4,R.drawable.batavia5,R.drawable.batavia6)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout, null)
        val image = v.findViewById<View>(R.id.image_view) as ImageView
        image.setImageResource(images[position])

        val vp= container as ViewPager
        vp.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}

class ViewPageAdapter5(private val context: Context) : PagerAdapter(){
    private var layoutInflater: LayoutInflater?=null
    private val images = arrayOf(R.drawable.america_zone, R.drawable. amerika,R.drawable. amerika1,R.drawable. amerika2,R.drawable. amerika3,R.drawable. amerika4,R.drawable. amerika5)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout, null)
        val image = v.findViewById<View>(R.id.image_view) as ImageView
        image.setImageResource(images[position])

        val vp= container as ViewPager
        vp.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}

class ViewPageAdapter6(private val context: Context) : PagerAdapter(){
    private var layoutInflater: LayoutInflater?=null
    private val images = arrayOf(R.drawable.europe_zone, R.drawable. eropa,R.drawable. eropa1,R.drawable. eropa2,R.drawable. eropa3,R.drawable. eropa4)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout, null)
        val image = v.findViewById<View>(R.id.image_view) as ImageView
        image.setImageResource(images[position])

        val vp= container as ViewPager
        vp.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}

class ViewPageAdapter7(private val context: Context) : PagerAdapter(){
    private var layoutInflater: LayoutInflater?=null
    private val images = arrayOf(R.drawable.buckingham, R.drawable. buckingham1,R.drawable. buckingham2,R.drawable. buckingham3,R.drawable. buckingham4,R.drawable. buckingham5,R.drawable. buckingham6,R.drawable. buckingham7)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout, null)
        val image = v.findViewById<View>(R.id.image_view) as ImageView
        image.setImageResource(images[position])

        val vp= container as ViewPager
        vp.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}

class ViewPageAdapter8(private val context: Context) : PagerAdapter(){
    private var layoutInflater: LayoutInflater?=null
    private val images = arrayOf(R.drawable.las_vegas, R.drawable.lasvegas1,R.drawable.lasvegas2,R.drawable.lasvegas3)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout, null)
        val image = v.findViewById<View>(R.id.image_view) as ImageView
        image.setImageResource(images[position])

        val vp= container as ViewPager
        vp.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}

class ViewPageAdapter9(private val context: Context) : PagerAdapter(){
    private var layoutInflater: LayoutInflater?=null
    private val images = arrayOf(R.drawable.hollywood, R.drawable.hollywood1,R.drawable.hollywood2,R.drawable.hollywood3,R.drawable.hollywood4,R.drawable.hollywood5,R.drawable.hollywood6)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout, null)
        val image = v.findViewById<View>(R.id.image_view) as ImageView
        image.setImageResource(images[position])

        val vp= container as ViewPager
        vp.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}
class ViewPageAdapter10(private val context: Context) : PagerAdapter(){
    private var layoutInflater: LayoutInflater?=null
    private val images = arrayOf(R.drawable.pasar1,R.drawable.pasar2,R.drawable.pasar3,R.drawable.pasar4)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout, null)
        val image = v.findViewById<View>(R.id.image_view) as ImageView
        image.setImageResource(images[position])

        val vp= container as ViewPager
        vp.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}
