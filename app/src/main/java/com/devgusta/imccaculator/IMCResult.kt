package com.devgusta.imccaculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devgusta.imccaculator.databinding.ActivityImcresultBinding
import com.devgusta.imccaculator.databinding.ActivityMainBinding

class IMCResult : AppCompatActivity() {
    private lateinit var binding: ActivityImcresultBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImcresultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recuperando valores
        val bundle = intent.extras
        val peso = bundle?.getDouble("peso")
        val altura = bundle?.getDouble("altura")
        val result = bundle?.getString("result")
        binding.textPeso.text = "PESO: ${peso.toString()} KG"
        binding.textAltura.text = "ALTURA: ${altura.toString()}"
        binding.textDiagnostico.text = "$result M"
    }
}