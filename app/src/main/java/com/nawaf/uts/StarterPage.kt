package com.nawaf.uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StarterPage : AppCompatActivity() {

    private lateinit var gas : Button
    private lateinit var gas2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_starter_page)

        gas = findViewById(R.id.c)
        gas.setOnClickListener(){
            val a = Intent(this, LoginPage::class.java)
            startActivity(a)
        }

        gas2 = findViewById(R.id.d)
        gas2.setOnClickListener(){
            val a = Intent(this, AkunBaruPage::class.java)
            startActivity(a)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}