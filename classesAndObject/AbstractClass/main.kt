package com.pranav.newsapi.kotlin_basics.classesAndObject.AbstractClass

//instance of abstract classes cannot be created
/*

Abstract classes cannot be instantiated and are designed to be subclassed.
They are used to provide some common functionality across a set of related classes
while also allowing default method implementations.

//sub class must override abstract functions of parent class
//abstract classes can have both abstract and non abstract members
*/

abstract class Vehicle(val color:String="white", val numOfWheels:Int){
    fun printDetails(){
        println("The color of the vehicle is $color")
    } //non abstract method
    abstract fun start()
    abstract fun brake() //abstract method
}

class Bike(color: String, numOfWheels: Int) : Vehicle(color, numOfWheels){
    override fun start() {
        println("The bike has started now...")
    }
    override fun brake() {
        println("The bike is braking...")

    }
}

class Car(color: String, numOfWheels: Int): Vehicle(color, numOfWheels){
    override fun start() {
        println("The car has started now...")
    }

    override fun brake() {
        println("The car is braking...")
    }
}


fun main(){
    var bike = Bike("red",2)
    bike.printDetails()
    bike.start()
    bike.brake()
    var car = Car("green",4)
    car.start()
    car.brake()
    car.printDetails()
}