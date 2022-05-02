package com.pranav.newsapi.kotlin_basics.Leetcode

import java.util.*


fun main(){
    println(isAnagram("aacc","ccac"))
}

fun isAnagram(s:String,t:String): Boolean{
    if(s.length!=t.length) return false
    var s = s.toCharArray()
    var t = t.toCharArray()
    Arrays.sort(s)
    Arrays.sort(t)
    return s.contentEquals(t)
}