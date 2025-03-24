package com.websarva.wings.android.trpg

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val customButton: CustomButton = findViewById(R.id.character_sheetbtn)
        customButton.setchoice(R.drawable.figure_question, getString(R.string.character_sheet))
        customButton.setOnClickListener{
            val intent = Intent(this, CharacterSheetActivity::class.java)
            startActivity(intent)
        }
    }
}