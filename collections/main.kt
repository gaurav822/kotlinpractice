package com.pranav.newsapi.kotlin_basics.collections


/*

what is collection?

In programming, a collection is a class used to represent a set of similar data type items as a single unit.
These unit classes are used for grouping and managing related objects.
A collection has an underlying data structure that is used for efficient data manipulation and storage.

Array is a fixed length data structure whereas
we can alter data in array but cannot add extra element to existing array

ArrayList is a variable length Collection class.
we can alter as well as add data
they are always mutable

list in kotlin are be default immutable
we need to use mutableList to make it mutable

*/
fun main(){
    //array
    var idarray = arrayOf<String>("1234","234343","3434","33212") //immutable and fixed size
    idarray[0] = "12"
    idarray.forEach {
        print("$it ")
    }
    println()

    //arraylist
    var idarrayList = arrayListOf<String>("1","2","3","4")
    idarrayList[0]="5"
    idarrayList.add("12") //mutable
    println(idarrayList)

    //list in kotlin
    //random access as well as can have duplicate elements

    //mutablelist
    var users = mutableListOf<String>("ram","shyam","gaurav","1","2")
    println(users[1])
    users[2] = "dinesh"
    println(users[2])

    var newusers = users.mapNotNull {
        it.toIntOrNull()
    }
    println("The new users are:")
    println(newusers)

    var filterdlist = users.filter {
        it.length>=4
    }
    println(filterdlist)

    //set
    //cannot have duplicate elements

    //immutableset
    var set = setOf<Int>(1,2,3,4,5,6,6,5,4,3,2,1) //duplicates are omitted internally
    var avg = set.sum()
    set.average()
    println(set.size)
    set.forEach {
        print("$it ")
    }
    println()

    //mutableset
    var mutableSet = mutableSetOf<Int>(1,23,34,43,4,3,32,1)
    mutableSet.add(12)
    println(mutableSet.indexOf(1))
    mutableSet.forEach {
        print("$it ")
    }

    //map
    //set of key value pairs
    //each key must be unique

    var map = mapOf<Int,String>(1 to "one",2 to "two", 3 to "three")

    var map2 = mutableMapOf<Int,String>(1 to "one",2 to "two", 3 to "three")

}
