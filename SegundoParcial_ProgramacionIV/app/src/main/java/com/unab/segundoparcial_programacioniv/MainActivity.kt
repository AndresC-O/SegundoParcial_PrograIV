package com.unab.segundoparcial_programacioniv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvw_Resultado:TextView
    private lateinit var lv_petts:ListView

    private val mascota = arrayOf("Perro", "Gato", "Perico", "Elefante", "Rinoceronte")
    private val especie = arrayOf("Canis familiaris", "Felis catus", "P. picta (Müller, 1776)", "Loxodonta africana", "Renocirontedao")
    private val color = arrayOf("Blanco", "Negro", "Verde", "Gris", "Gris")
    private val sexo = arrayOf("Macho", "Hembra", "Hembra", "Macho", "Macho")
    private val peso = arrayOf("25", "10", "3", "230", "250")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvw_Resultado = findViewById(R.id.tvw_Resultado)
        lv_petts = findViewById(R.id.lv_petts)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, mascota)
        lv_petts.adapter = adaptador

        lv_petts.setOnItemClickListener() { AdapterView, View, i, l->
            tvw_Resultado.setText("Usted escogio: ${lv_petts.getItemAtPosition(i)}, su especie es " + especie[i] + ", es de color " +color[i]+ ", su sexo es "+sexo[i]+" y tiene un peso de "+ peso[i]+" Lb.")
        }
    }
}