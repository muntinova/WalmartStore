package com.example.walmartstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun forgetPassword(view: android.view.View) {}
    fun signUp(view: android.view.View) {}
    fun signIn(view: android.view.View) {}
}