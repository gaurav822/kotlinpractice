package com.pranav.newsapi.kotlin_basics.Core_Concepts.functions

fun calcAreaOfCircle(radius:Int): Double{
    return String.format("%.2f",Math.PI* radius*radius).toDouble()
}

fun add(a:Int, b:Int): Int = a+b

fun main(){
    println(calcAreaOfCircle(10))
    //using dot notation
    Country().getCountryDetails()
    var state = State()
    state.getCountryDetails()


    //using invoke method on normal functions
    println("The addition is ${::add.invoke(5,10)}")

    //
    var idx = 0


    foo(1) { println("hello") }     // Uses the default value baz = 1
    foo(qux = { println("hello") }) // Uses both default values bar = 0 and baz = 1
    foo { println("hello") }        // Uses both default values bar = 0 and baz = 1
}

fun foo(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit,
       ) { /*...*/ }



open class Country{

    open fun getCountryDetails(name:String="default"){
        println("Hello World")
    }
}

class State : Country(){
    override fun getCountryDetails(name: String) {
        println(name)
    }
}


