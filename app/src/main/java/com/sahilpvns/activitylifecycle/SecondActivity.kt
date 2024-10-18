package com.sahilpvns.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private val TAG = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG, "Activity B: onCreate")
        setContentView(R.layout.activity_second)
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "Activity B: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "Activity B: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "Activity B: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "Activity B: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "Activity B: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "Activity B: onDestroy")
    }
}