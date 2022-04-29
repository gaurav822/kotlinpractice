package com.pranav.newsapi.kotlin_basics.Core_Concepts
/*

//object declaration
class and its single object is created at once
No constructors are allowed
singleton pattern
you can inherit class/interface

*/

//object declaration
object A{
    val num: Int = 10
}

object B{
    val p:Int = 20

    fun print(){
        println("Inside object B")
    }
}
object SharingWidget{

    private var fblikes = 0
    private var twitterlikes = 0
    private var instafollowers = 0

    fun incrementFb() = fblikes++

    fun increamenttwitter() = twitterlikes++

    fun displayLikes(){
        println("fb likes is $fblikes and twitter likes is $twitterlikes")
    }
}

//object expression
/*
Anonymous objects using object keyword
Replacement of Java's Anonymous Inner Class

*/

fun main(){
    var s= A
    var d= A
    println(s==d)
    println(A.num)
    println(B.p)
    B.print()

    SharingWidget.incrementFb()
    SharingWidget.incrementFb()
    SharingWidget.increamenttwitter()
    SharingWidget.displayLikes()

    //object expression example
    //only 1 instance... follows object keyword philosophy
    //example 1
     var testObj = object {
        val x: Int = 10

         fun method(){
             println("Calling from object expression")
         }
     }

    println(testObj.x)
    testObj.method()

    //example 2 of object expression using interface
    var obj = object :Cloneable{
        override fun clone() {
            println("I'm clone")
        }
    }

    var obj2 = object : Person("Gaurav Dahal") {

        override fun getNameLength() {
            super.getNameLength()
            println("Inside Anonymouse $name")
        }
    }
    obj2.getNameLength()
}


interface Cloneable{
    fun clone()
}

open class Person(var name:String){
    open fun getNameLength() = println("The length of name is ${name.length}")
}

