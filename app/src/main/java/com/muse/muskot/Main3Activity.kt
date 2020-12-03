package com.muse.muskot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {
    private var mediaPlayer : MediaPlayer?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        mediaPlayer = MediaPlayer.create(this,R.raw.mp3)

        buttonsong.setOnClickListener{
            mediaPlayer?.start()
        }
    }

}
