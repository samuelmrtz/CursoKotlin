package edu.example.lesson2
//Valor predeterminado de función swim es fast
fun swim(speed: String = "fast") {
    println("swimming $speed")
}
//Valor predeterminado si se debe cambiar al agua
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}

fun feedTheFish2() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun main(){
    swim()
    shouldChangeWater("Monday")
    feedTheFish2()
}
