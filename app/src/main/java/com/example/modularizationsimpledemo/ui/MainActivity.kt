package com.example.modularizationsimpledemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modularizationsimpledemo.R
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}