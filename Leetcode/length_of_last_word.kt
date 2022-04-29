package com.pranav.newsapi.kotlin_basics.Leetcode

 
fun main(){

    var s = "   fly me   to   the moon  "
    var converttoArray = s.trim().split(" ")

    println(converttoArray[converttoArray.size-1].length)
}