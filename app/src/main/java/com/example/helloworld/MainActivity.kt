package com.example.helloworld

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var increment = findViewById<Button>(R.id.increment_button)
        var view = findViewById<TextView>(R.id.textView)

        var count = 0
        increment.setOnClickListener {
            count++
            view.text = count.toString()


        }
    }
}