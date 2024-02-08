package com.jordicuevas.ejercicio1.sendreceive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.jordicuevas.ejercicio1.R

class SendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send)

        val btSend = findViewById<Button>(R.id.botonPedir)
        val pedidos = listOf("Torta ahogada", "Torta cubana", "Torta rusa", "Tacos de birria")
        val formatter = SimpleDateFormat("yyyy-MM-dd")
        val date = Date()
        val current = formatter.format(date)

        btSend.setOnClickListener {
            val sendInfoPedido = Intent(this, ReceiveActivity::class.java).apply{
                //putExtra("PERSON_CURP", "RAGM770826HZSMZR54")
                putExtra("PERSON_NOMBRE", "Octavio")
                putExtra("PERSON_PEDIDO", pedidos.random())
                putExtra("PERSON_FECHA", "Sánchez")
            }

            //startActivity(sendInfoPersona)
            resultRegister.launch(sendInfoPersona)

    }

    private val resultRegister = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result ->
        if (result.resultCode == RESULT_OK){
            val tvSolicitud = findViewById<TextView>(R.id.tvSolicitud)
            tvSolicitud.text = "Tu pedido de ${result.data?.getStringExtra(("EXTRA_HOUR"))} está en camino"
            Toast.makeText(this, "Gracias por su pedido", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "CANCELLED", Toast.LENGTH_SHORT).show()
        }
    }

}