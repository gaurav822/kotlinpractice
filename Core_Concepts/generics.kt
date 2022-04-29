package com.pranav.newsapi.kotlin_basics.Core_Concepts

/*
what is generics?
feature used to define classes or function
that can work with different data types
advantages:
Code Reuse: We can write a method/class/interface once and use it for any type we want.
2. Type Safety: Generics make errors to appear compile time than at run time
(It's always better to know problems in your code at compile time rather than making your code fail at run time).
*/

class ArrayUtil<T>(private val array:Array<T>){

    fun findElement(element:T, foundElement:(index:Int, element:T?) -> Unit){
        for(i in array.indices){
            if(array[i] ==element) {
                foundElement(i,array[i])
                return
            }
        }
        foundElement(-1,null)
        return
    }
}
fun main(){

    val arrayUtil = ArrayUtil<Int>(arrayOf(1,2,3,4,5))
    val arrayUtil2 = ArrayUtil<String>(arrayOf("abcd","hello","hi"))

    arrayUtil.findElement(3){
            index,element ->
        println("Index $index")
        println("Element $element")
    }

    arrayUtil2.findElement("hi"){
            index,element ->
        println("Index $index")
        println("Element $element")
    }

    myGenericFunction<Boolean,Int,Char>(true, 20, listOf('a','b','c','d'))
    myGenericFunction<Char,Int,Boolean>('a', 20, listOf(true,false,true))

}

fun<X,Y,Z> myGenericFunction(a:X,b:Y, c:List<Z>){

    for(i in c.indices){
        println("$a and $b")
    }
}