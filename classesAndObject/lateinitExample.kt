package com.pranav.newsapi.kotlin_basics.classesAndObject

import java.lang.Exception
//lateinit is only allowed for non-nullable data type

/*
But lateinit is used when you are sure a variable won't be null
or empty and will be initialized before you use it -e.g. in onResume() method for android-
and so you don't want to declare it as a nullable type

lateinit variables must be initialized before using
if not initialized then exception will occur in the runtime UninitializedPropertyAccessException
*/
 
fun main(){
    var book = Book("python","abc")
    book.bookDescription = "python programming"
    book.printAuthorDetails()
    println(book.toString())
}

class Book(var name:String, var author:String){
    lateinit var bookDescription: String  // late initialization
    override fun toString(): String {
        return  "Book description is $bookDescription"
    }
    fun printAuthorDetails(){
        println("Author Name: $author")
    }
}