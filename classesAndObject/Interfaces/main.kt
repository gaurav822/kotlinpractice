package com.pranav.newsapi.kotlin_basics.classesAndObject.Interfaces

import android.widget.Button
/*

what is interface?

Why do we use an Interface?
It is used to achieve total abstraction. Since java does not support multiple inheritances in the case of class,
by using an interface it can achieve multiple inheritances. It is also used to achieve loose coupling.

loose coupling ->
In computing and systems design a loosely coupled system is one
in which components are weakly associated with each other,
and so, changes in one component least affect existence or performance of another component.

Abstract classes should be used primarily for objects that are closely related,
whereas interfaces are best suited for providing a common functionality to unrelated classes.

What makes them different from abstract classes is that interfaces cannot store a state.
They can have properties, but these need to be abstract or provide accessor implementations
*/

interface Actor{
    fun act(){
        println("Actor is acting...") //body provided so non-abstract method
    }
    val country:String get() = "Nepal" // use get to set default member values to make it non-abstract
    val name:String  //abstract by default
    fun playInMovies() //abstract by default
}

interface Producer{
    fun produce(){
        println("Producer is producing movies...")
    }
}

class ActorProducer(val age:Int=34) : Actor,Producer{
    override val name: String
        get() = "null"

    override fun playInMovies() {

    }
}

fun main(){
    var actorProducer = ActorProducer()
    actorProducer.act()
    actorProducer.produce()
    actorProducer.playInMovies()
    println(actorProducer.country)
    println(actorProducer.name)
}