package edu.example.lesson1

fun main(){
    //Uso de nulidad para realizar decremento de nulidad en una variable
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
    println(fishFoodTreats)
}