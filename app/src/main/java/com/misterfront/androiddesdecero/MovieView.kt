package com.misterfront.androiddesdecero

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MovieView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    private val cover: ImageView
    private val title: TextView

    init {
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.view_movie, this, true)
    }
}