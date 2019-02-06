package com.example.douglasdeleon.laboratorio3

import android.app.Application
import com.example.douglasdeleon.laboratorio3.Logic.Contact

class Application: Application () {

    companion object {
        var myContacts: ArrayList<Contact> = ArrayList()

        var position: Int = 0;
        
    }
}