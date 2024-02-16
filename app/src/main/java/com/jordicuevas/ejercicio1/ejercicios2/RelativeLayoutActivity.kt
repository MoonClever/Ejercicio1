package com.jordicuevas.ejercicio1.ejercicios2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import com.jordicuevas.ejercicio1.R

class RelativeLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        val btComida = findViewById<Button>(R.id.btComida)
        val spinnerComida = findViewById<Spinner>(R.id.spinnerComida)
        val tvResultado = findViewById<TextView>(R.id.tvResComida)

        val comidaCorridaList = arrayListOf("Enchiladas Suizas", "Milanesa empanizada",
            "Caldo de gallina", "Tacos dorados", "Sopa de codito")

        ArrayAdapter(this, android.R.layout.simple_spinner_item, comidaCorridaList).also{
            it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerComida.adapter = it
        }

        btComida.setOnClickListener {
            val comidaSelect = spinnerComida.selectedItem
            tvResultado.text = "Usted seleccionó $comidaSelect"
        }
    }
}