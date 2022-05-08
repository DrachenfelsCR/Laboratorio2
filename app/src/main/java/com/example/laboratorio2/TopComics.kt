package com.example.laboratorio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TopComics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_comics)
        val topcomicsvolver = findViewById<Button>(R.id.topcomicsvolver)
        topcomicsvolver.setOnClickListener {
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