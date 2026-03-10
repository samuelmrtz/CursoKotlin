package edu.example.lesson3

fun main() {
    // Crear un Pair asociando equipo con su uso
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

    // Crear un Triple y mostrarlo como String y como Lista
    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())

    // Crear un Pair donde el primer elemento es otro Pair
    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}")
    println("${equipment2.first.second}")

    // Desestructurar un Pair en variables individuales
    val (tool, use) = equipment
    println("$tool is used for $use")

    // Desestructurar un Triple
    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")
}