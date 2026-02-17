package edu.example.lesson2

fun main() {
    //Lista de elementos string
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    //Imprimir solo decoraciones que empiezen por la letra p
    println( decorations.filter {it[0] == 'p'})

    //Lista con solo elementos que empiezan con p
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    //Nueva lista
    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    //Selección de elementos de la lista
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

}