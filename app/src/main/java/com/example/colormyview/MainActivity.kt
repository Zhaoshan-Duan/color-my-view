package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colormyview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }
    private fun setListeners() {
        val clickableViews : List<View> = listOf(binding.boxOneText, binding.boxTwoText, binding.boxThreeText, binding.boxFourText, binding.boxFiveText,
            binding.constraintLayout,
            binding.yellowButton, binding.redButton, binding.greenButton
            )
        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(it: View) {
        when (it.id) {
            // Boxes using Color class colors for background
            R.id.box_one_text -> it.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> it.setBackgroundColor(Color.GRAY)
            // Boxes using Android color resources for background
            R.id.box_three_text -> it.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> it.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> it.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> binding.boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> binding.boxFourText.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> binding.boxFiveText.setBackgroundResource(R.color.my_green)

            else -> it.setBackgroundColor(Color.LTGRAY)
        }


    }


}