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
        Log.d(tag, "Activity A: onCreate")
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "Activity A: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "Activity A: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "Activity A: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "Activity A: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "Activity A: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "Activity A: onDestroy")
    }
}