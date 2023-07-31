package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollDice()
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val dicey = dice.roll()
        val resultImage: ImageView = findViewById(R.id.imageView)
        val drawableResource = when (dicey) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultImage.setImageResource(drawableResource)
        resultImage.contentDescription = dicey.toString()
    }
}

class Dice(private val Numsides: Int) {
    fun roll(): Int {
        val randomNumber = (1..Numsides).random()
        return randomNumber
    }
}