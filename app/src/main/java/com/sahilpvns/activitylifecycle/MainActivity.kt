package com.sahilpvns.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val tag = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(tag, "Activity A: onCreate")
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e(tag, "Activity A: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(tag, "Activity A: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(tag, "Activity A: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(tag, "Activity A: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(tag, "Activity A: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(tag, "Activity A: onDestroy")
    }
}