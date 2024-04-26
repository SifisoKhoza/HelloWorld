package com.example.application3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textDisp = findViewById<TextView>(R.id.textDisp)
        val MozBtn: ImageButton = findViewById(R.id.MozBtn)
        val FrenchBtn: ImageButton = findViewById(R.id.FrenchBtn)
        val saButton: ImageButton = findViewById(R.id.saButton)
        val NetherlandsBtn: ImageButton = findViewById(R.id.NetherlandsBtn)

        MozBtn.setOnClickListener { textDisp.text = "Ola !" }
        FrenchBtn.setOnClickListener { textDisp.text = "Bonjour!" }
        saButton.setOnClickListener { textDisp.text = "Dumela !" }
        NetherlandsBtn.setOnClickListener { textDisp.text = "Groet !" }


    }
}