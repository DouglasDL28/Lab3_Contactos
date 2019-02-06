package com.example.douglasdeleon.laboratorio3.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.douglasdeleon.laboratorio3.Application
import com.example.douglasdeleon.laboratorio3.Logic.Contact
import com.example.douglasdeleon.laboratorio3.R
import kotlinx.android.synthetic.main.activity_create_contact.*

class CreateContactActivity : AppCompatActivity() {

    val contacts = Application.myContacts

    fun homeButton (view: View) {
        val intent = Intent(this@CreateContactActivity, MainActivity::class.java)
        startActivity(intent)
    }

    fun createContactButton (view: View) {
        val newContact = Contact (nameInput.text.toString(), mailInput.text.toString(), numberInput.text.toString().toInt())

        contacts.add(newContact)

        Toast.makeText(this@CreateContactActivity, "Se ha agregado el contacto con éxito.", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_contact)
    }
}
