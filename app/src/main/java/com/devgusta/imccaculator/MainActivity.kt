package com.devgusta.imccaculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devgusta.imccaculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startAction()
    }

    private fun startAction(){
        binding.buttonCalculator.setOnClickListener {
            val intent = Intent(this,IMCResult::class.java)
            startActivity(intent)

        }
    }
}