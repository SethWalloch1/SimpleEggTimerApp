package com.example.eggtimerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InformationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        val okButton = findViewById<Button>(R.id.okButton)
        var textStuff = findViewById<TextView>(R.id.textToReplace)

        val info = intent.getStringExtra("extrainfo")
        textStuff.text = info
        okButton.setOnClickListener{
            this.finish()
        }


    }
}