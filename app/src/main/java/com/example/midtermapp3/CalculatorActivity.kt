package com.example.midtermapp3

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CalculatorAppMainActivity : AppCompatActivity() {

    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText
    lateinit var spinnerOperations: Spinner
    lateinit var btnCalculate: Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)
        spinnerOperations = findViewById(R.id.spinnerOperations)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)

        val operations = arrayOf("Add", "Subtract", "Multiply", "Divide")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, operations)
        spinnerOperations.adapter = adapter

        btnCalculate.setOnClickListener {
            val num1 = etNumber1.text.toString().toDoubleOrNull()
            val num2 = etNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = when (spinnerOperations.selectedItem.toString()) {
                    "Add" -> num1 + num2
                    "Subtract" -> num1 - num2
                    "Multiply" -> num1 * num2
                    "Divide" -> if (num2 != 0.0) num1 / num2 else "Cannot divide by zero"
                    else -> "Invalid operation"
                }
                tvResult.text = result.toString()
            } else {
                tvResult.text = "Invalid input"
            }
        }
    }
}
