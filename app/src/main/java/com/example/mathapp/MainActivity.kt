package com.example.mathapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)
        val button1 = findViewById<Button>(R.id.button1)
        val txtView2 = findViewById<TextView>(R.id.txtView2)


        button1.setOnClickListener {
           val num1 = number1.text.toString().toInt()
           val num2 = number2.text.toString().toInt()

            val sum = num1 + num2
            txtView2.text = sum.toString()
        }
    }
}