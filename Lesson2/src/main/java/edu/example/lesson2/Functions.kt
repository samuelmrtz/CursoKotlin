package edu.example.lesson2



fun main(){
    //Función que imprime un mensaje
    fun printHello() {
        println ("Hello World")
    }
    //Lamada de la función
    printHello()

    //Se puede imprimir un valor sin ser necesariamente una string
    val isUnit = println("This is an expression")
    println(isUnit)

    //Se puede imprimir una variable boolena
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    //Se pueden imprimir un mensaje en base a una condición concatenando la string
    val temperature2 = 10
    val message = "The water temperature is ${ if (temperature2 > 50) "too warm" else "OK" }."
    println(message)
}