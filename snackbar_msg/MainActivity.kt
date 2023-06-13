package com.example.snackbar_msg


import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val snackbarButton = findViewById<Button>(R.id.snackbarButton)
        snackbarButton.setOnClickListener { v -> showSnackbar(v, "A message via  Snackbar!") }
    }

    private fun showSnackbar(view: View, message: String) {
        val snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG)
        snackbar.show()
    }
}
// used at bottom of page , to show important messages