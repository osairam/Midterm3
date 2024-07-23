package com.example.midtermapp3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber1: EditText = findViewById(R.id.etNumber1)
        val etNumber2: EditText = findViewById(R.id.etNumber2)
        val btnOpenCalculatorApp: Button = findViewById(R.id.btnOpenCalculatorApp)
        val btnOpenQuoteApp: Button = findViewById(R.id.btnOpenQuoteApp)

        btnOpenCalculatorApp.setOnClickListener {
            val intent = Intent(this, CalculatorAppMainActivity::class.java)
            intent.putExtra("number1", etNumber1.text.toString())
            intent.putExtra("number2", etNumber2.text.toString())
            startActivity(intent)
        }

        btnOpenQuoteApp.setOnClickListener {
            val intent = Intent(this, QuoteAppMainActivity::class.java)
            startActivity(intent)
        }
    }
}
