package com.websarva.wings.android.trpg

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class CharacterSheetActivity : AppCompatActivity(){

    private lateinit var str1diceImageView: ImageView
    private lateinit var str2diceImageView: ImageView
    private lateinit var str3diceImageView: ImageView

    private val dice = arrayOf(
        R.drawable.saikoro_illust1,
        R.drawable.saikoro_illust2,
        R.drawable.saikoro_illust3,
        R.drawable.saikoro_illust4,
        R.drawable.saikoro_illust5,
        R.drawable.saikoro_illust6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.character_sheet)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.character_sheet)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        str1diceImageView = findViewById(R.id.str_dice1)
        str2diceImageView = findViewById(R.id.str_dice2)
        str3diceImageView = findViewById(R.id.str_dice3)

        val STRbutton = findViewById<Button>(R.id.str_btn)
        STRbutton.setOnClickListener{
            shakedice()
        }

    }

    private fun shakedice(){
        object : CountDownTimer(1000, 100) {
            override fun onTick(millisUntilFinished: Long) {
                val diceImageViews = listOf(str1diceImageView, str2diceImageView, str3diceImageView)
                diceImageViews.forEach { imageView ->
                    val randomIndex = dice.indices.random()
                    imageView.setImageResource(dice[randomIndex])
                }
            }

            override fun onFinish() {
                val diceImageViews = listOf(str1diceImageView, str2diceImageView, str3diceImageView)
                diceImageViews.forEach { imageView ->
                    val finalIndex = dice.indices.random()
                    imageView.setImageResource(dice[finalIndex])
                }
            }
        }.start()
    }

}