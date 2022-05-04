package com.pranav.newsapi.kotlin_basics.functions

object A {
   var a = 20
   fun printA() = println(a)
}


fun main(){
    A.printA()
    var addition = Addition()
    addition.addTwoNumbers(10,20, object : SumInterface{
        override fun findSum(sum: Int) {
            println(sum)
        }
    })
}

class Addition{
    fun addTwoNumbers(a:Int, b:Int, sumInterface: SumInterface){
        var sum = a+b
        sumInterface.findSum(sum)
    }
}

interface SumInterface{
    fun findSum(sum:Int)
}