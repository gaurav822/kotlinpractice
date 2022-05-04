package com.pranav.newsapi.kotlin_basics.core_concepts.functions

import kotlin.concurrent.thread

/*
we can store functions in variables
pass functions as arguments to other functions
return function from other function
very important for working with callbacks and threads
*/

//what is higher order function
/*
if a function is accepting function as argument
or returning function as return type or doing both

*/

//if the function is last among the parameter then we can keep
//lambda function outside  as shown below
//else we have keep as comma separated arguments


fun main(){
    //example 1
    //rollDice(1..6,5,){
    //        a, b -> println("$a $b")
    //}
    //example 2
    var ingredients = listOf("salt","dough","cheese","pepper","tomato")
    cookFood("pizza",ingredients,){
        numOfIngre, isNonVegItem ->  println("Total ingredients is $numOfIngre and isNonVegItem is $isNonVegItem")}

    ////example 3
    //var dice = rollDice  {
    //    println(it)
    //}
    //println(dice)
    //
    ////when callback is set to null, no need to pass
    //var dice1 = rollDice()
    //println(dice1)
    //
    //storing lambda expressions in variables

    //var mylambda: (String,Int,Char,List<String>)->Unit = { str:String , a:Int, char:Char, list:List<String> -> println(str)}

    higherOrderFunction({ str , a, char, list -> println("$a $char")},"gauravdahal")

}

fun higherOrderFunction(callback:(str:String,a:Int,char:Char,list:List<String>) -> Unit, str: String){

    var list = listOf<String>("apple","orange","banana")
    for(i in str.indices){
        callback(str,i,str[i],list)
    }
}

//example 1
fun rollDice(
    range: IntRange,
    time:Int,
    callback: (result:Int, a:Int) -> Unit){

    for(i in 0 until time){
        val result = range.random()
        callback(result,5)
    }
}
//example 2

fun cookFood(name: String, ingredients:List<String>, callback : (numOfIngre:Int, isNonVegItem:Boolean) -> Unit){
    println("Starting to cook $name")
    println("The ingredients are...")
    ingredients.forEach {
        println(it)
    }

    callback(ingredients.size,true)
}

//example 3 with thread
fun rollDice (callback:((result:Int   )->Unit)?=null): String{
    thread {
        Thread.sleep(3000)
        callback?.invoke(10)
    }
    return "Dice rolled"
}


//example 4



//we can make call back null by default such that we don't need to use lambdas





