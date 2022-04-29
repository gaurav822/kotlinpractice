package com.pranav.newsapi.kotlin_basics.classesAndObject
/*
why to use extension function ?
The main advantage of the extension method is to add new methods in the existing class without using inheritance.
*/

fun String.formattedString():String{
    return "-----\n$this\n-------"
}

fun Int.checkIfEven() : Boolean{
    return this%2==0
}

fun String.returnFormatedNumber(inputData: String): String{
    //12345679876
    //returnFormatedNumber = 12,34,56,79,876
    return inputData
}

