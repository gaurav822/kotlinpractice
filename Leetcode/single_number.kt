package com.pranav.newsapi.kotlin_basics.Leetcode

fun main(){
  myfun1()
}

fun myfun1(){

    var a =100

    var person = com.pranav.newsapi.kotlin_basics.scope_functions.Person()
    with(person){
        name = "Rahul"
    }

    var person2 = com.pranav.newsapi.kotlin_basics.scope_functions.Person()
    println(person2.name)
}
