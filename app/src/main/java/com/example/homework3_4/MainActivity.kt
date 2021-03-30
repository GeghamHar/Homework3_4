package com.example.homework3_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNumber1 = findViewById<EditText>(R.id.number1)
        val inputNumber2 = findViewById<EditText>(R.id.number2)
        val plus = findViewById<Button>(R.id.plusbutton)
        val minus = findViewById<Button>(R.id.minusbutton)
        val mult = findViewById<Button>(R.id.multbutton)
        val devide = findViewById<Button>(R.id.devidebutton)
        val result = findViewById<TextView>(R.id.result)

        plus.setOnClickListener {
            var number1 = inputNumber1.text.toString().toInt()
            var number2 = inputNumber2.text.toString().toInt()
            result.text = "${number1 + number2}"

        }

        minus.setOnClickListener {
            var number1 = inputNumber1.text.toString().toInt()
            var number2 = inputNumber2.text.toString().toInt()
            result.text = "${number1 - number2}"

        }

        mult.setOnClickListener {
            var number1 = inputNumber1.text.toString().toInt()
            var number2 = inputNumber2.text.toString().toInt()
            result.text = "${number1 * number2}"

        }

        devide.setOnClickListener {
            var number1 = inputNumber1.text.toString().toInt()
            var number2 = inputNumber2.text.toString().toInt()
            result.text = "${number1/number2}"

        }

    }
}