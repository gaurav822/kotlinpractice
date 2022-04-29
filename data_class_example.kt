package com.pranav.newsapi.kotlin_basics

 
data class Fruit(var name: String, var color:String, var price: Double)


fun main(){
    var fruit1 = Fruit("apple","red",100.0)
    var fruit2 = Fruit(price = 100.0, color = "red", name = "apple")

    print(fruit1 == fruit2)
    var fruit3 : Fruit
    fruit1.copy(name = "banana", color = "yellow", price = 300.0)
}