package edu.example.lesson3
class Person(var fisrtName: String, val lastName: String){
    val FullName: String
        get(){
            return "$fisrtName $lastName"
        }
}
fun main(){
    val person = Person("Samuel","Isaac")
    println(person.FullName)
}