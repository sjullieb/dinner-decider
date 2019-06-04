package com.example.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodArray = arrayListOf("Russian", "Chinese", "Italian")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showRandomFood()

        decideBtn.setOnClickListener(){
            showRandomFood()
        }

        addFoodBtn.setOnClickListener(){
            foodArray.add(foodEditTxt.text.toString())
            showRandomFood()
            foodEditTxt.text.clear()
        }
    }

    fun randomFood(): String {
        val random = Random()
        val foodRandomIndex = random.nextInt(foodArray.size)
        return foodArray[foodRandomIndex]
    }

    fun showRandomFood() {
        foodNametxt.text = randomFood()
    }
}
