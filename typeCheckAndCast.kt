package com.pranav.newsapi.kotlin_basics.Leetcode

import kotlin.math.ceil
import kotlin.math.floor

class Animal(val legs:Int)

fun main(){

    val list = listOf("Gaurav",12,111.4,22.66f, Animal(3))
    for(item in list){

        when (item) {
            is String -> {
                println("The length of $item is ${item.length}")
            }
            is Int -> {
                println("The integer is found which is $item")
            }
            is Double -> {
                println("The floor value of double is ${floor(item)} and ceil value is ${ceil(item)}")
            }
            is Float -> {

                println("Float value is discovered")
            }

            is Animal -> {
                println("Animal data type is discovered")
            }
            else -> {
                println("Other Data type")
            }
        }
    }

    //Unsafe cast operator

    val y = null
    //incorrect way
    //val x: String = y as String

    //correct way
    val x: String? = y as String
    println(x)


    //Safe(Nullable) cast operator

    val m = null
    val n: String? = m as? String
    println(n)


    //unchecked Cast

    fun readDictionary(str: String): Map<String, *> {

        return mapOf("test" to str)
    }

    // Warning: Unchecked cast: `Map<String, *>` to `Map<String, Int>`
    val intsDictionary: Map<String, Int> = readDictionary("gaurav") as Map<String, Int>
}