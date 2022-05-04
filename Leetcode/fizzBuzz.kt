package com.pranav.newsapi.kotlin_basics.Leetcode

 
fun main(){
    var n = 1
    var array = mutableListOf<String>()
    for(i in 1..n){
        if(i%3==0 && i%5==0){
            array.add("FizzBuzz")
        }
        else if(i%3==0){
            array.add("Fizz")
        }
        else if(i%5==0){
            array.add("Buzz")
        }
        else{
            array.add(i.toString())
        }
    }
    println(array)
}