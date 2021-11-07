package com.example.ui

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var S_btn : ImageButton = findViewById<ImageButton>(R.id.Start_btn)

        S_btn.setOnClickListener {
            Toast.makeText(getApplicationContext(), "짧게 출력 Hello World!", Toast.LENGTH_SHORT).show();
        }


    }
}