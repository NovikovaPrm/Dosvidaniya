package com.example.dosvidaniya

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)
        val button_counter: Button = findViewById((R.id.button_counter))
        button.setOnClickListener {
            textView.text = "Чо каво?"
            it.setBackgroundColor(Color.DKGRAY)
        }
        button_counter.setOnClickListener {
            textView.text = "Я насчитал ${++counter} ворон"
        }
    }
}