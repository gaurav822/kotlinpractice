package com.pranav.newsapi.kotlin_basics.classesAndObject



class User (var firstName:String, var lastName:String, var isPlatinum:Boolean) {


    companion object{
        const val MAX_AGE = 18
    }


    constructor(firstName: String,lastName: String) : this(firstName,lastName,false){
        println("Inside 2nd constructor")
    }

    constructor(firstName: String): this(firstName,"unknown"){
        println("Inside the 3rd constructor")
    }

    //initializers blocks are invoked after primary constructor
    init {
        println("Init Block 1")
    }
    init {
        println("Init Block 2")
    }

    var fullName = "$firstName $lastName"
    get() = "FullName $field"
    set(value) {
        if(value.length<10){
            println("Name length must at least 10")
        }
        else{
            field=value
        }
    }

    var age:Int = 0
    val fullNameLength = fullName.length


    fun updateName(newName:String){
        firstName = newName
    }

    fun printName(){
        println("Hello $firstName")
    }

    fun printDetails(){
        println("Firstname is $firstName Lastname is $lastName and user platinum status is $isPlatinum")
    }
}