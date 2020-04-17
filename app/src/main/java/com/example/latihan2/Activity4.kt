package com.example.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_4.*

class Activity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        buttonsend.setOnClickListener(){
            val intent = Intent(this, Activity5::class.java)
            startActivity(intent)
        }
    }
}
