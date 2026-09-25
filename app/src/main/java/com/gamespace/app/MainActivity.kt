package com.gamespace.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this).apply {
            text = "Game Space Engine Initialized"
            textSize = 20f
            setPadding(50, 50, 50, 50)
        }
        setContentView(textView)
    }
}
