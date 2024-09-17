package com.example.gestionysoporteemocionalapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DiarioEmocionalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diario_emocional)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtener referencias a las vistas
        val inputText = findViewById<EditText>(R.id.diarioEmocionalInput)
        val saveButton = findViewById<Button>(R.id.saveButton)

        // Configurar el botón de guardar
        saveButton.setOnClickListener {
            val text = inputText.text.toString()
            // Mostrar un mensaje simple (puedes guardar el texto en una base de datos o archivo)
            Toast.makeText(this, "Nota guardada: $text", Toast.LENGTH_SHORT).show()
        }
    }
}
