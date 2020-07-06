package com.example.dicecountroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the Button view from the layout and assign a click
        // listener to it.
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener { countUp() }
    }

    /**
     * Click listener for the Roll button.
     */
    private fun rollDice() {
        val randomInt= (0..0).random()

        val resultText: TextView = findViewById(R.id.textView)
        resultText.text = randomInt.toString()
    }

    /**
     * Click listener for the countUp button.
     */
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.textView)

        // If text is the default "Hello World!" set that text to 1.
        if (resultText.text == "Hello") {
            resultText.text = "0"
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 1000) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }
}