package edu.example.lesson3
// Definición de una data class simple
data class Decoration(val rocks: String)

// Definición de una data class con múltiples propiedades
data class Decoration2(val rocks: String, val wood: String, val diver: String)

fun makeDecorations() {
    // Paso 1: Uso básico y comparación
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    // Comparación estructural usando equals (proporcionado por data class)
    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))

    // Paso 2: Desestructuración
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    // Asignación de propiedades a variables individuales
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

    // Desestructuración saltando una propiedad con guion bajo
    val (rockOnly, _, diverOnly) = d5
    println(rockOnly)
    println(diverOnly)
}

// Función principal para ejecutar las pruebas de decoración
fun main() {
    makeDecorations()
}