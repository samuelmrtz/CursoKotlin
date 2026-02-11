package edu.example.lesson1
fun main (){
    val i: Int = 6
    val b1 = i.toByte()
    val b2: Byte = 1 // OK, literals are checked statically
    println(b2)
    val i4: Int = b2.toInt()
    val i5: String = b2.toString()
    println(i5)
    val i6: Double = b2.toDouble()
    println(i6)

    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010


    var fish: Int = 12
    var lakes: Double = 2.5

    val numberOfFish = 5
    val numberOfPlants = 12
    print("I have $numberOfFish fish" + " and $numberOfPlants plants")
}