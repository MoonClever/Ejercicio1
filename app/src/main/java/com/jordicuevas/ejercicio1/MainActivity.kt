package com.jordicuevas.ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.jordicuevas.ejercicio1.ejercicios.CicloVida
import com.jordicuevas.ejercicio1.ejercicios.UrlActivity
import com.jordicuevas.ejercicio1.sendreceive.SendActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val botonCiclo = findViewById<Button>(R.id.botonCiclo)
    val botonURL = findViewById<Button>(R.id.botonURL)
    val bontonER = findViewById<Button>(R.id.botonER)

    botonCiclo.setOnClickListener{
        val sendIntent = Intent(this, CicloVida::class.java)
        startActivity(sendIntent)
    }

    botonURL.setOnClickListener{
        val sendIntent = Intent(this, UrlActivity::class.java)
        startActivity(sendIntent)
    }

    bontonER.setOnClickListener{
        val sendIntent = Intent(this, SendActivity::class.java)
        startActivity(sendIntent)
    }
    }
}