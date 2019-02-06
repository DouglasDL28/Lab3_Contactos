package com.example.douglasdeleon.laboratorio3.Activities

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.douglasdeleon.laboratorio3.Application
import com.example.douglasdeleon.laboratorio3.R
import kotlinx.android.synthetic.main.activity_contact.*
import android.widget.Toast



class ContactActivity : AppCompatActivity() {

    fun homeButton_click (view: View){
        val intent = Intent(this@ContactActivity, MainActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        contactEmail.setText( Application.myContacts[Application.position].email.toString())
        contactNumber.setText( Application.myContacts[Application.position].number.toString())
        contactName.setText( Application.myContacts[Application.position].name.toString())

        contactNumber.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + contactNumber.text))
            startActivity(intent)
        }

        contactEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "message/rfc822"
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("recipient@example.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT, "subject of email")
            intent.putExtra(Intent.EXTRA_TEXT, "body of email")
            try {
                startActivity(Intent.createChooser(intent, "Send mail..."))
            } catch (ex: android.content.ActivityNotFoundException) {
                Toast.makeText(this@ContactActivity, "There are no email clients installed.", Toast.LENGTH_SHORT).show()
            }

        }


    }
}
