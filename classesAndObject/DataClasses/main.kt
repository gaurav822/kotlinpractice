package com.pranav.newsapi.kotlin_basics.classesAndObject.DataClasses

/*
what is data class?
Data class is a simple class which is used to hold data/state and contains standard functionality

*/

data class Person(val firstName:String,val lastName:String)
 
fun main(){
    val p1 = Person("Gaurav", "Dahal")
    val p2 = Person("Gaurav","Dahal")

    println(p1.component1())
    println(p1)
    println(p1 == p2) // comparing values behind the scenes

    val(a,b) = p1 // destructuring
    var p3 = p2.copy(firstName = "Rahul")
    println(p3)
}