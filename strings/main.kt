package com.pranav.newsapi.kotlin_basics.strings
import com.pranav.newsapi.kotlin_basics.classesAndObject.inheritance.scan
import java.util.Scanner
 
fun main(){
    var number  = 10
    var string: String
    var scanner = Scanner(System.`in`)
    string = scanner.nextLine()
    println(string)
    println(string.length)
    if(string.compareTo("hello world")==0) println("Equal")
    else {
        println(string.compareTo("hello world"))
    }

    string == "hello world"
    string[10]
    var x=number.toString()
    println(x.length)

}
