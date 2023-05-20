package com.example.tutionfee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name = findViewById<EditText>(R.id.ET1)
        var radiogroup = findViewById<RadioGroup>(R.id.RG1)
        var button = findViewById<Button>(R.id.BT1)

        var radiogroup2=findViewById<RadioGroup>(R.id.RG2)
        button.setOnClickListener {
            var selection = radiogroup.checkedRadioButtonId
            var radiobutton = findViewById<RadioButton>(selection)
            var course=findViewById<RadioButton>(radiogroup2.checkedRadioButtonId)

            if (radiobutton.text=="Male"){
                Toast.makeText(this,"${"Mr."+name.getText().toString()+"You selected "+course.getText().toString()}",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"${"Ms."+name.getText().toString()+"You selected "+course.getText().toString()}",Toast.LENGTH_LONG).show()
            }

        }
    }
}