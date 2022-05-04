package com.pranav.newsapi.kotlin_basics.scope_functions

import android.content.Intent

/*
Scoped functions are functions that execute a block of code within the context of an object
*/

//let,run,with,also and apply

/*
Scope functions makes our code more clear, concise and readable

There are two main differences between scope functions

1) The way to refer context object (Either "this" or "it)
2) The return value (Either context object or lambda result)

When to use what?
with: IF you want to operate on a non-null object
let : If you want to execute lambda expression on a nullable object
and avoid NullPointerException
run: If you want to operate on a nullable object, execute lambda expression
and avoid null pointer exception
apply: If you want to initialise or configure an object
also: If you want to do some additional object configurations or operations
*/

fun main(){

    //let
    var number:Int? = null

    //execute block only if number is not null
    val x = number?.let {
        val number2 = it+1
        number2
    }?: 3

    println(x)
    var i =5
    //also
    //very similar to let
    //returns the object it was called on

    fun getSquared() =(i*i).also {
        i++
    }
    //function will return (i*i)


    //apply
    //use to initialise/modify object

    val intent = Intent().apply {
        putExtra("","")
        putExtra("",0)
        action= ""
    }

    //run
    //equivalent to apply
    //but it doesn't return object instead returns last line

    val intent2 = Intent().run {
        putExtra("","")
    }

    //with
    with(Intent()){

    }



}

 