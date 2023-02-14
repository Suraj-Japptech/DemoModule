package com.example.demomodule

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EmptyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)

        val mt = findViewById<TextView>(R.id.empty)

        mt.setOnClickListener {
            Toast.makeText(this,"Yes I'm Empty",Toast.LENGTH_LONG).show()
        }
    }
}