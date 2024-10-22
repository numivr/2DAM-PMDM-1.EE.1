package com.example.a2dam_pmdm_1ee1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ejercicio5 : AppCompatActivity() {
    private var numero1: Double = 0.0
    private var numero2: Double = 0.0
    private var operacion: String = ""
    private var puntoDecimalUsado: Boolean = false
    private var operadorSeleccionado: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio5)

        val resultado: TextView = findViewById(R.id.resultado)
        val boton7 = findViewById<Button>(R.id.boton7)
        val boton8 = findViewById<Button>(R.id.boton8)
        val boton9 = findViewById<Button>(R.id.boton9)
        val boton4 = findViewById<Button>(R.id.boton4)
        val boton5 = findViewById<Button>(R.id.boton5)
        val boton6 = findViewById<Button>(R.id.boton6)
        val boton1 = findViewById<Button>(R.id.boton1)
        val boton2 = findViewById<Button>(R.id.boton2)
        val boton3 = findViewById<Button>(R.id.boton3)
        val boton0 = findViewById<Button>(R.id.boton0)
        val botonSuma = findViewById<Button>(R.id.botonmas)
        val botonResta = findViewById<Button>(R.id.botonmenos)
        val botonMultiplicacion = findViewById<Button>(R.id.botonmultiplicar)
        val botonDivision = findViewById<Button>(R.id.dividir)
        val botonIgual = findViewById<Button>(R.id.botonresultado)
        val botonC = findViewById<Button>(R.id.botonborrar)
        val botonPunto = findViewById<Button>(R.id.botoncoma)

        fun agregarNumero(numero: String) {
            if (operadorSeleccionado) {
                resultado.text = numero
                operadorSeleccionado = false
            } else {
                resultado.text = "${resultado.text}$numero"
            }
        }

        fun realizarOperacion() {
            try {
                numero2 = resultado.text.toString().toDouble()
                val resultadoOperacion = when (operacion) {
                    "+" -> numero1 + numero2
                    "-" -> numero1 - numero2
                    "*" -> numero1 * numero2
                    "/" -> if (numero2 != 0.0) numero1 / numero2 else 0.0
                    else -> 0.0
                }
                resultado.text = "$resultadoOperacion"
                puntoDecimalUsado = false
                operadorSeleccionado = false
            } catch (e: NumberFormatException) {
                Log.e("Ejercicio5", "Error parsing number", e)
                resultado.text = "Error"
            }
        }

        boton0.setOnClickListener { agregarNumero("0") }
        boton1.setOnClickListener { agregarNumero("1") }
        boton2.setOnClickListener { agregarNumero("2") }
        boton3.setOnClickListener { agregarNumero("3") }
        boton4.setOnClickListener { agregarNumero("4") }
        boton5.setOnClickListener { agregarNumero("5") }
        boton6.setOnClickListener { agregarNumero("6") }
        boton7.setOnClickListener { agregarNumero("7") }
        boton8.setOnClickListener { agregarNumero("8") }
        boton9.setOnClickListener { agregarNumero("9") }

        botonPunto.setOnClickListener {
            if (!puntoDecimalUsado) {
                agregarNumero(".")
                puntoDecimalUsado = true
            }
        }

        botonSuma.setOnClickListener {
            try {
                numero1 = resultado.text.toString().toDouble()
                operacion = "+"
                operadorSeleccionado = true
                puntoDecimalUsado = false
            } catch (e: NumberFormatException) {
                Log.e("Ejercicio5", "Error parsing number", e)
                resultado.text = "Error"
            }
        }

        botonResta.setOnClickListener {
            try {
                numero1 = resultado.text.toString().toDouble()
                operacion = "-"
                operadorSeleccionado = true
                puntoDecimalUsado = false
            } catch (e: NumberFormatException) {
                Log.e("Ejercicio5", "Error parsing number", e)
                resultado.text = "Error"
            }
        }

        botonMultiplicacion.setOnClickListener {
            try {
                numero1 = resultado.text.toString().toDouble()
                operacion = "*"
                operadorSeleccionado = true
                puntoDecimalUsado = false
            } catch (e: NumberFormatException) {
                Log.e("Ejercicio5", "Error parsing number", e)
                resultado.text = "Error"
            }
        }

        botonDivision.setOnClickListener {
            try {
                numero1 = resultado.text.toString().toDouble()
                operacion = "/"
                operadorSeleccionado = true
                puntoDecimalUsado = false
            } catch (e: NumberFormatException) {
                Log.e("Ejercicio5", "Error parsing number", e)
                resultado.text = "Error"
            }
        }

        botonIgual.setOnClickListener { realizarOperacion() }

        botonC.setOnClickListener {
            resultado.text = ""
            numero1 = 0.0
            numero2 = 0.0
            operacion = ""
            puntoDecimalUsado = false
            operadorSeleccionado = false
        }
    }
}
