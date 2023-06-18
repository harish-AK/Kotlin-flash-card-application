package com.example.alert_dialog

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AlertDialog.Builder(this)
            .setTitle("Dialog Title")
            .setMessage("This is a dialog message!")
            .setPositiveButton("OK") { dialog, which -> // Handle OK button click
                dialog.dismiss()
            }
            .show()

    }
}