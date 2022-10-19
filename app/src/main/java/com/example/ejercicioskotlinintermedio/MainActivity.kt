package com.example.ejercicioskotlinintermedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prueba.Person

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enum Classes
        enumClasses()

        // Nested and Inner Classes
        nestedAndInnerClasses()

        // Class Inheritance
        classInheritance()
    }

    // Leccion 1 KotlinIntermedio: Enum Classes

    enum class Direction(val dir : Int){
        NORTH(1), SOUTH(-1), EAST(1), WEST(-1);

        fun  description() : String {

            return when (this) {
                NORTH -> "La dirección es Norte"
                SOUTH -> "La dirección es Sur"
                EAST -> "La dirección es Este"
                WEST -> "La dirección es Oeste"
            }
        }
    }
    private fun enumClasses() {

        // Asignacion de valores
        var userDirection: Direction? = null
        println("Dirección: $userDirection")

        userDirection = Direction.NORTH
        println("Dirección: $userDirection")

        userDirection = Direction.WEST
        println("Dirección: $userDirection")

        // Propiedades por defecto
        println("Propiedad name: ${userDirection.name}")
        println("Propiedad ordinal: ${userDirection.ordinal}")

        // Funciones
        println(userDirection.description())

        // Inicialización
        println(userDirection.dir)
    }

    // Leccion 2 Kotlin Intermedio: Nested and Inner Classes

    private fun nestedAndInnerClasses() {
        // Clase anidada (nested)
        val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
        val sum:Int= myNestedClass.sum(10, 5)
        println("El resultado de la suma es $sum")

        // Clase interna (inner)
        val myInnerClass:MyNestedAndInnerClass.MyInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sumTwo:Int = myInnerClass.sumTwo(10)
        println("El resultado de sumar dos es $sumTwo")
    }

    // Leccion 3 Kotlin Intermedio: Class Inheritance

    private fun classInheritance() {

        val person = Person("Sara", 40)

        val programmer = Programmer("Brais", 33, "Kotlin")
        programmer.work()
        programmer.sayLanguage()
        programmer.goToWork()
        programmer.drive()

        val designer = Designer("Juan", 30)
        designer.work()
        designer.goToWork()
    }
}