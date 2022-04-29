package com.pranav.newsapi.kotlin_basics.classesAndObject.Polymorphism

/*

What is polymorphism ?
*/

fun main(){
    println(addNumbers(10,20))
    println(addNumbers(10, 11, 12))
    addNumbers("Hello World")
}
fun addNumbers(a:Int,b:Int):Int{
    return a+b
}

fun addNumbers(a:Int,b:Int,c:Int) :Int{
    return a+b+c
}

fun addNumbers(str:String){
    println("The string is $str")
}
