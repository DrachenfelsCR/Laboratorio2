package com.example.laboratorio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AvengersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avengers)
        val botonAvengersVolver = findViewById<Button>(R.id.botonAvengersVolver)
        botonAvengersVolver.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    override fun onStart(){
        super.onStart()

    }

    override fun onRestart(){
        super.onRestart()

    }

    override fun onResume(){
        super.onResume()

    }
    override fun onPause(){
        super.onPause()

    }
    override fun onStop(){
        super.onStop()

    }
    override fun onDestroy(){
        super.onDestroy()

    }
}