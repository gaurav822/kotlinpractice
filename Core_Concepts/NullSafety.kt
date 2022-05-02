package com.pranav.newsapi.kotlin_basics.Core_Concepts

/*

The benefits to a Null Pointer Safety system is that you can know beforehand
if you might face a Null Pointer, and act accordingly.
You can know for sure if something might be null, and do something different.

In java you can call on object and might face null pointer exception
but in kotlin you can declare it as nullable type and do something different if null value is encountered

So, basically, no null pointer exceptions
because you can never call a method on an object variable that could be null.
*/
 
 fun main(){

     var a: String? = "Hello"
     val c: String? = null
     a=null
     a="gaurav"
     print("The length of string is: ")
     println(a?.length ?: 0) //elvis operator

     val listWithNulls : List<String?> = mutableListOf("Kotlin",null,null,"java","python",null,"C++")

     for(item in listWithNulls){
         item?.let {
             println(it)
         }
     }

     //val l = c!!.length // converts any value to not-null type
     //                    throws exception if value is null
     //println(l)
     //filtering null values from list containing null values
     val nullableList : List<Int?> = mutableListOf(1,2,3,4,null,6,null)
     var intList =  nullableList.filterNotNull()
     println(intList)

     //safe cast
     val x: String = "Hello"
     val xInt: Int? = x as? Int
     println(xInt)
     //
        var mystr:String? = "hello"
     // println(mystr.length)  cannot do this since it is a nullable type now
     // print(mystr?.length) can work
     if(mystr!=null){
         println(mystr.length)
     }


 }