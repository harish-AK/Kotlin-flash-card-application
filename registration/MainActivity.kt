package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp.R
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var submit=findViewById<Button>(R.id.button)
        var name=findViewById<EditText>(R.id.editTextTextPersonName)

        submit.setOnClickListener {
            Toast.makeText(this,"Hello "+name.getText().toString(),Toast.LENGTH_SHORT).show()

            }
        }
}
