package br.com.alura.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<TextView>(R.id.nome)
        nome.text = ("cesta de fruta")

        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = ("laranja, manga e maçã")

        val valor = findViewById<TextView>(R.id.valor)
        valor.text = ("99,99")


    }
}