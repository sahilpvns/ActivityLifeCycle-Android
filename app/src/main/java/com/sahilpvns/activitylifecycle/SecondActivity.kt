package com.sahilpvns.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private val tag = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "Activity B: onCreate")
        setContentView(R.layout.activity_second)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "Activity B: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "Activity B: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "Activity B: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "Activity B: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "Activity B: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "Activity B: onDestroy")
    }
}