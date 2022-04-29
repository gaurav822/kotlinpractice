package com.pranav.newsapi.kotlin_basics.classesAndObject

fun main(){
    val pair = Pair("foo","bar")
    //another way
    val pair2 = "foo" to "bar"

    val triple = Triple("foo","bar",10)

    println(pair.first)
    println(pair.second)
}