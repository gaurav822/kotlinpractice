package com.pranav.newsapi.kotlin_basics.classesAndObject
//By default nested classes do not have access to the member of outer class
// to do that we need to mention keyword as "inner"

/*
why to use nested class ?
nested classes enable you to logically group classes that are only used in one place,
increase the use of encapsulation,
and create more readable and maintainable code.

why to use inner class ?
The advantage of inner class over nested class is that,
it is able to access members of outer class even it is private.
Inner class keeps a reference to an object of outer class.

*/

class Bike{
    val brand:String = "apache"
    class Tyre{
        var brand: String = "CEAT"
        fun info() = println(brand)
    }
    class Transmission{
        val type  = "automatic"
        fun getTransmissionDetails() = println("The type of bike is $type")
    }

    inner class Engine{
        private val engineType  = "petrol"
        fun getEngineDetails() {
            println("The brand is $brand and engineType is $engineType")
        }

    }

}
 
fun main(){
    //tyre and transmission can be accessed by class Name
    val tyre  = Bike.Tyre()
    tyre.info()
    val trans = Bike.Transmission()
    trans.getTransmissionDetails()

    val bike  = Bike()
    //Engine can only be accessed with object of Bike
    val engine = bike.Engine() // or val engine = Bike().Engine()
    engine.getEngineDetails()
}