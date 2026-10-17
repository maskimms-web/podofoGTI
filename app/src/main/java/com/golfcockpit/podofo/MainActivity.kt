package com.golfcockpit.podofo

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {
    private lateinit var cockpit: WebView

    @Suppress("DEPRECATION")
    private fun immersive() {
        window.decorView.systemUiVisibility = (
            View.SYSTEM_UI_FLAG_FULLSCREEN or
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
            View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        immersive()
        window.addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        cockpit = WebView(this)
        cockpit.settings.javaScriptEnabled = true
        cockpit.settings.domStorageEnabled = false
        cockpit.settings.useWideViewPort = true
        cockpit.settings.loadWithOverviewMode = true
        cockpit.settings.allowFileAccess = true
        cockpit.settings.allowContentAccess = false
        cockpit.webViewClient = WebViewClient()
        cockpit.webChromeClient = WebChromeClient()
        setContentView(cockpit)
        cockpit.loadUrl("file:///android_asset/index.html")
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) immersive()
    }

    override fun onDestroy() {
        cockpit.destroy()
        super.onDestroy()
    }
}
