package com.jordicuevas.ejercicio1.ejercicios2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jordicuevas.ejercicio1.R

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val userList = findViewById<RecyclerView>(R.id.userList)

        val userDataList = arrayListOf(
            Pedido("Octavio", "Salsa verde", "Para llevar", "Tacos de birria" ),
            Pedido("Pedro", "Salsa Roja", "En local", "Tacos dorados"),
            Pedido("Juan", "Sin Salsa", "En local", "Pechuga asada"),
            Pedido("Miguel", "Salsa verde", "En local", "Tacos de suadero"),
            Pedido("Alan", "Salsa roja", "Para llevar", "Ceviche")
        )

        val adapter = UserAdapter(userDataList)

        adapter.onItemSelected = {
            Toast.makeText(this,"User selected = ${it.nombre}", Toast.LENGTH_LONG).show()
        }

        userList.adapter = adapter
        userList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}