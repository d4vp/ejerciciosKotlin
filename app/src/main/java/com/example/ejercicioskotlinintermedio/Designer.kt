package com.example.ejercicioskotlinintermedio

import com.example.prueba.Person


class Designer(name: String, age: Int): Person(name, age) {

    override fun work() {
        println("Esta persona está diseñando")
        super.work()
    }

}