package com.yasliks.testmoduls2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.yasliks.mytestlibrary.libraryActivity
import com.yasliks.testmoduls2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding?.root)

        binding?.BTN?.setOnClickListener {
            Toast.makeText(this, "GO", Toast.LENGTH_SHORT).show()
            val powerIntent = Intent(this, libraryActivity::class.java)
            startActivity(powerIntent)
        }

    }
}