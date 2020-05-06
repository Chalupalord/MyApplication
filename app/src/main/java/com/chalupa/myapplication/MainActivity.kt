package com.chalupa.myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity as AppCompatActivity1

class MainActivity : AppCompatActivity1() {

    private val default = "Hello World"
    private val jim = "Jim"
    private val jim2 = "Will it work?"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayMessage.text = default

    }

    fun pushMePushed(view: View){
        when(displayMessage.text){
            default -> displayMessage.text = jim
            jim ->  displayMessage.text = jim2
            jim2 -> displayMessage.text = default
        }
    }
}
