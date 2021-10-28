package com.example.zadaniemateckimaksymilian

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val zmien = findViewById<Button>(R.id.button);
    val dodaj = findViewById<Button>(R.id.button2);
    val suma = findViewById<Button>(R.id.button3);
    val input = findViewById<EditText>(R.id.nazwa);
    val a1 = findViewById<Button>(R.id.a1);
    val a2 = findViewById<Button>(R.id.a2);
    val output = findViewById<Button>(R.id.textView);



    zmien.setOnClickListener{
        output.text = input.text.toString();
    }
    dodaj.setOnClickListener() {
        output.text = output.text.toString() + input.text.toString();
    }
    suma.setOnClickListener(){
        output.text = (a1.text.toString().toDouble() + a2.text.toString().toDouble()).toString();
    }


    }
}