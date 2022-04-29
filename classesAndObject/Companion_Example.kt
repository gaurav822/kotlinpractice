package com.pranav.newsapi.kotlin_basics.classesAndObject


/*

So why use companion objects?
Because they provide a convenient shorthand for accessing “static” properties/functions.

*/
class Person(val firstName:String, val lastName:String){

    var fullName = "$firstName $lastName"

    companion object{
        const val MAX_AGE = 78
        fun getPerson(): Person {
            return Person("Gaurav", "Dahal")
        }
    }
}
fun main(){
    var maxAge = Person.MAX_AGE // access through classname
    println(maxAge)
    val p = Person.getPerson()
    println(p.fullName)

}
