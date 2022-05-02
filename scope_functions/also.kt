package com.pranav.newsapi.kotlin_basics.scope_functions

fun main(){

    //also
    //return: context object
    //context object : it

    //where to use it ?
    //where to want to use additional operation on a particular object
    //after we have initialized it

    //example

    val numbersList = mutableListOf(1,2,3)
    //some other code...

    //operation on the numbersList

    val duplicateNumbers =  numbersList.also {
        println("The elements are :$it")
        it.add(4)
        println("The elements after adding are $it")
        it.remove(2)
        println("The elements are removing are $it")
    }
    //returns the context object
    //duplicateNumbers and numbersList are now pointing to the same object

    //proof?
    println(numbersList)
    println(duplicateNumbers)

}
 