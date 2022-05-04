package com.pranav.newsapi.kotlin_basics.core_concepts.functions

/*
An inline function is declared with keyword inline
The use of inline function enhances the performance of higer order function
The inline function tells the compiler to copy parameters and function to the call site
The virtual function or local function cannot be declared as inline.
applicable for global functions only

*/

fun main(){
    inLineFunction { println("calling inline function") }
    inLineFunction { println("calling inline function") }
    inLineFunction { println("calling inline function") }
}

fun inLineFunction(fn:()->Unit){
    fn()
    println("Code inside inline function")
}

//what is the purpose of using inline function ?
/*
The main advantage is hidden internally
kotlin internally creates separate class and instances for
every lambda we have created
but if we use inline it will simply copy the data without creating extra instances
*/

 