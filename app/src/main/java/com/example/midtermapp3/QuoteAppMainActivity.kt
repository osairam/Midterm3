package com.example.midtermapp3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class QuoteAppMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)

        val quoteView: TextView = findViewById(R.id.quoteView)
        quoteView.text = "This is your quote of the day!"
    }
}
