package com.pranav.newsapi.kotlin_basics

import android.graphics.Color
import java.util.*
import java.util.concurrent.Flow

var scan = Scanner(System.`in`)
fun main() {

    var myLambdaExpression:(Int,Char,Boolean,String) -> Unit = {a,b,c,d -> println("hello world $a$b$c$d")}

    var mylambdaFunction2: (Int,Int,Char) -> Unit = {a,b,c ->
        println(a)
        println(b)
        println(c)
    }
    myHigherOrderFunc(listOf("a","b")){
            a,b,c,d -> println("hello world $a$b$c$d")
    }

}

fun myHigherOrderFunc(list:List<String>,func:(Int,Char,Boolean,String)->Unit){
    func(1,'a',false,"Hello")
}




