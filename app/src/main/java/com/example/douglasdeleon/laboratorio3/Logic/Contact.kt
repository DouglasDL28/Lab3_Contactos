package com.example.douglasdeleon.laboratorio3.Logic

class Contact (name: String, email: String, number: Int) {
    val name: String = name
    val email: String = email
    val number: Int = number

    override fun toString(): String {
        return "$name: $number"
    }
}