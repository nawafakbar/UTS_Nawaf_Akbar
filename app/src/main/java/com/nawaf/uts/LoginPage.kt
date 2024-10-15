package com.nawaf.uts

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : AppCompatActivity() {


    private lateinit var gas : TextView
    private lateinit var gas2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        gas = findViewById(R.id.txt_signup)
        gas.setOnClickListener(){
            val a = Intent(this, AkunBaruPage::class.java)
            startActivity(a)
        }

        gas2 = findViewById(R.id.login)
        gas2.setOnClickListener(){
            val a = Intent(this, ListOrderPage::class.java)
            startActivity(a)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}