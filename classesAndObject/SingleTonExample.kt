package com.pranav.newsapi.kotlin_basics.classesAndObject
//what is singleton
//only 1 instance
//restrict user from creating more than 1 instance
//even if we use companion object it still creates multiple instances


//companion object{
//   fun instance() = ClassName()
// }
//
//val x = ClassName.instance()
//val y =ClassName.instance()
// still creates multiple instances

//Best solution is to use object
//constructors are not allowed

object FavouriteMovie{
 var name = "Avengers"
    var actors = mutableListOf<String>()
}
fun main(){
    println(FavouriteMovie.name)
    var x = FavouriteMovie
    var y = FavouriteMovie
    FavouriteMovie.actors.add("Tom holland")
    FavouriteMovie.actors.clear()
    println(FavouriteMovie.actors.firstOrNull())
}