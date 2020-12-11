package com.example.fatcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val weight = intent.getStringExtra("weight")!!.toInt()
        val height = intent.getStringExtra("height")!!.toInt()
        val res = findViewById<TextView>(R.id.resultText)
        val img = findViewById<ImageView>(R.id.imgView)

        val bmi = weight.div(Math.pow(height.div(100.0),2.0))

        when{
            bmi >= 35 -> res.text = "Highest fat.."
            bmi >= 30 -> res.text = "2 level fat.."
            bmi >= 25 -> res.text = "1 level fat"
            bmi >= 23 -> res.text = "High Weight"
            bmi >= 18.5 -> res.text = "Normal!"
            else -> res.text = "Low fat"
        }

        when{
            bmi >= 23 -> img.setImageResource(R.drawable.ic_baseline_pan_tool_24)
            bmi >= 18.5 -> img.setImageResource(R.drawable.ic_baseline_emoji_emotions_24)
            else -> img.setImageResource(R.drawable.ic_baseline_mood_bad_24)
        }
    }
}