package com.example.a2dam_pmdm_1ee1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn1 = findViewById<Button>(R.id.button1)
        btn1.setOnClickListener{
            val intent=Intent(this,Ejercicio1::class.java)
            startActivity(intent)
        }



        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener{
            val intent=Intent(this,Ejercicio2::class.java)
            startActivity(intent)
        }



        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener{
            val intent=Intent(this,Ejercicio3::class.java)
            startActivity(intent)
        }



        val btn4 = findViewById<Button>(R.id.button4)
        btn4.setOnClickListener{
            val intent=Intent(this,Ejercicio4::class.java)
            startActivity(intent)
        }



        val btn5 = findViewById<Button>(R.id.button5)
        btn5.setOnClickListener{
            val intent=Intent(this, Ejercicio5::class.java)
            startActivity(intent)
        }



        val btn6 = findViewById<Button>(R.id.button6)
        btn6.setOnClickListener{
            val intent=Intent(this,Ejercicio6::class.java)
            startActivity(intent)
        }




    }
}