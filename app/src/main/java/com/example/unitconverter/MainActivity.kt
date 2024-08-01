package com.example.unitconverter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val unitSpinner: Spinner = findViewById(R.id.unit_spinner)
        val quantityEditText: EditText = findViewById(R.id.quantity_edit_text)
        val convertButton: Button = findViewById(R.id.convert_button)

        convertButton.setOnClickListener {
            val unit = unitSpinner.selectedItem.toString()
            val quantity = quantityEditText.text.toString().toDoubleOrNull() ?: 0.0

            val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra("UNIDADE", unit)
                putExtra("QUANTIDADE", quantity)
            }
            startActivity(intent)
        }
    }
}
