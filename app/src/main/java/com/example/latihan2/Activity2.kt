package com.example.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        //iniSpinners()


        toolbar.setNavigationIcon(R.drawable.ic_header_back)
        toolbar.setTitle("Register")
        setSupportActionBar(toolbar)

        buttonregister.setOnClickListener() {
            /*val username = reguser.text.toString()
            val spinnerGoldar: Spinner = findViewById(R.id.regblood)
            val goldar = spinnerGoldar.selectedItem.toString()
            */
            val intent = Intent(this, Activity3::class.java)
            //intent.putExtra("username", username)
            startActivity(intent)
        }
    }


    fun onRadioButtonClicked(view: View) {
        if(view is RadioButton){
            val checked = view.isChecked
        }
    }
    /*fun iniSpinners() {
        val spinner1: Spinner = findViewById(R.id.regblood)
        val spinner2: Spinner = findViewById(R.id.regrhesus)
        val spinner3: Spinner = findViewById(R.id.regjob)

        ArrayAdapter.createFromResource(
            this, R.array.arraygoldar,R.layout.spinner_text_style
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner1.adapter = adapter
        }
        ArrayAdapter.createFromResource(
            this,R.array.arrayrhesus,R.layout.spinner_text_style
        ).also {adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner2.adapter = adapter
        }
        ArrayAdapter.createFromResource(
            this,R.array.arrayjob,R.layout.spinner_text_style
        ).also {adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner3.adapter = adapter
        }
    }*/
}



