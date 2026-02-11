package edu.example.lesson1

fun main(){
    val school = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        print(element + " ")
    }
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    val school2 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school2))
    val mix = arrayOf("fish", 2)

    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)

    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
}