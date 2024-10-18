package com.sahilpvns.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private val tag = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(tag, "Activity B: onCreate")
        setContentView(R.layout.activity_second)
    }

    override fun onStart() {
        super.onStart()
        Log.e(tag, "Activity B: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(tag, "Activity B: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(tag, "Activity B: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(tag, "Activity B: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(tag, "Activity B: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(tag, "Activity B: onDestroy")
    }
}