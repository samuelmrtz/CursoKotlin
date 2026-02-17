package edu.example.lesson2

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun main(){
    var dirtyLevel = 20
    //Uso de función lambda, sin requierir de un nombre de función
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    //Otro uso de la función lambda
    fun increaseDirty( start: Int ) = start + 1
    println(updateDirty(15, ::increaseDirty))

}