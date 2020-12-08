package com.example.fatcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rb = findViewById<Button>(R.id.resultButton)
        val weight = findViewById<EditText>(R.id.weightEditText)
        val height = findViewById<EditText>(R.id.heightEditText)

       rb.setOnClickListener {
            //val intent = Intent(this, ResultActivity::class.java)
            //intent.putExtra("weight", weight.text.toString())
            //intent.putExtra("height", height.text.toString())
            //startActivity(intent)

            startActivity<ResultActivity>( // with anko library
                "weight" to weight.text.toString(),
                "height" to height.text.toString()
            )
        }
    }
}