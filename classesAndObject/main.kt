package com.pranav.newsapi.kotlin_basics.classesAndObject


fun main(){

    //var user = User(firstName = "Ramesh")
    //user.fullName = "Rahul Yadav"
    //println(user.fullName)

    var human = Human("Gaurav")
    human.setA(20)
    human.getA()
    println(human.hasChild)
    println(human.weight)

}

class  Human (var name: String,var age:Int, var weight:Int, var hasChild: Boolean){

    private var a = 100
    fun setA(a:Int){
        this.a = a
    }

    fun getA(){
        println(a)
    }

    //constructor overloading
    constructor(name: String,age: Int,weight: Int) : this(name, age,weight,true){
        //this(name, age,weight,true) -> it will invoke initializer blocks immediately and will return to print below line
        println("Inside constructor 1")
    }
     constructor(name: String,age: Int): this(name,age,50){ // this will call above constructor
        println("Inside constructor 2")
    }
    constructor(name: String) : this(name,0){ //this will call above constructor
        println("Inside constructor 3")
    }

    init {
        println("initializer 1")
    }

    init {
        println("initializer 2")
    }

    //when primary constructor is invoked then immediately initializers blocks will be called

}



