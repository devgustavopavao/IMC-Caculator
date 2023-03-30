package com.devgusta.imccaculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devgusta.imccaculator.databinding.ActivityImcresultBinding
import com.devgusta.imccaculator.databinding.ActivityMainBinding

class IMCResult : AppCompatActivity() {
    private lateinit var binding: ActivityImcresultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImcresultBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}