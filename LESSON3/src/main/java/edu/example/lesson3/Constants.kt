package edu.example.lesson3
// Constante de nivel superior definida en tiempo de compilación
const val ROCKS = 3

// Función simulada para demostrar asignación en tiempo de ejecución
fun complexFunctionCall(): Int {
    return 42
}

// Objeto singleton para agrupar constantes relacionadas
object Constants {
    const val CONSTANT2 = "object constant"
}

class MyClass {
    // Objeto compañero para definir constantes a nivel de clase
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

fun main() {
    // Asignación en tiempo de ejecución (no puede ser const)
    val value1 = complexFunctionCall()
    println("Runtime value: $value1")

    // Uso de la constante de nivel superior
    println("Top level constant: $ROCKS")

    // Acceso a constante desde un objeto singleton
    val foo = Constants.CONSTANT2
    println("Object constant: $foo")

    // Acceso a constante desde un objeto compañero sin instanciar la clase
    println("Companion constant: ${MyClass.CONSTANT3}")
}