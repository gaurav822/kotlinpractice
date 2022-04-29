package com.pranav.newsapi.kotlin_basics.functions

//infix function
/*

kotlin allows some functions to be called without using the period and brackets.
These are called infix methods, and their use can result in code that looks much more like a natural language.

some examples of infix functions can be
downTo, in, and etc..
infix function takes only 1 parameter
*/

//operator overloading

/*
Operator overloading is a technique by which operators used in a programming language
are implemented in user-defined types with customized logic that is based on the types of arguments passed.

Kotlin allows you to provide custom implementations for the predefined set of operators on types.
*/


fun main(){

    var mystr1 = MyStringClass()
    mystr1.string = "Hello"
    var mystr2 = MyStringClass()
    mystr2.string = "World"

    var result  = mystr1 plus mystr2
    result.printString()

    //operator overload 1
    var strclass = MyStringClass()
    var output  = strclass + 100
    println(output)

    //operator overload 2
    var strclass2 = MyStringClass()
    strclass2 * 10

}

//infix function example
infix fun MyStringClass.plus(myStringClass: MyStringClass) : MyStringClass{
    var result = MyStringClass()
    result.string = this.string+myStringClass.string
    return result
}

//operator overloading example

operator fun MyStringClass.plus(money: Int): Int{
    return this.money + money
}

operator fun MyStringClass.times(tableOf:Int) : Unit{

    println("printing table of $tableOf")
    for(i in 1..tableOf){
        println("$tableOf*$i=${tableOf*i}")
    }
}

class MyStringClass{

    var string:String? = null
    var money = 10
    fun printString() = println(string)
}


