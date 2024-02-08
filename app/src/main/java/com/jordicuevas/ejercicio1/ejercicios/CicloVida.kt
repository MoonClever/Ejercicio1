package com.jordicuevas.ejercicio1.ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jordicuevas.ejercicio1.R

class CicloVida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclo_vida)
        Toast.makeText(this, "Estado actual: onStart", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        Toast.makeText(this, "Estado actual: onStart", Toast.LENGTH_LONG).show()
        super.onStart()
    }

    override fun onResume() {
        Toast.makeText(this, "Estado actual: onResume", Toast.LENGTH_LONG).show()
        super.onResume()
    }

    override fun onPause() {
        Toast.makeText(this, "Estado actual: onPause", Toast.LENGTH_LONG).show()
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(this, "Estado actual: onStop", Toast.LENGTH_LONG).show()
        super.onStop()
    }

    override fun onRestart() {
        Toast.makeText(this, "Estado actual: onRestart", Toast.LENGTH_LONG).show()
        super.onRestart()
    }

    override fun onDestroy() {
        Toast.makeText(this, "Estado actual: onDestroy", Toast.LENGTH_LONG).show()
        super.onDestroy()
    }
}