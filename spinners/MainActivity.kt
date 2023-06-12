package com.example.spinners

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

 class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    // Declare the category array as a class variable
    private val category = arrayOf("AIML","CYS","MED","DATA ANALYST")

    private var selectedOption: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the spinner view by its id
        val sp = findViewById<Spinner>(R.id.coursesspinner)

        // Set the current activity as the listener for spinner item selection
        sp.onItemSelectedListener = this

        // Create an ArrayAdapter with the category array
        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            category
        )

        // Set the dropdown layout style
      //  adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Set the adapter on the spinner
        sp.adapter = adapter

        // Find the button view by its id

    }

    override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
        // Set the selected option

        val button = findViewById<Button>(R.id.BT)

        // Set OnClickListener to the button
        button.setOnClickListener {
            val edit_txt = findViewById<EditText>(R.id.ED1)
            val display = StringBuilder()
            selectedOption = category[position].toString()
            val selectedOptionInt = selectedOption
            val editInt = edit_txt.getText().toString()
            val tex = findViewById<TextView>(R.id.TV2)

            if (selectedOption =="AIML" && editInt != null) {
              //  val difference = selectedOptionInt - editInt
                display.append("You have selected  $selectedOption"+" fee is 200000 $editInt")
                tex.text = display
            }
                if (selectedOption =="CYS" && editInt != null) {
                    //  val difference = selectedOptionInt - editInt
                    display.append("You have selected  $selectedOption"+" fee is 300000 $editInt")
                    tex.text = display
                }
                    if (selectedOption =="MED" && editInt != null) {
                        //  val difference = selectedOptionInt - editInt
                        display.append("You have selected  $selectedOption"+" fee is 400000 $editInt")
                        tex.text = display
                    }
                        if (selectedOption =="DATA ANALYST" && editInt != null) {
                            //  val difference = selectedOptionInt - editInt
                            display.append("You have selected  $selectedOption"+" fee is 200000 $editInt")
                            tex.text = display
                        }
            }



        }
     override fun onNothingSelected(parent: AdapterView<*>?) {
         // Handle the case when no item is selected
     }

 }



