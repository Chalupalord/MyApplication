package com.chalupa.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity as AppCompatActivity1

class MainActivity : AppCompatActivity1() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var jim = "jim"
        var jim2 = "will it work?"
        val welcomeMessage: TextView = findViewById(R.id.texbox)
        welcomeMessage.text = jim2
        

    }
}
