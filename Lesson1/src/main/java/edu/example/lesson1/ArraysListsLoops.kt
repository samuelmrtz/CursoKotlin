package edu.example.lesson1

fun main(){

    //Uso de arrays
    val school = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        print(element + " ")
    }

    val school2 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school2))
    val mix = arrayOf("fish", 2)

    //Uso de listas
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)

    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))

    //Uso de bucle for

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }
    //Uso de bucle While
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    //Uso de bucle Do While

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
}