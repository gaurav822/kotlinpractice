package com.pranav.newsapi.kotlin_basics.classesAndObject.Polymorphism

open class Bird{

    open fun fly(){
        println("Bird is flying...")
    }
}

class Pigeon(val color:String) : Bird(){

    override fun fly() {
        super.fly()
        println("The bird with color $color is flying")
    }
}

fun main(){
    var pigeon = Pigeon("blue")
    pigeon.fly()
}