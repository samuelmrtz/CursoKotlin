package edu.example.lesson3
// Interfaz que define la acción de comer
interface FishAction {
    fun eat()
}

// Interfaz que define el color del pez
interface FishColor {
    val color: String
}

// Objeto singleton que proporciona el color dorado
object GoldColor : FishColor {
    override val color = "gold"
}

// Clase ayudante que implementa FishAction mediante un mensaje
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

// Clase Shark que utiliza delegación para el color y la acción
class Shark : FishAction by PrintingFishAction("hunt and eat fish"),
    FishColor by object : FishColor { override val color = "grey" }

// Clase Plecostomus con delegación total y valores por defecto
class Plecostomus(fishColor: FishColor = GoldColor) :
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

// Función para instanciar los peces y probar la delegación
fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    // El color se obtiene vía delegación a GoldColor o al objeto anónimo
    println("Shark: ${shark.color}")
    shark.eat()

    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

// Punto de entrada del programa
fun main() {
    makeFish()
}