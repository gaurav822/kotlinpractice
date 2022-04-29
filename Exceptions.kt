package com.pranav.newsapi.kotlin_basics.Leetcode

import java.lang.Exception

/*
what is exception ?
It is an event that disrupts normal flow of a program
when exception occurs then it creates an object, which is called exception object
exception object contains details such as name,description of object

Exception handling is a technique which handles the runtime problems and maintain the flow of
program execution

"throw" keyword is used to throw exception explicitly

1) unchecked exception -> thrown due to mistakes in our code
examples: ArithmeticException, ArrayIndexOutOfBoundException, NullPointerException, etc...

2)checked exception -> checked at compile time
examples: IOException, SQLException, Internet Exceptions, etc
*/


fun main(){

    var a = 10
    var b = 2

    var list = listOf(1,2,3,)


    try{
        var c = a/b
        println(c)
        var d = list[4]
    }
    catch (e:ArrayIndexOutOfBoundsException){
        println("Index out of bound exception")
    }
    catch (e: Exception){
        println(e.toString())
    }
    finally {
        println("Do some important tasks")
    }

    throwException()
}

fun throwException (){
    throw Exception("Illegal argument")
}