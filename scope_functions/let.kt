package com.pranav.newsapi.kotlin_basics.scope_functions

fun main(){

    //let
    // returns : lambda result
    //context object: it

    //use to avoid NullPointerException

    val name:String? = null
    val age:Int? = null


    name?.let {
        println(it.reversed())
        println(it.capitalize())
        println(it.length)
    }
    //along with let we need to use safe call operator
    //if it is null then statements won't be executed

    val ageAfter2years = age?.let {
        it+2
    }
    println(ageAfter2years)
}