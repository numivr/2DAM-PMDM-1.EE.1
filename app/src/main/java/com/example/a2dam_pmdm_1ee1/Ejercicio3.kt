package com.example.a2dam_pmdm_1ee1

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio3)

        var btnrojo : Button = findViewById(R.id.botonRojo)
        btnrojo.setOnClickListener{
            val intent = Intent(this,Ejercicio3_2::class.java)
            startActivity(intent)
        }
        var btnverde : Button = findViewById(R.id.botonverde)
        btnverde.setOnClickListener{
            val intent = Intent(this,Ejercicio3_3::class.java)
            startActivity(intent)
        }
        var btnazul : Button = findViewById(R.id.botonazul)
        btnazul.setOnClickListener{
            val intent = Intent(this,Ejercicio3_4::class.java)
            startActivity(intent)
        }










    }
}