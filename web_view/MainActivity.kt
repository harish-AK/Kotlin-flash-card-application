package com.example.web_view

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt = findViewById<Button>(R.id.Bt)
        bt.setOnClickListener {

            webView = findViewById(R.id.webview)
            webView.webViewClient = WebViewClient()
            webView.loadUrl("https://en.wikipedia.org/wiki/Adolf_Hitler")


        // Override onBackPressed() to handle back navigation in the WebView
        fun onBackPressed() {
            if (::webView.isInitialized && webView.canGoBack()) {
                webView.goBack()
            } else {
                super.onBackPressed()
            }
        }
        }
    }
}
