package com.jordicuevas.ejercicio1.ejercicios

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.jordicuevas.ejercicio1.R

class UrlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_url)

        val btUrl = findViewById<Button>(R.id.botonURL)

        btUrl.setOnClickListener {
            val urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tortaslokas.com/"))
            startActivity(Intent.createChooser(urlIntent, "Ver URL..."))
        }
    }
}