package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.ui.recyclerview.adpater.ListaProdutosAdpater
import org.w3c.dom.Text

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycledview = findViewById<RecyclerView>(R.id.recyclerView)
        recycledview.adapter = ListaProdutosAdpater()






//
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = ("cesta de fruta")
//
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = ("laranja, manga e maçã")
//
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = ("99,99")


    }
}