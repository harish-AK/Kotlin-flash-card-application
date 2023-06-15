package com.example.implicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ed=findViewById<EditText>(R.id.ED1)
        val bt=findViewById<Button>(R.id.BT1)
        bt.setOnClickListener{
            val msg=ed.getText().toString()
            val intent= Intent()
            intent.action=Intent.ACTION_SEND //action is a state
            intent.putExtra(Intent.EXTRA_TEXT,msg)   //intent.() means behaviour
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"share VIA"))
        }
    }
}