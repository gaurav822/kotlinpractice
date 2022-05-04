package com.pranav.newsapi.kotlin_basics.classesAndObject.inheritance

import java.util.*
import kotlin.math.floor
import kotlin.math.sqrt

/*
What is inheritance?
something that can be inherited, act of inheriting property
It is a mechanism in which one class acquires
the properties of another class.
*/

/*
Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class
and there is already a class that includes some of the code that we want,
we can derive our new class from the existing class.
By doing this, we are reusing the fields and methods of the existing class.
*/

var scan = Scanner(System.`in`)
open class Shape(name: String="shape"){
    open val numOfSides = 0
    val color = "red"
    fun printShapeTypes(){
        println("The shape is solid not hollow")
    }
    open fun area(){
        println("Calling super print area from shape")
    }
}

open class Triangle(open var name: String) : Shape(name){
    open fun printDetails(){}
    override val numOfSides: Int
        get() {
            return 3
        }
}

open class Rectangle(var name: String): Shape(name){

    override val numOfSides: Int
        get() = 4
    override fun area() {
        super.area()
        println("Enter the length:")
        var a = scan.nextInt()
        println("Enter the breadth:")
        var b = scan.nextInt()
        println("The area of rectangle is ${a*b}")
    }
}

open class EquilateralTriangle(override var name: String) : Triangle(name){
    override fun area() {
        println("Enter the length of side:")
        var side  = scan.nextInt()
        var ans = (sqrt(3.0) /4) * side * side
        println("The area of $name triangle is ${floor(ans)}")
    }

    override val numOfSides: Int
        get() = 3

    override fun printDetails() {
        println("printing hello from equilateral triangle")
    }

}

fun main(){
    var rectangle = Rectangle("rectangle")
    println(rectangle.name)
    println(rectangle.numOfSides)
    rectangle.area()

    var equi = EquilateralTriangle("equilateral")
    println(equi.numOfSides)
    equi.area()
    equi.printShapeTypes()

}