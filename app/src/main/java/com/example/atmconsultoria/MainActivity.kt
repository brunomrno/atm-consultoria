package com.example.atmconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ao pressionar o botão será executado esse evento abaixo
        button_cliente.setOnClickListener {
            Toast.makeText(applicationContext, "Clientes", Toast.LENGTH_SHORT).show()

            //os parametros são: contexto, classe que queremos chamar
            val intent = Intent(this, DetalheClientesActivity::class.java) //Os :: são usados pois devemos expecificar que estamos referenciando uma classe java
            startActivity(intent)
        }

        button_empresa.setOnClickListener {
            Toast.makeText(applicationContext, "Empresa", Toast.LENGTH_SHORT).show()

            //os parametros são: contexto, classe que queremos chamar
            val intent = Intent(this, DetalheEmpresaActivity::class.java) //Os :: são usados pois devemos expecificar que estamos referenciando uma classe java
            startActivity(intent)
        }

        button_servico.setOnClickListener {
            Toast.makeText(applicationContext, "Serviço", Toast.LENGTH_SHORT).show()

            //os parametros são: contexto, classe que queremos chamar
            val intent = Intent(this, DetalheServicoActivity::class.java) //Os :: são usados pois devemos expecificar que estamos referenciando uma classe java
            startActivity(intent)
        }

        button_contato.setOnClickListener {
            Toast.makeText(applicationContext, "Contato", Toast.LENGTH_SHORT).show()

            //os parametros são: contexto, classe que queremos chamar
            val intent = Intent(this, DetalheContatoActivity::class.java) //Os :: são usados pois devemos expecificar que estamos referenciando uma classe java
            startActivity(intent)
        }




    }
}
