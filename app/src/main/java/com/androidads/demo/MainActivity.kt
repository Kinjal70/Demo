package com.androidads.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.toasty.constant.showToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast("Hello this is demo")
    }
}