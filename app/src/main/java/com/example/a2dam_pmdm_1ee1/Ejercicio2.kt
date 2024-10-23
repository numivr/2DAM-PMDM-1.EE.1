package com.example.a2dam_pmdm_1ee1

import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio2)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            // Creamos el intent que nos llevará a la segunda pantalla
            val intent = Intent(this, Ejercicio2_2::class.java)

            // Creamos el pendingIntent para usarlo después
            val pendingIntent = PendingIntent.getActivity(
                this, 0, intent,  PendingIntent.FLAG_IMMUTABLE
            )

            // Creamos un Handler para ejecutar el PendingIntent -
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({ // Pr
                try {
                    pendingIntent.send()  // Navegamos a la segunda pantalla
                } catch (e: PendingIntent.CanceledException) {
                    e.printStackTrace()
                }
            //                                                   - después de 10 segundos
            }, 10000) //
        }
    }
}