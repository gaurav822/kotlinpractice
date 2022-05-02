package com.pranav.newsapi.kotlin_basics.classesAndObject

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
