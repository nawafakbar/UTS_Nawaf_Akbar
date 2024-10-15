package com.nawaf.uts

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nawaf.uts.adapte.adaptergambar

class ListOrderPage : AppCompatActivity() {

    private val gambar = arrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.makan2,
        R.drawable.makan5
    )

    private val a1 = arrayOf("Chicken Chury", "Bean and Oil", "Coffe Latte", "Starberry chacke")
    private val a2 = arrayOf("29 Nov, 01:02 pm", "10 Nov, 06:05 pm", "10 Nov, 01:02 pm", "03 Oct, 01:02 pm")
    private val a3 = arrayOf("Order delivered", "Order delivered",  "Order delivered",  "Order delivered")
    private val a4 = arrayOf("$50.00", "$50.00","$08.00","$22.00")
    private val a5 = arrayOf("2 items", "2 items", "1 items", "2 items")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_order_page)

        val gridView = findViewById<GridView>(R.id.rv_gambar)
        val adapter = adaptergambar(this, gambar, a1, a2, a3, a4, a5)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetailGambar::class.java)
            intent.putExtra("data", gambar[position])
            intent.putExtra("data1", a1[position])
            startActivity(intent)
        }

    }
}