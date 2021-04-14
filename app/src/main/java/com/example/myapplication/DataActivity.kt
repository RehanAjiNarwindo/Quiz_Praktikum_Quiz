package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.R
import io.github.rifqips.quiz_pratikum_android.R

class DataActivity : AppCompatActivity() {

    lateinit var tvNama: TextView
    lateinit var tvNim: TextView
    lateinit var tvGender: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val bundle: Bundle? = intent.extras
        val nama = bundle?.getString("nama")
        val nim = bundle?.getString("nim")
        val gender = bundle?.getString("gender")

        tvNama = findViewById(R.id.tv_nama)
        tvNim = findViewById(R.id.tv_nim)
        tvGender = findViewById(R.id.tv_gender)

        tvNama.text = nama
        tvNim.text = nim
        tvGender.text = gender

    }
}