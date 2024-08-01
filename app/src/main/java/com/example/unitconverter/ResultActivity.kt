package com.example.unitconverter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultTextView: TextView = findViewById(R.id.result_text_view)
        val backButton: Button = findViewById(R.id.back_button)

        val unit = intent.getStringExtra("UNIDADE") ?: ""
        val quantity = intent.getDoubleExtra("QUANTIDADE", 0.0)
        val result = convert(unit, quantity)

        resultTextView.text = "$quantity $unit is $result"

        backButton.setOnClickListener {
        finish()
        }
        }

private fun convert(unit: String, quantity: Double): String {
        // Simple conversion logic (example only)
        return when (unit) {
        "Quilômetros" -> "${quantity * 0.621371} Metros"
        "Metros" -> "${quantity * 1.60934} Quilometros"
        else -> "Conversão não suportada"
        }
        }
        }
