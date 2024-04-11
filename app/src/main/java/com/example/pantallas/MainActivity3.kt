package com.example.pantallas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private lateinit var salir3 : Button
private lateinit var texto : TextView
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        salir3= findViewById(R.id.salir3)
        texto = findViewById(R.id.textView)
        salir3.setOnClickListener { finish() }

        val intent = intent

        texto.text = intent.getStringExtra("nombre")


    }
}