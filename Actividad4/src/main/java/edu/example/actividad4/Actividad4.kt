package edu.example.actividad4

interface Comestible {

    fun formaDeComer()

    fun caloriasAportadas()

}

abstract class Animal(
    val nombre: String,
    val edad: Int,
    val peso: Double,
    val habitat: Habitat,
    val cuidador: Cuidador
){
    abstract fun hacerSonido()
    abstract fun mostarInfo()
}

abstract class Fruta(
    val nombre: String,
    val color: String,
    val peso: Double,
    val nivelDulzura: Int,
    val origen: Origen,
    val informacionNutricional: InformacionNutricional
): Comestible{
    fun tipoSabor(): String{
        return when(nombre.lowercase()){
            "manzana", "platano" -> "Dulce"
            "naranja" -> "Cítrico"
            "limon" -> "Ácido"
            else -> "Sabor no definido"
        }
    }

    fun mostrarDetalles() {
        println("Fruta: ${nombre.replaceFirstChar { it.uppercase() }}")
        println("Color: $color")
        println("Sabor: ${tipoSabor()}")
        println("Origen: ${origen.pais}")
        print("Forma de comer: "); formaDeComer()
        print("Calorías: "); caloriasAportadas()
    }
}

class Leon(edad: Int, peso: Double, habitat: Habitat, cuidador: Cuidador) :
    Animal("León", edad, peso, habitat, cuidador) {

    override fun hacerSonido() { println("Rugido") }

    override fun mostarInfo() {
        println("Animal: $nombre")
        println("Edad: $edad")
        println("Peso: $peso kg")
        println("Hábitat: ${habitat.tipo}")
        print("Sonido: "); hacerSonido()
        println("Comestible: No")
    }
}

class Gallina(edad: Int, peso: Double, habitat: Habitat, cuidador: Cuidador) :
    Animal("Gallina", edad, peso, habitat, cuidador), Comestible {

    override fun hacerSonido() { println("Cacareo") }

    override fun mostarInfo() {
        println("Animal: $nombre")
        println("Edad: $edad")
        println("Peso: $peso kg")
        println("Hábitat: ${habitat.tipo}")
        print("Sonido: "); hacerSonido()
        println("Comestible: Sí")
        print("Forma de comer: "); formaDeComer()
    }

    override fun formaDeComer() { println("Cocida, asada o en caldo") }
    override fun caloriasAportadas() { println("215") }
}

class Vaca(edad: Int, peso: Double, habitat: Habitat, cuidador: Cuidador) :
    Animal("Vaca", edad, peso, habitat, cuidador), Comestible {

    override fun hacerSonido() { println("Mugido") }

    override fun mostarInfo() {
        println("Animal: $nombre")
        println("Edad: $edad")
        println("Peso: $peso kg")
        println("Hábitat: ${habitat.tipo}")
        print("Sonido: "); hacerSonido()
        println("Comestible: Sí")
        print("Forma de comer: "); formaDeComer()
    }

    override fun formaDeComer() { println("Corte de carne") }
    override fun caloriasAportadas() { println("250") }
}
class Manzana(color: String, peso: Double, nivelDulzura: Int, origen: Origen, informacionNutricional: InformacionNutricional):
    Fruta(
        "manzana", color, peso, nivelDulzura, origen, informacionNutricional
    ), Comestible{

    override fun formaDeComer(){
        println("Cruda o en postres")
    }

    override fun caloriasAportadas(){
        println("52 kcal por cada 100g")
    }
}

class Naranja(color: String, peso: Double, nivelDulzura: Int, origen: Origen, informacionNutricional: InformacionNutricional):
    Fruta(
        "naranja", color, peso, nivelDulzura, origen, informacionNutricional
    ), Comestible{

    override fun formaDeComer(){
        println("Partida a la mitad")
    }

    override fun caloriasAportadas(){
        println("47 kcal por cada 100g")
    }
}

class Platano(color: String, peso: Double, nivelDulzura: Int, origen: Origen, informacionNutricional: InformacionNutricional):
    Fruta(
        "platano", color, peso, nivelDulzura, origen, informacionNutricional
    ), Comestible{

    override fun formaDeComer(){
        println("Se pela y se come")
    }

    override fun caloriasAportadas(){
        println("89 kcal por cada 100g")
    }
}

data class Habitat(
    val tipo: String,
    val temperaturaPromedio : Double,
    val region : String
)

data class Cuidador(
    val nombre: String,
    val aniosExperiencia : Int,
    val especialidad : String
)

data class Origen(
    val pais: String,
    val region : String,
    val prodcutor : String
)

data class InformacionNutricional(
    val calorias: Double,
    val azucar : Double,
    val fibra : Double,
    val proteinas : Double
)

fun main() {
    val leon = Leon(5, 190.0, Habitat("Sabana", 30.0, "África"), Cuidador("Calixto", 8, "Felinos"))
    val gallina = Gallina(2, 3.0, Habitat("Granja", 20.0, "Sonora"), Cuidador("Paco", 15, "Aves"))
    val vaca = Vaca(4, 650.0, Habitat("Campo", 22.0, "Pampa"), Cuidador("Beto", 20, "Ganado"))

    val manzana = Manzana("Roja", 150.0, 8, Origen("México", "Chihuahua", "Huerta Sol"), InformacionNutricional(52.0, 10.0, 2.4, 0.3))
    val naranja = Naranja("Naranja", 200.0, 6, Origen("España", "Valencia", "Cítricos Real"), InformacionNutricional(47.0, 9.0, 2.4, 0.9))
    val platano = Platano("Amarillo", 120.0, 9, Origen("Ecuador", "Guayas", "Bananera Sur"), InformacionNutricional(89.0, 12.0, 2.6, 1.1))

    println("--- LISTADO DE ANIMALES ---")
    leon.mostarInfo(); println()
    gallina.mostarInfo(); println()
    vaca.mostarInfo(); println()

    println("--- LISTADO DE FRUTAS ---")
    manzana.mostrarDetalles(); println()
    naranja.mostrarDetalles(); println()
    platano.mostrarDetalles()
}