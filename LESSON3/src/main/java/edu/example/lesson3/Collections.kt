package edu.example.lesson3

fun main() {
    val list = listOf(1, 5, 3, 4)
    println(list.sum())

    // Suma de longitudes de strings usando sumBy
    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumBy { it.length })

    // Uso de listIterator para recorrer e imprimir elementos
    for (s in list2.listIterator()) {
        print("$s ")
    }
    // Salto de línea para limpiar la consola
    println()

    // --- Operaciones con HashMaps ---


    // Creación de un HashMap con nombres comunes y científicos
    val scientific = hashMapOf(
        "guppy" to "poecilia reticulata",
        "catfish" to "corydoras",
        "zebra fish" to "danio rerio"
    )

    // Recuperación de valores usando get() y corchetes
    println(scientific.get("guppy"))
    println(scientific["zebra fish"])

    // Intento de recuperar una llave que no existe (devuelve null)
    println(scientific.get("swordtail"))

    // Uso de getOrDefault para manejar llaves inexistentes
    println(scientific.getOrDefault("swordtail", "sorry, I don't know"))

    // Uso de getOrElse para ejecutar lógica si la llave no existe
    println(scientific.getOrElse("swordtail") { "sorry, I don't know" })
}