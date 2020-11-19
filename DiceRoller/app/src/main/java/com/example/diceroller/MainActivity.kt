package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener{ countUp() }
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val result = resultText.text.toString().toIntOrNull() // tries to convert the text to a number

        // if the text is not a number
        if (result == null) {
            resultText.text = 1.toString()
        } else if (result != 6) {
            resultText.text = (result + 1).toString()
        }
    }


    private fun rollDice() {
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }
}