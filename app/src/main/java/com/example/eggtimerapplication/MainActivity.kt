package com.example.eggtimerapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var softBoiledButton = findViewById<RadioButton>(R.id.softBoiledButton)
        var mediumBoiledButton = findViewById<RadioButton>(R.id.mediumBoiledButton)
        var hardBoiledButton = findViewById<RadioButton>(R.id.hardBoiledButton)
        val goButton = findViewById<Button>(R.id.goButton)

        goButton.setOnClickListener{
            if(softBoiledButton.isChecked){
                val intent = Intent(this, InformationActivity::class.java)
                intent.putExtra("extrainfo", "Soft boiled eggs take 2 minutes")
                startActivity(intent)
            }else if(mediumBoiledButton.isChecked){
                val intent = Intent(this, InformationActivity::class.java)
                intent.putExtra("extrainfo", "Medium boiled eggs takes 6 minutes")
                startActivity(intent)
            }else if(hardBoiledButton.isChecked){
                val intent = Intent(this, InformationActivity::class.java)
                intent.putExtra("extrainfo", "Hard boiled eggs take 10 minutes")
                startActivity(intent)
            }
        }

    }
}