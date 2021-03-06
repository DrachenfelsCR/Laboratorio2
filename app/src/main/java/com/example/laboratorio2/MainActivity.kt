package com.example.laboratorio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonVengadores = findViewById<Button>(R.id.buttonAvengers)
        botonVengadores.setOnClickListener {
            startActivity(Intent(this, AvengersActivity::class.java))
        }
        val topcomics = findViewById<Button>(R.id.topcomics)
        topcomics.setOnClickListener {
            startActivity(Intent(this, TopComics::class.java))
        }
        val xMen = findViewById<Button>(R.id.buttonXmen)
        xMen.setOnClickListener {
            startActivity(Intent(this, Xmen::class.java))
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

