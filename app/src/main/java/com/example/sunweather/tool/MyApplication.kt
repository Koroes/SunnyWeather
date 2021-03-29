package com.example.sunweather.tool

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class MyApplication: Application() {
    companion object{
        @SuppressLint("StartFiledLeak")
        lateinit var context:Context
    }
    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}