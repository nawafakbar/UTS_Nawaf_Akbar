package com.nawaf.uts

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailGambar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gambar)
        val ImagesResId = intent.getIntExtra("data", 0)
        val title = intent.getStringExtra("data1")

        val imageView = findViewById<ImageView>(R.id.a)
        val a = findViewById<TextView>(R.id.b)
        imageView.setImageResource(ImagesResId)
        a.setText(title)

    }
}