package com.pranav.newsapi.kotlin_basics.classesAndObject

class Vehicle(val numOfDoors: Int, val brandName:String, val engineTye:String){

    var color: String = "red"
    get() {
        println("The color is $field")
        return field
    }
    set(value) {
        field=value
        println("the value is set to $field")
    }

    constructor(numOfDoors: Int, brandName: String): this(numOfDoors, brandName, "petrol"){
        println("Inside constructor 1")
    }

    constructor(numOfDoors: Int): this(numOfDoors,"tesla"){
        println("Inside constructor 2")
    }

    init {
        println("This is initializer block 1")
    }

    init {
        println("This is initializer block 2")
    }

}
 
fun main(){

    var vehicle1 = Vehicle(2)
    vehicle1.color="yellow"
    println(vehicle1.brandName)
    println(vehicle1.engineTye)
    //var vehicle2 = Vehicle(3,"toyota")
    //println(vehicle2.engineTye)
    //println(vehicle2.color)




}