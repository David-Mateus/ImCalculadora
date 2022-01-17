package com.example.imccalculadora

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btCalcular = button2
        val resultado = resultado

        btCalcular.setOnClickListener{
          val altura = editText_altura.text.toString().toDouble()
          val peso = editText_altura_peso.text.toString().toDouble()

            val imc = (peso/((altura * altura)))

            if (imc <= 18.5){
                resultado.setText("Seu IMC %.1f ".format(imc)+"->Cuidado!!!\n Estar abaixo do peso pode gerar diversas consequências para a saúde")
                resultado.setTextColor(Color.WHITE)
                resultado.setBackgroundColor(Color.GRAY)

            }else if(imc >= 18.6 && imc <= 24.9){
                resultado.setText("Seu IMC: %.1f ".format(imc)+"->Peso Normal\nParabéns, seu peso está adequado\n para sua altura.")
                resultado.setTextColor(Color.BLACK)
                resultado.setBackgroundColor(Color.GREEN)


            }else if(imc >= 25 && imc <= 29.9){
                resultado.setText("Seu IMC: %.1f ".format(imc)+"-> Sobrepeso\n Embora não seja obeso, você apresenta\nexcesso de peso que pode elevar\no risco de doenças.")
                resultado.setTextColor(Color.WHITE)
                resultado.setBackgroundColor(Color.RED)
            }else{
                resultado.setText("Seu IMC: %.1f ".format(imc)+"-> Obesidade\nPacientes com obesidade têm risco elevado\n de desenvolver diversas doenças.")
                resultado.setTextColor(Color.WHITE)
                resultado.setBackgroundColor(Color.RED)
            }
        }

    }
}