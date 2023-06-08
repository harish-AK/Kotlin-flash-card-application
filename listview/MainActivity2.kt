package com.example.listview
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var tvout=findViewById<TextView>(R.id.tvout)
        val bundle:Bundle?=intent.extras
        var msg=bundle?.getString("J007")
        if (msg=="Apple"){
            tvout.setText(msg+":15000")
        }
        else if(msg=="Samsung"){
            tvout.setText(msg+":23001")
        }
        else if(msg=="vivo"){
            tvout.setText(msg+":35000")

        }
        else if(msg=="poco"){
            tvout.setText(msg+":20000")

        }

        }
}