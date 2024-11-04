package com.example.examplegraphic

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Declarar variables xml -- Funcional
    lateinit var campo1:EditText
    lateinit var campo2:EditText
    lateinit var btnsumar:Button
    lateinit var btnrestar:Button
    lateinit var btnmulti:Button
    lateinit var btndivi:Button
    lateinit var result:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Cazamiento -- XML -- Variables locales
        campo1 = findViewById(R.id.Et_campo1)
        campo2 = findViewById(R.id.Et_campo2)
        btnsumar = findViewById(R.id.btn_sumar)
        btnrestar = findViewById(R.id.btn_restar)
        btndivi = findViewById(R.id.btn_divi)
        btnmulti = findViewById(R.id.btn_multi)
        result = findViewById(R.id.Tv_result)

        //Llamada a Funcion -- Evento Onclik
        btnsumar.setOnClickListener(View.OnClickListener {
            //Definir Variables Locales
            val num1 = Integer.parseInt(campo1.text.toString())
            val num2 = Integer.parseInt(campo2.text.toString())

            //Mostrar Resultado
            result.setText("Resultado: "+ sumar(num1, num2))

        })

        btnrestar.setOnClickListener(View.OnClickListener {
            //Definir Variables Locales
            val num1 = Integer.parseInt(campo1.text.toString())
            val num2 = Integer.parseInt(campo2.text.toString())

            //Mostrar Resultado
            result.setText("Resultado: "+ rest(num1, num2))

        })

        btndivi.setOnClickListener(View.OnClickListener {
            //Definir Variables Locales
            val num1 = Integer.parseInt(campo1.text.toString())
            val num2 = Integer.parseInt(campo2.text.toString())

            //Mostrar Resultado
            result.setText("Resultado: "+ dividir(num1, num2))

        })

        btnmulti.setOnClickListener(View.OnClickListener {
            //Definir Variables Locales
            val num1 = Integer.parseInt(campo1.text.toString())
            val num2 = Integer.parseInt(campo2.text.toString())

            //Mostrar Resultado
            result.setText("Resultado: "+ multiplicar(num1, num2))

        })
    }
    //Trabajar la Logica de Mi Aplicacion
    fun sumar (num1:Int, num2:Int):Int{
        return num1 + num2
    }

    fun rest (num1:Int, num2:Int):Int{
        return num1 - num2
    }

    fun dividir (num1:Int, num2:Int):Int{
        return num1 / num2
    }

    fun multiplicar (num1:Int, num2:Int):Int{
        return num1 * num2
    }
}