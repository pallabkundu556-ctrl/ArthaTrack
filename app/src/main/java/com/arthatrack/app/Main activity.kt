package com.arthatrack.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(24, 24, 24, 24)
        layout.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "ArthaTrack"
        title.textSize = 30f
        title.setTextColor(Color.rgb(25, 100, 65))
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "My Money Manager"
        subtitle.textSize = 18f
        subtitle.setTextColor(Color.DKGRAY)
        subtitle.gravity = Gravity.CENTER

        layout.addView(title)
        layout.addView(subtitle)
        setContentView(layout)
    }
}
