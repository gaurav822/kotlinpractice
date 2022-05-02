package com.pranav.newsapi.kotlin_basics.Leetcode

 
fun main(){

    var haystack = "kahsfugrwiowewe"
    var needle = "esdsd"
    println(strStr(haystack, needle))

}

fun strStr(haystack: String, needle: String): Int {
    if(haystack.contains(needle)){
        return haystack.indexOf(needle)
    }
    return -1
}