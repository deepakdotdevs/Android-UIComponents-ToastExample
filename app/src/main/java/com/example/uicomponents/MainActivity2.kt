// 2nd Method to call Button is with lateinit

package com.example.uicomponents

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class `MainActivity2` : AppCompatActivity() {
    private lateinit var Button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        Button= findViewById<Button>(R.id.button2)
        Button.setOnClickListener {
            Toast.makeText(this, "This is Button 2", Toast.LENGTH_LONG).show()
        }
    }
}