package com.misterfront.androiddesdecero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cover = findViewById<AspectRatioImageView>(R.id.cover)
        cover.ratio = 1.5f
    }

}