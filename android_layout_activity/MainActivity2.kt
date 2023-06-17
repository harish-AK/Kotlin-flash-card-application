package com.example.android_layout_activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//import android.os.Bundle
import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showToast("onCreate")
    }

    override fun onStart() {
        super.onStart()
        showToast("onStart")
    }

    override fun onResume() {
        super.onResume()
        showToast("onResume")
    }

    override fun onPause() {
        super.onPause()
        showToast("onPause")
    }

    override fun onStop() {
        super.onStop()
        showToast("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast("onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        showToast("onRestart")
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
