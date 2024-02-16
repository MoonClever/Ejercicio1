package com.jordicuevas.ejercicio1.ejercicios2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.jordicuevas.ejercicio1.R

class UserAdapter(private val list: ArrayList<Pedido>) : RecyclerView.Adapter<UserViewHolder>(){

    var onItemSelected : ((Pedido) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_pedido, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.render(list[position], onItemSelected)
    }


}

class UserViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val ivUser = view.findViewById<ImageView>(R.id.ivPedido)
    val tvUser = view.findViewById<TextView>(R.id.tvPedido)
    val root = view.findViewById<ConstraintLayout>(R.id.root)

    fun render(pedido: Pedido, onItemSelected : ((Pedido) -> Unit)?){
        tvUser.text = pedido.comida
        root.setOnClickListener {
            onItemSelected?.invoke(pedido)
        }
    }
}