package com.example.toggle_and_image_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var togg=findViewById<ToggleButton>(R.id.TB)
        var img=findViewById<ImageView>(R.id.img)
        img.setImageResource(R.drawable.img_view)
        togg.setOnClickListener{
            if(togg.isChecked()){
                Toast.makeText(this,"Switch is on",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Switch is off",Toast.LENGTH_SHORT).show()
            }
        }
    }
}