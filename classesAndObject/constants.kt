package com.pranav.newsapi.kotlin_basics.classesAndObject

import com.pranav.newsapi.kotlin_basics.classesAndObject.Interfaces.Constants


fun main(){
    Constants.MAX_AGE
    Constants.NAME
    Constants.MAX_WEIGHT

    Movie.country

}

class Movie(var name:String, var budget: Int){

    companion object{
        const val country = "USA"
    }

    override fun toString(): String {
        return super.toString()
    }
}