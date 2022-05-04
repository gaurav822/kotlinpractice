package com.pranav.newsapi.kotlin_basics.scope_functions

fun main(){

    //with
    //return: lambda result
    //context object : this

    val person = Person()
    println(person.name)
    println(person.age)

    // what if there are 100's of properties?
    //there will be code repetition

    with(person){
        println(name)
        println(this.name)
        println(age)
        //using this is optional, internally this will be used
    }
    //we can even store value of lambda result
    var a:Int = with(person){
        age+5
    }

    println("The age after 5 years is $a")

    //additional example of also

    person.also {
        it.name = "Ram babu yadav"
        it.age = 23
        println("${it.name}")
    }

}

class Person{
    var name: String = "Gaurav Dahal"
    var age: Int =24
    var country:String = "Nepal"
}