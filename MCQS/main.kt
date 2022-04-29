package com.pranav.newsapi.kotlin_basics.MCQS

 
fun main(){

    val highScore = listOf(4000,200,1000,12000)

    for ((index, value) in highScore.withIndex()) {
        println("The element at $index is $value")
    }
}