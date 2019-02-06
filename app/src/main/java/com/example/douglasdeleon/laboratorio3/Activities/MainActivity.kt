package com.example.douglasdeleon.laboratorio3.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.example.douglasdeleon.laboratorio3.Application
import com.example.douglasdeleon.laboratorio3.R
import kotlinx.android.synthetic.main.activity_contact.*

class MainActivity : AppCompatActivity() {

    fun addContacto_Button (view: View) {
        val intent = Intent(this@MainActivity, CreateContactActivity::class.java )
        startActivity(intent)
    }

    val contacts = Application.myContacts

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.contactsListView)

        val adapter = ArrayAdapter(this@MainActivity, R.layout.item, Application.myContacts) //Conexión del listView y el adapter para mostrar la lista.

        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->

          Application.position = position

            val intent = Intent(this@MainActivity, ContactActivity::class.java)
            startActivity(intent)
        }
    }
}
