package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var actionBar : ActionBar?
        actionBar = supportActionBar;
        actionBar?.hide()

        var tv = findViewById(R.id.CountNum) as TextView
        var cnt = 1
        kotlin.concurrent.timer(period = 1000){
            runOnUiThread {
                tv.text = "$cnt"
                cnt += 1
            }
        }
    }
}