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
){
    fun tipoSabor(): String{
        return when(nombre.lowercase()){
            "manzana", "platano" -> "Dulce"
            "naranja" -> "Cítrico"
            "limon" -> "Ácido"
            else -> "Sabor no definido"
        }
    }
}

class Leon(edad: Int, peso: Double, habitat: Habitat, cuidador: Cuidador) :
    Animal(
        "León", edad, peso, habitat, cuidador
    ){
    override fun hacerSonido() {
        println("Rugido")
    }
    override fun mostarInfo() {
        println("Info del León: Nombre: $nombre, Hábitat: $habitat, Cuidador: $cuidador")
    }
}

class Gallina(edad: Int, peso: Double, habitat: Habitat, cuidador: Cuidador) :
        Animal(
            "Gallina", edad, peso, habitat, cuidador
        ), Comestible{
    override fun hacerSonido() {
        println("Cacareo")
    }

    override fun mostarInfo() {
        println("Info de la Gallina: Nombre: $nombre, Peso: $peso kg")
    }

    override fun formaDeComer(){
        println("Se puede comeer asada, frita y también en caldo")
    }

    override fun caloriasAportadas(){
        println("215 kcal por cada 100g")
    }
}

class Vaca(edad: Int, peso: Double, habitat: Habitat, cuidador: Cuidador) :
        Animal(
            "Vaca", edad, peso, habitat, cuidador
        ), Comestible {
    override fun hacerSonido() {
        println("Mugido")
    }

    override fun mostarInfo() {
        println("Info de la Vaca: Nombre: $nombre, Cuidador: $cuidador")
    }

    override fun formaDeComer(){
        println("Se come como corte de carne")
    }

    override fun caloriasAportadas(){
        println("250 kcal por cada 100g")
    }
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
    // Ejemplo de creación de objetos con las nuevas Data Classes
    val habitatLeon = Habitat("Sabana", 30.0, "África")
    val cuidadorLeon = Cuidador("Carlos", 10, "Felinos")
    val simba = Leon(5, 190.0, habitatLeon, cuidadorLeon)

    val infoManzana = InformacionNutricional(52.0, 10.0, 2.4, 0.3)
    val origenManzana = Origen("México", "Chihuahua", "Huerta Del Sol")
    val manzanaRoja = Manzana("Roja", 150.0, 8, origenManzana, infoManzana)

    println("--- PRUEBA ANIMAL ---")
    simba.mostarInfo()
    simba.hacerSonido()

    println("\n--- PRUEBA FRUTA ---")
    println("Fruta: ${manzanaRoja.nombre}, Sabor: ${manzanaRoja.tipoSabor()}")
    manzanaRoja.formaDeComer()
    manzanaRoja.caloriasAportadas()
}