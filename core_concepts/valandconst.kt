package com.pranav.newsapi.kotlin_basics.core_concepts


 /*

const are compile time constants.
Meaning that their value has to be assigned during compile time, unlike vals, where it can be done at runtime.

This means, that const can never be assigned to a function
or any class constructor, but only to a String or primitive.

*/

//const val foo =  complexFunctionCall()   //Not okay

val fooVal = complexFunctionCall()  //Okay

const val bar = "Hello world"

fun main(){
    println("Hello World")
    println(fooVal)
}

fun complexFunctionCall() = 100