package com.than.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPagi: Button = findViewById(R.id.btnClick)
        val imageBtn: ImageButton = findViewById(R.id.imgBtn)
        btnPagi.setOnClickListener{
            tampilToast("btn")
        }
        imageBtn.setOnClickListener{
            tampilToast("imgbtn")
        }
    }
    private fun tampilToast(type: String){
        val textToast: String = when (type) {
            "btn" -> {
                "Anda mencet tombol biasa"
            }
            "imgbtn" -> {
                "Anda mencet image button"
            }
            else -> {
                "Anda mencet tombol yang mana ya?"
            }
        }
        Toast.makeText(this, textToast, Toast.LENGTH_SHORT).show()
    }
}