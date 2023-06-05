package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var tvaiml=findViewById<TextView>(R.id.tvcys)
        val inputValue = intent.getStringExtra("inputValue")
        tvaiml.setText(" Hi "+inputValue+" eligible to select cyber security")

    }
}