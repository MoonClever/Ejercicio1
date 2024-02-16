package com.jordicuevas.ejercicio1.ejercicios2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import com.jordicuevas.ejercicio1.R

class UIControllerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uicontroller)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btSiguiente = findViewById<Button>(R.id.btSiguiente)
        val cbLlevar = findViewById<CheckBox>(R.id.cbParaLlevar)
        val rgSalsa = findViewById<RadioGroup>(R.id.rgSalsa)
        val spinnerComida = findViewById<Spinner>(R.id.spinnerComida)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        val comida = arrayListOf("Huevo con jamon", "Chilaquiles", "Chilaquiles", "Huitlacoche", "Tacos dorados")

        ArrayAdapter(this, android.R.layout.simple_spinner_item, comida).also{
            it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerComida.adapter = it
        }

        btSiguiente.setOnClickListener {
            val cbStatus = cbLlevar.isChecked
            val rbSelected = when(rgSalsa.checkedRadioButtonId){
                R.id.rbSVerde -> "Salsa verde"
                R.id.rbSRoja -> "Salsa roja"
                R.id.rbSNinguna -> "Sin salsa"
                else -> "Da igual"
            }
            val itemSpinner = spinnerComida.selectedItem
            val nombre = etNombre.text
            tvResultado.text = "$nombre, su pedido de $itemSpinner, $rbSelected, ${if (cbStatus) "para llevar" else "para comer aqui"} estara lista pronto"
        }
    }
}