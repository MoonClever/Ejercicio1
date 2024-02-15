package com.jordicuevas.ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.jordicuevas.ejercicio1.ejercicios2.ConstraintLayoutActivity
import com.jordicuevas.ejercicio1.ejercicios2.FrameLayoutActivity
import com.jordicuevas.ejercicio1.ejercicios2.LinearLayoutActivity
import com.jordicuevas.ejercicio1.ejercicios2.RecyclerViewActivity
import com.jordicuevas.ejercicio1.ejercicios2.RelativeLayoutActivity
import com.jordicuevas.ejercicio1.ejercicios2.UIControllerActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val btFrame = findViewById<Button>(R.id.btFrameLayout)
    val btLinear = findViewById<Button>(R.id.btLinearLayout)
    val btRelative = findViewById<Button>(R.id.btRelativeLayout)
    val btConstraint = findViewById<Button>(R.id.btConstraintLayout)
    val btUIControls = findViewById<Button>(R.id.btUIControls)
    val btRecyclerView = findViewById<Button>(R.id.btRecyclerview)

    btFrame.setOnClickListener{
        val sendIntent = Intent(this, FrameLayoutActivity::class.java)
        startActivity(sendIntent)
    }

    btLinear.setOnClickListener{
        val sendIntent = Intent(this, LinearLayoutActivity::class.java)
        startActivity(sendIntent)
    }

    btRelative.setOnClickListener{
        val sendIntent = Intent(this, RelativeLayoutActivity::class.java)
        startActivity(sendIntent)
    }

    btConstraint.setOnClickListener{
        val sendIntent = Intent(this, ConstraintLayoutActivity::class.java)
        startActivity(sendIntent)
    }

    btUIControls.setOnClickListener{
        val sendIntent = Intent(this, UIControllerActivity::class.java)
        startActivity(sendIntent)
    }

    btRecyclerView.setOnClickListener{
        val sendIntent = Intent(this, RecyclerViewActivity::class.java)
        startActivity(sendIntent)
    }

    }
}