package com.pranav.newsapi.kotlin_basics.classesAndObject
/*
sometimes we intialize a variable but don't use it
it's a waste of memory
how to deal with this problem?
*/

//lazily initializing variable
//unless we used it in code, it won't be initialized and memory won't be allocated
//thread safe
//can be var or val
//can be nullable or non nullable
val pi by lazy {
    3.14f
}
 
fun main(){
    println("code..")
    val area = pi * 4 * 4  // once you call then it will be saved to cache memory
    val area2 = pi * 5 * 5 //next time loaded from cache memory

}