package com.pranav.newsapi.kotlin_basics.classesAndObject
/*
So why use companion objects?
Because they provide a convenient shorthand for accessing “static” properties/functions.
we can access members/functions of a class without creating object
*/

class Person(val firstName:String, val lastName:String){
    var fullName = "$firstName $lastName"
    companion object{
        private var s = 12
        const val MAX_AGE = 78
        fun getPerson(): Person {
            return Person("Gaurav", "Dahal")
        }

        fun getS() = println(s)
        fun setS(st:Int) {
            if(st>0){
                s = st
            }

        }
    }
}

fun main(){
    var maxAge = Person.MAX_AGE // access through classname
    println(maxAge)
    val p = Person.getPerson()
    println(p.fullName)
    Person.setS(100)
    Person.getS()
}
