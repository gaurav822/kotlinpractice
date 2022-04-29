package com.pranav.newsapi.kotlin_basics.pattern_printing

 
fun main(){

halfPyramid()
halfPyramidNumbers()

    halfPyramidAlphabets()
}

fun halfPyramidAlphabets() {
    for(i in 0..5){
        for (j in 0 until i){
            print("${(i+64).toChar()} ")
        }
        println()
    }
}

fun halfPyramidNumbers() {
    for(i in 0..5){
        for (j in 1..i){
            print("$j ")
        }
        println()
    }
}

fun halfPyramid(){
    for(i in 0..5){
        for (j in 0 until i){
            print("* ")
        }
        println()
    }
}