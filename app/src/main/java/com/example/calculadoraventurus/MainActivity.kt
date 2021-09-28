package com.example.calculadoraventurus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var valor: String = ""
        var valor1: String = ""
        var valor2: String = ""

        var typeCalculo: String = ""


        var ScreenNumber = findViewById<TextView>(R.id.editTextTextPersonName)

        var btn1 = findViewById<Button>(R.id.btn_1)
        var btn2 = findViewById<Button>(R.id.btn_2)
        var btn3 = findViewById<Button>(R.id.btn_3)
        var btn4 = findViewById<Button>(R.id.btn_4)
        var btn5 = findViewById<Button>(R.id.btn_5)
        var btn6 = findViewById<Button>(R.id.btn_6)
        var btn7 = findViewById<Button>(R.id.btn_7)
        var btn8 = findViewById<Button>(R.id.btn_8)
        var btn9 = findViewById<Button>(R.id.btn_9)
        var btn0 = findViewById<Button>(R.id.btn_0)

        var btnIgual = findViewById<Button>(R.id.igual)
        var btnsoma = findViewById<Button>(R.id.btn_soma)
        var btnsubtracao = findViewById<Button>(R.id.btn_subtracao)
        var btndivisao = findViewById<Button>(R.id.btn_divisao)
        var btnmultiplicacao = findViewById<Button>(R.id.btn_multiplicacao)


        btnIgual.setOnClickListener{
            valor2 = ScreenNumber.text.toString()
            if(valor1.toString() !== ""){
                if(typeCalculo == "1"){
                    var soma = valor1.toDouble() + valor2.toDouble()
                    ScreenNumber.text = soma.toString()
                    valor = ""
                    valor1 = ""
                    valor2 = ""
                } else if(typeCalculo == "2"){
                    var soma = valor1.toDouble() - valor2.toDouble()
                    ScreenNumber.text = soma.toString()
                    valor = ""
                    valor1 = ""
                    valor2 = ""
                }else if(typeCalculo == "3"){
                    var soma = valor1.toDouble() * valor2.toDouble()
                    ScreenNumber.text = soma.toString()
                    valor = ""
                    valor1 = ""
                    valor2 = ""
                }else if(typeCalculo == "4"){
                    var soma = valor1.toDouble() / valor2.toDouble()
                    ScreenNumber.text = soma.toString()
                    valor = ""
                    valor1 = ""
                    valor2 = ""
                }
            }
        }

        btnsoma.setOnClickListener{
            if(valor1.toString() == ""){
              valor1 = ScreenNumber.text.toString()
                ScreenNumber.text = ""
                typeCalculo = "1"
                valor = ""
            }
        }
        btnsubtracao.setOnClickListener{
            if(valor1.toString() == ""){
                valor1 = ScreenNumber.text.toString()
                ScreenNumber.text = ""
                typeCalculo = "2"
                valor = ""
            }
        }
        btndivisao.setOnClickListener{
            if(valor1.toString() == ""){
                valor1 = ScreenNumber.text.toString()
                ScreenNumber.text = ""
                typeCalculo = "4"
                valor = ""
            }
        }
        btnmultiplicacao.setOnClickListener{
            if(valor1.toString() == ""){
                valor1 = ScreenNumber.text.toString()
                ScreenNumber.text = ""
                typeCalculo = "3"
                valor = ""
            }
        }

        btn1.setOnClickListener{

            var result = valor + "1"
            valor = result
            ScreenNumber.text = result.toString()
        }

        btn2.setOnClickListener{
            var result = valor + "2"
            valor = result
            ScreenNumber.text = result.toString()
        }

        btn3.setOnClickListener{
            var result = valor + "3"
            valor = result
            ScreenNumber.text = result.toString()
        }
        btn4.setOnClickListener{
            var result = valor + "4"
            valor = result
            ScreenNumber.text = result.toString()
        }
        btn5.setOnClickListener{
            var result = valor + "5"
            valor = result
            ScreenNumber.text = result.toString()
        }
        btn6.setOnClickListener{
            var result = valor + "6"
            valor = result
            ScreenNumber.text = result.toString()
        }
        btn7.setOnClickListener{
            var result = valor + "7"
            valor = result
            ScreenNumber.text = result.toString()
        }
        btn8.setOnClickListener{
            var result = valor + "8"
            valor = result
            ScreenNumber.text = result.toString()
        }
        btn9.setOnClickListener{
            var result = valor + "9"
            valor = result
            ScreenNumber.text = result.toString()
        }
        btn0.setOnClickListener{
            var result = valor + "0"
            valor = result
            ScreenNumber.text = result.toString()
        }
    }
}