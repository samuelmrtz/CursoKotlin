package edu.example.ejerciciolesson1

//Función de validación
fun esMayorDeEdad(edad : Int): Boolean{
    if(edad >= 18){
        return true
    }else{
        return false
    }
}

fun main(){
    //Datos de usuario
    var Nombre : String = "Samuel Isaac"
    var edad : Int = 24
    var email : String? = null
    var suscripcion : Boolean = true

    //Evaluación con condicionales
    if(esMayorDeEdad(edad)){
        println("Acceso permitido")
    }
    else{
        println("Acceso denegado")
    }

    //Manejo de null safety
    val email_v = email ?: "Email no registrado\n"
    println(email_v)

    //Lista de usuarios
    val usuarios : MutableList<String> = mutableListOf()
    usuarios.add("Samuel")
    usuarios.add("Luis")
    usuarios.add("Fernando\n")
    //Uso del for para mostar la lista de usuarios
    println("Lista de usuarios:")
    for(usuarios in usuarios) {
        println(usuarios)
    }

    //Uso del when
    val clasificación = when (edad){
        in 0..12 -> "Niño"
        in 13..17 -> "Adolescente"
        in 18..64 -> "Adulto"
        else -> "Adulto mayor"
    }
    println(clasificación);
}

