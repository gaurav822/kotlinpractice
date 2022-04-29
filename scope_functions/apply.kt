package com.pranav.newsapi.kotlin_basics.scope_functions

fun main(){

    //apply
    //return: context object
    //context object: this

    val human = Human()
    human.name = "gaurav dahal"
    human.age = 24
    //leads to code redundancy

    //solution? use apply

    val human2 = Human().apply {
        this.name = "Saurav dahal"
        age = 19
        //again using "this" keyword is optional
    }
    //this returns the object itself

    println(human2.name)





}

class Human{
    var name:String = ""
    var age:Int = 0
}