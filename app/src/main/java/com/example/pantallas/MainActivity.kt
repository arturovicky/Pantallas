package com.example.pantallas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable.ClassLoaderCreator
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

private lateinit var pantalla1 : Button
private lateinit var pantalla2 : Button
private lateinit var nombre : TextInputEditText
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pantalla1 = findViewById(R.id.pantalla1)
        pantalla2 = findViewById(R.id.pantalla2)
        nombre = findViewById(R.id.nombre)

        pantalla1.setOnClickListener { llamarPantalla(Intent(this,MainActivity2::class.java)) }
        pantalla2.setOnClickListener { llamarPantalla2(Intent(this,MainActivity3::class.java)) }
    }

    private fun llamarPantalla(intent: Intent) {
        startActivity(intent)
    }
    private fun llamarPantalla2(intent: Intent) {
        intent.putExtra("nombre", nombre.text.toString())		    // Agrega los mensajes a enviar
        startActivity(intent)

    }

}