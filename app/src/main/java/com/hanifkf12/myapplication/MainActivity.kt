package com.hanifkf12.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val button : Button = findViewById(R.id.button)
        Picasso.get()
                .load("https://logos-download.com/wp-content/uploads/2016/05/Android_logo_white-700x162.png")
                .into(imageView)

        button.setOnClickListener {
            Log.d("BINARIAN","NAMAKU HANIF")
        }
    }
}