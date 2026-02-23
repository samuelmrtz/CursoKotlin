package edu.example.ejercicio_lesson2

import kotlin.jvm.Throws

fun filtarInstrumentos(lista: List<Pair<String, Double>>,
                       criterio: (Pair<String, Double>) -> Boolean): List<Pair<String, Double>> {
    return lista.filter(criterio)}

fun<T> transformarInstrumentos(
    lista: List<Pair<String, Double>>,
    transformacion: (Pair<String, Double>) -> T
): List<T>{
    return lista.map(transformacion)
}

fun calcular(
    lista: List<Pair<String, Double>>,
    operacion: (List<Pair<String, Double>>) -> Double
): Double {
    return operacion(lista)
}


fun main(){
    println("Taller: Laboratorio de automatización")
    val instrumentos = listOf(
        Pair("Osciloscopio Digital", 1500.0),
        Pair("Voltímetro Digital", 120.0),
        Pair("Generador de Ondas", 980.0),
        Pair("Cable BNC", 15.0),
        Pair("Resistencia 1kOhm", 0.10),
        Pair("Protoboard", 25.0)
    )
    instrumentos.forEach { println("${it.first} - $${it.second}")}

    val costosos = instrumentos.filter { it.second > 100  }
    println("\nInstrumentos costosos (>100): ")
    costosos.forEach { println(it.first)}

    val nombres = instrumentos.map { "${it.first} cuesta ${it.second} "}
    println("\nNombres de instrumentos: ")
    nombres.forEach { println(it)}

    val total = instrumentos.filter {it.second > 100}.sumOf{it.second}
    println("\nCosto total de laboratorio mayores a 100: $total")

    val orden = instrumentos.sortedByDescending { it.second}
    println("Ordenado de mayor a menor")
    orden.forEach { println("${it.first} - ${it.second}") }

    val digital = filtarInstrumentos(instrumentos) { it.first.contains("Digital") }
    println( "Filtrar instrumentos digitales")
    digital.forEach { println(it.first)}

    val precios =  transformarInstrumentos(instrumentos){it.second}
    println("Transformar precios")
    precios.forEach { println(it) }

    val totalMedicion =  calcular(instrumentos) { lista ->
        lista.filter { it.first.contains("Osciloscopio") || it.first.contains("Voltímetro") }
            .sumOf { it.second }
    }
}