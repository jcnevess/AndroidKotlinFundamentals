package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var boxOneText: TextView
    lateinit var boxTwoText: TextView
    lateinit var boxThreeText: TextView
    lateinit var boxFourText: TextView
    lateinit var boxFiveText: TextView

    lateinit var rootConstraintLayout: View

    lateinit var redButton: Button
    lateinit var greenButton: Button
    lateinit var yellowButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxFourText.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFiveText.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {
        boxOneText = findViewById(R.id.box_one_text)
        boxTwoText = findViewById(R.id.box_two_text)
        boxThreeText = findViewById(R.id.box_three_text)
        boxFourText = findViewById(R.id.box_four_text)
        boxFiveText = findViewById(R.id.box_five_text)

        rootConstraintLayout = findViewById(R.id.constraint_layout)

        redButton = findViewById(R.id.red_button)
        greenButton = findViewById(R.id.green_button)
        yellowButton = findViewById(R.id.yellow_button)

        val clickableViews: List<View> =
                listOf(boxOneText, boxTwoText, boxThreeText,
                        boxFourText, boxFiveText, rootConstraintLayout,
                        redButton, greenButton, yellowButton)

        for (view in clickableViews) {
            view.setOnClickListener { makeColored(it) }
        }
    }
}