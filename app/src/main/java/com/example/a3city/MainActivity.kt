package com.example.a3city

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gdynia = findViewById<TextView>(R.id.textView4)
        val gdansk = findViewById<TextView>(R.id.textView3)
        val sopot = findViewById<TextView>(R.id.textView5)

        gdynia.setOnClickListener {
            val intent = Intent(this, GdyniaActivity::class.java)
            startActivity(intent)
        }

        gdansk.setOnClickListener {
            val intent = Intent(this, GdanskActivity::class.java)
            startActivity(intent)
        }

        sopot.setOnClickListener {
            val intent = Intent(this, SopotActivity::class.java)
            startActivity(intent)
        }
    }
}