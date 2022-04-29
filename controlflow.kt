package com.pranav.newsapi.kotlin_basics.Leetcode

fun main(){

//cases(1)
    //cases(2)
    //cases("Ram")
    //cases("Gaurav")
    //cases(112)
    //println(whenAssign(1))
    //println(whenAssign(0L))

    val cakes = listOf("Carrot","Cheese","Chocolates")
    for(cake in cakes) println(cake)

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {                    // 1
        eatACake()
        cakesEaten ++
    }

    //cakesEaten = 0

    do {                                        // 2
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)



    //Ranges

    for(i in 0..3) println("print") //inclusive 0,1,2,3
    for(i in 0 until 3) println("print") //exclusive 0,1,2

    for(i in 0..10 step 2) println(2)

    for(i in 10 downTo 9) println(i)

    //Char ranges

    for(c in 'a'..'z' step 3) println(c)

    //Equality Checks

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    if(authors == writers) println("Equal")

}

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

//when
fun cases(obj:Any){

    when(obj){
        1 -> println("One")
        "Gaurav"-> println("Printing Gaurav")
        is String -> println("String input")
        else -> println("Unknown")
    }
}

//when second type
fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> 42                              // 5
    }
    return result
}