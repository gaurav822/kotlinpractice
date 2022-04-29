package com.pranav.newsapi.kotlin_basics.classesAndObject

/*
What Are Inline Classes?
Inline classes provide us with a way to wrap a type,
thus adding functionality and creating a new type by itself
*/

inline class Width(val value:Int)
inline class Height(val value:Int)

class Rectangle(val width: Width,val height: Height){

    fun print() = println("${width.hashCode()} ${height.hashCode()}")
}

fun main(){
    val width = Width(100)
    val height = Height(200)
    val rectangle = Rectangle(width,height)
    rectangle.print()
}
