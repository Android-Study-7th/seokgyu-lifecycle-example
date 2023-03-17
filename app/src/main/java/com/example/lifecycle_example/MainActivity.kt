package com.example.lifecycle_example

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_1).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout, FirstFragment())
                .commit()
        }

        findViewById<Button>(R.id.btn_2).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout, SecondFragment())
                .commit()
        }

        Log.d("LifeCycle", "Activity: onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "Activity: onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "Activity: onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "Activity: onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "Activity: onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "Activity: onDestroy()")
    }
}

