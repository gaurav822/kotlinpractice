package com.pranav.newsapi.kotlin_basics.scope_functions

fun main(){

    //run
    //returns: lambda result
    //context object : this

    //run is combination of let and with function

    //if you want to operate on Nullable object and avoid NullPointerException then use run

    val person: Person? = null

    person?.run{
        println(this.name)
        println(this.age)
    }
    // returns lambda result

    val person2 : Person? = Person()

    val bio = person2?.run {
        println(name)
        println(age)
        "The name of the person is $name"
    }



    //println(bio)


}

 
 