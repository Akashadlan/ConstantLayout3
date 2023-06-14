package com.example.constantlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var btnDiscard : Button
    lateinit var btnuplod: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDiscard = findViewById(R.id.btnDiscard)
        btnuplod = findViewById(R.id.btnUpload)

        btnDiscard.setOnClickListener{
            System.out.println("Click")
        }
        btnuplod.setOnClickListener{
            System.out.println("Click")
        }
    }
}