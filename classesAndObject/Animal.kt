package com.pranav.newsapi.kotlin_basics.classesAndObject


class Animal (var name: String,var legs:Int, var color:String) {

    constructor() : this("deer",4,"dottedorange") //secondary constructor type 1

    //constructor(person: Person) : this() { // secondary constructor type 2
    //    person.pets.add(this)
    //}

    var importedFrom: String?=null
    set(value) {
        field=value
        println("calling setter and imported from $value")
    }

    get() {
        println("calling getter and imported country is $field")
        return  field
    }

    fun printInfo(){
        var importCountry = importedFrom ?: "N/A"
        println("The imported country of animal is $importCountry")
    }

    init {
        println("Calling initializer 1")
    }

    init {
        println("Calling initializer 2")
    }
}


fun main(){
    var animal = Animal()
    //println("${animal.legs} and ${animal.color}")
    //animal.importedFrom="USA" //setter will be called
    //println(animal.importedFrom) // getter will be called

    animal.legs = 2
    animal.color="green"
    animal.importedFrom="Germany"
    animal.printInfo()

}