package com.example.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView



class MainActivity : AppCompatActivity() {
    var myWebView : WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myWebView = findViewById<View>(R.id.webview) as WebView
        myWebView!!.loadUrl("file://app.assets/index.html")
        myWebView!!.settings.javaScriptEnabled = true
        myWebView!!.webChromeClient = WebChromeClient()

    }
}