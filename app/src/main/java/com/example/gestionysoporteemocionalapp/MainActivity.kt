package com.example.gestionysoporteemocionalapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

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

        val startButton: Button = findViewById(R.id.startButton)
        val emotionalDiaryButton: Button = findViewById(R.id.emotionalDiaryButton)
        val selfHelpResourcesButton: Button = findViewById(R.id.selfHelpResourcesButton)
        val communitySupportButton: Button = findViewById(R.id.communitySupportButton)
        val planningGoalsButton: Button = findViewById(R.id.planningGoalsButton)

        startButton.setOnClickListener {
            // Navegar a la actividad de Pantalla de Inicio
            val intent = Intent(this, PantallaInicioActivity::class.java)
            startActivity(intent)
        }

        emotionalDiaryButton.setOnClickListener {
            // Navegar a la actividad de Seguimiento de Emociones
            val intent = Intent(this, DiarioEmocionalActivity::class.java)
            startActivity(intent)
        }

        selfHelpResourcesButton.setOnClickListener {
            // Navegar a la actividad de Recursos de Autoayuda
            val intent = Intent(this, RecursosAutoayudaActivity::class.java)
            startActivity(intent)
        }

        communitySupportButton.setOnClickListener {
            // Navegar a la actividad de Comunidad y Soporte
            val intent = Intent(this, ComunidadSoporteActivity::class.java)
            startActivity(intent)
        }

        planningGoalsButton.setOnClickListener {
            // Navegar a la actividad de Planificación y Objetivos
            val intent = Intent(this, PlanificacionObjetivosActivity::class.java)
            startActivity(intent)
        }
    }
}
