package com.pranav.newsapi.kotlin_basics.classesAndObject
/*
typeAlias in Kotlin means a way to give an existing type a new name.
It provides an alternative naming to your existing type to reflect a more readable code.
*/

typealias stringList = List<String>
typealias AuthToken = String
typealias personList = List<Person>

fun main(){
    handledUsers(listOf("gaurav","potato","apple"))

    var login = Login("3434343")
    println(login.authToken)
}

fun handledUsers(users: stringList){
    for(i in users.indices){
        println(users[i])
    }
}

data class Login(val authToken: AuthToken)
data class Orders(val authToken: AuthToken)
