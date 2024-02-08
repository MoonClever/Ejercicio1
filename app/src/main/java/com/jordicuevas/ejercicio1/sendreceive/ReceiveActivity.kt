package com.jordicuevas.ejercicio1.sendreceive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.jordicuevas.ejercicio1.R
import java.text.SimpleDateFormat
import java.util.Date

class ReceiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive)

        val nombre = intent.getStringExtra("PERSON_NOMBRE")
        val pedido = intent.getStringExtra("PERSON_PEDIDO")
        val picante = intent.getStringExtra("PERSON_PICANTE")

        val formatter = SimpleDateFormat("HH:mm a")
        val date = Date()
        val current = formatter.format(date)
        val duracion = (5..20).random()

        val tvPedido = findViewById<TextView>(R.id.tvPedido)
        val btRegreso = findViewById<Button>(R.id.btRegreso)

        tvPedido.text = "$nombre, su pedido de $pedido con $picante llegará pronto"

        btRegreso.setOnClickListener{
            val resultIntent = Intent().apply() {
                putExtra("EXTRA_TIME", current)
                putExtra("EXTRA_DURATION", duracion.toString())
            }
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }




}