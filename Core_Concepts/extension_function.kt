package com.pranav.newsapi.kotlin_basics.Core_Concepts

// KOTLIN
class Sample {
    var str : String = "null"
    fun printStr() {
        print(str)
    }
}
fun main() {
    var  a = Sample()
    a.str = "Interview"
    var  b = Sample()
    b.str = "Bit"
    var  c = a.add(b)
    c.printStr()
}
// function extension
fun Sample.add(a : Sample):Sample{
    var newSample = Sample()
    newSample.str= this.str + " " +a.str
    return newSample
}

 
 