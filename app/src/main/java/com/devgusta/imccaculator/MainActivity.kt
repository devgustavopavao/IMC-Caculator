package com.devgusta.imccaculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
        val intent = Intent(this,IMCResult::class.java)
        binding.buttonCalculator.setOnClickListener {
            val sPeso: String = binding.editText1.text.toString()
            val sAltura: String = binding.editText2.text.toString()
            if(sPeso.isNotEmpty()){
              val peso =  sPeso.toDouble()
                if(sAltura.isNotEmpty()){
                   val altura = sAltura.toDouble()
                    val result = peso / (altura * altura)
                   if(result <18){
                       intent.putExtra("result","Abaixo do peso")
                   }else if(result in 18.5..24.9){
                       intent.putExtra("result","Peso ideal ;)")
                   }else if(result in 25.0..29.9){
                       intent.putExtra("result", "Acima do peso")
                   }else{
                       intent.putExtra("result","Obesidade")
                   }
                    intent.putExtra("peso",peso)
                    intent.putExtra("altura",altura)
                    startActivity(intent)
                }else{
                    with(binding.editText2){
                        setError("Digite algo antes")
                        requestFocus()
                    }
                }
            }else{
                with(binding.editText1){
                    setError("Digite algo antes")
                    requestFocus()
                }
            }


        }
    }
}