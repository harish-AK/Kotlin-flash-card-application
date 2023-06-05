package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var tvaiml=findViewById<TextView>(R.id.tvAiml)
        val inputValue = intent.getStringExtra("inputValue")
        tvaiml.setText(" Hi "+inputValue+" eligible to select AIML")

    }
}