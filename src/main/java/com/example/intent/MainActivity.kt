package com.example.intent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ed1=findViewById<EditText>(R.id.ed1)

        var ed2=findViewById<EditText>(R.id.ed2)
        var nextBT=findViewById<Button>(R.id.next)
        var tv1=findViewById<TextView>(R.id.tv1)
        nextBT.setOnClickListener{
            var ed11=ed1.text.toString()
            var ed22=ed2.text.toString().toInt()
                    if(ed22<60){
                        var res="${ed11} bitch not eligible "
                        tv1.text=res

                    }
                    else if(ed22>60 && ed22<80){
                        val intent = Intent(this, MainActivity2::class.java)
                        intent.putExtra("inputValue", ed11)
                        startActivity(intent)
                    }
                    else if(ed22>80 && ed22<100){
                        val intent=Intent(this,MainActivity3::class.java)
                        intent.putExtra("inputValue",ed11)
                        startActivity(intent)
                    }

        }


        }

    }

