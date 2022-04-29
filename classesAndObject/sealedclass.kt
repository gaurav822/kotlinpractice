package com.pranav.newsapi.kotlin_basics.classesAndObject

import kotlin.random.Random

/*
What are sealed classes?
Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance.

sealed class cannot be instantiated directly
but we can instantiate other classes that will extend/inherit sealed class
sealed class can be inherited within the same file only
advantage of sealed class ?
*/

sealed class Data{
    data class Success(val data:String) :Data()
    data class Error(val error:String) : Data()
    object Loading: Data()
}

class NetworkFailure(val failure:String) : Data(){

}

fun getData() : Data{
    return Data.Error(Random.nextInt(1000,100000).toString())
}

fun main(){
    when(val data = getData()){
        is Data.Success -> println(data)
        is Data.Error -> println(data)
        is Data.Loading -> println(data)
        is NetworkFailure -> println(data)
    }

}
