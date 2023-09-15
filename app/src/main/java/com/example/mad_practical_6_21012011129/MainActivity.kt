package com.example.mad_practical_6_21012011129

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Play : Button=findViewById(R.id.floatingActionButton)

        Play.setOnClickListener {
            PlayPause()
        }
        val Pause : Button=findViewById(R.id.floatingActionButton2)

        Pause.setOnClickListener {
            Stop()
        }
    }

    fun PlayPause(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            startService(this)
        }

    }

    fun Stop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            stopService(this)
        }

    }




}