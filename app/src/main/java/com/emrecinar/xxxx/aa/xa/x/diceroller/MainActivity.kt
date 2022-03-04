package com.emrecinar.xxxx.aa.xa.x.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

/**
 * This activity allows the user to roll a dice and view the result on the screen
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener {

            rollDice()

        }

        rollDice()
    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
        val dice = Dice(6)

        val diceRoll1 = dice.roll()

        val imageLeft : ImageView = findViewById(R.id.imageView)

        when (diceRoll1) {
            1 -> imageLeft.setImageResource(R.drawable.dice_1)
            2 -> imageLeft.setImageResource(R.drawable.dice_2)
            3 -> imageLeft.setImageResource(R.drawable.dice_3)
            4 -> imageLeft.setImageResource(R.drawable.dice_4)
            5 -> imageLeft.setImageResource(R.drawable.dice_5)
            else -> imageLeft.setImageResource(R.drawable.dice_6)

        }

        val diceRoll2 = dice.roll()
        val imageRight : ImageView = findViewById(R.id.imageView2)

        when (diceRoll2) {
            1 -> imageRight.setImageResource(R.drawable.dice_1)
            2 -> imageRight.setImageResource(R.drawable.dice_2)
            3 -> imageRight.setImageResource(R.drawable.dice_3)
            4 -> imageRight.setImageResource(R.drawable.dice_4)
            5 -> imageRight.setImageResource(R.drawable.dice_5)
            else -> imageRight.setImageResource(R.drawable.dice_6)

        }

    }
}

/**
 * Creates Dice class and roll function
 */
class Dice(private val numSides : Int) {
    fun roll() : Int {
        return (1..numSides).random()
    }
}