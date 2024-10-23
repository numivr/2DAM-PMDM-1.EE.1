package com.example.a2dam_pmdm_1ee1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ejercicio1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio1)

        val btn_comprobar = findViewById<Button>(R.id.button)
        val et_url = findViewById<EditText>(R.id.editText)

        btn_comprobar.setOnClickListener {
            val urlText = et_url.text.toString()

            if (urlText.isNotEmpty() && android.util.Patterns.WEB_URL.matcher(urlText).matches()) {
                // Creamos un Intent para abrir la URL en el navegador
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(urlText))
                startActivity(intent)
                et_url.text = null
            } else {
                Toast.makeText(this, "Introduce una URL válida", Toast.LENGTH_LONG).show()
            }
        }
    }
}