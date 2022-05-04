package com.pranav.newsapi.kotlin_basics.classesAndObject

fun main(){
    val pair = Pair("foo","bar")
    //another way
    val pair2:Pair<Int,String> = 1 to "bar"
    val pair3= pair2.copy(first = 33)
    println("Pair3 details ${pair3.second}")

    val triple = Triple("foo","bar",10)
    println(pair.first)
    println(pair.second)
}