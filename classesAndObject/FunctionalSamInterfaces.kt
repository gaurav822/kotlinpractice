package com.pranav.newsapi.kotlin_basics.classesAndObject

/*
An interface with only one abstract method is called a functional interface,
or a Single Abstract Method (SAM) interface.
The functional interface can have several non-abstract members but only one abstract member.

why SAM?
It was introduced to facilitate Lambda functions.
Since a lambda function can only provide the implementation for 1 method
it is mandatory for the functional interface to have ONLY one abstract method.

*/

fun interface IntPredicate {
    fun accept(i: Int): Boolean

    fun secondFun(){
        println("Hello world")
    }
}

fun main(){

    // Creating an instance of a class
    val isEven = object : IntPredicate {
        override fun accept(i: Int): Boolean {
            return i % 2 == 0
        }
    }
    println(isEven.accept(20))

    isEven.secondFun()

}