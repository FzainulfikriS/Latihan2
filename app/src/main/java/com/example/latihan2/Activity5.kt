package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_5.*

class Activity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)

        toolbar2.setNavigationIcon(R.drawable.ic_side_menu)
    }
}
