package com.pranav.newsapi.kotlin_basics

 
fun main(){
    var list = listOf("1","23","346","44544")
    println(fun1(list))
}


fun fun1(elements:List<String>): List<Pair<String,Int>>{

    return elements.groupBy {
        it
    }.map {
        Pair(it.key,it.value.count())
    }
}