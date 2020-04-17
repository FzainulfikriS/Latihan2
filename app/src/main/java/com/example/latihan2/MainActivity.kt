package com.example.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerA1.setOnClickListener(){
            val intent = Intent(this,Activity2::class.java)
            startActivity(intent)
        }
    }
}
/*  NAMA : FAIZ ZAINULFIKRI S
    NIM  : 10117165
    KELAS: IF-5

    15-04-2020 MEMBUAT TAMPILAN HALAMAN 1-3
    17-04-2020 MENYELESAIKAN TAMPILAN 4-5, MEMBERESKAN TAMPILAN 2 DAN YANG LAINNYA
 */

