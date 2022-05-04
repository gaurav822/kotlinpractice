package com.pranav.newsapi.kotlin_basics.collections

data class Person(val name:String,val age:Int, val driverLicense:Boolean=false)


fun main(){

    val friendGroup = listOf(
        Person("Rahul",24),
        Person("Dinesh",27),
        Person("Mohan",28, driverLicense = true))
        Person("Gaurav", 12)

    //any returns true if there is at least 1 element for which the predicate is valid
    friendGroup.any {
        it.driverLicense
    }

    println(friendGroup.none{
        it.age<18
    })
    //checks condition for all element
    friendGroup.all {
        it.age>10
    }


    val objects = listOf(1,2,3,4,5,6,7,8,9,10,11)
    //makes sublists each of size 3
    println(objects.chunked(3))

    println(objects.chunked(3){
        it.reversed()
    })
    println(objects.windowed(3))



}