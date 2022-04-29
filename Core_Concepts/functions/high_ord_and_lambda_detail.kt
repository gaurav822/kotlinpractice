package com.pranav.newsapi.kotlin_basics.Core_Concepts.functions

//what is lambdas
// It is just a function with no Name

fun main(){
    var program = Program()
    program.addTwoNumbers(10,12)

    var program2 = Program()
    program2.addNumberWithInterface(20,30 , object : MyInterface {
        override fun execute(sum: Int) {
            println("The sum of two numbers is $sum")
        }
    })

   var mylambda: (Int)-> Unit = { s:Int -> println(s)}       //lambda expression [Function]

    var program3 = Program()
    program.addNumbersUsingLambda(10,12,mylambda)
}

class Program{
    fun addTwoNumbers(a:Int,b:Int){  //simple
        var sum = a+b
        println(sum)
    }

    fun addNumberWithInterface(a:Int,b:Int, action: MyInterface){ //object oriented (using interface)
        var sum = a+b
        action.execute(sum)
    }

    fun addNumbersUsingLambda(a:Int,b:Int, action:(Int)-> Unit ){ //high level function with lambda as parameter
        val sum = a+b
        action(sum)
    }
}

interface MyInterface{
    fun execute(sum:Int)
}