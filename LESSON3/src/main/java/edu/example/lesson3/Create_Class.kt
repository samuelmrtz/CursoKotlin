package edu.example.lesson3
// Clase Aquarium con constructor primario y parámetros por defecto
class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    init {
        println("aquarium initializing")
    }

    // Propiedad con getter y setter personalizados
    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    // Constructor secundario que calcula dimensiones según el número de peces
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 por pez + espacio extra
        val tank = numberOfFish * 2000 * 1.1
        // Cálculo del alto necesario
        height = (tank / (length * width)).toInt()
    }

    // Método para imprimir las dimensiones y el volumen actual
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // Uso de la propiedad calculada volume
        println("Volume: $volume liters")
    }
}

// Función para demostrar las diferentes formas de instanciar la clase
fun buildAquarium() {
    // Uso del constructor por defecto
    val aquarium1 = Aquarium()
    aquarium1.printSize()

    // Uso de parámetros con nombre: solo ancho
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()

    // Uso de parámetros con nombre: alto y largo
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()

    // Configuración totalmente personalizada
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    // Uso del constructor secundario basado en peces
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()

    // Prueba del setter de volumen
    aquarium6.volume = 70
    aquarium6.printSize()
}

// Punto de entrada del programa
fun main() {
    buildAquarium()
}