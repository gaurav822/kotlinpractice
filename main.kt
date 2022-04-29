package com.pranav.newsapi.kotlin_basics

import android.graphics.Color
import java.util.*
import java.util.concurrent.Flow



fun main() {
    getDataType(100)
    getDataType("100")
}

fun getDataType(obj:Any){

     when(obj){

        is Int -> println("Integer")
        else -> println("Other data type found")
    }
}



