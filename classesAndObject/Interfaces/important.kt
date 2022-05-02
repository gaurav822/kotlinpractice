package com.pranav.newsapi.kotlin_basics.classesAndObject.Interfaces

/*
Interfaces in Kotlin can contain declarations of abstract methods,
as well as method implementations.
What makes them different from abstract classes is that interfaces cannot store a state.
A property declared in an interface can either be abstract or provide implementations for accessors.
*/

interface A {
    fun foo() { println("A") }
    fun bar()
    val a:String get() = "valueofa"
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    var c:String? = null
    override fun bar() {
        TODO("Not yet implemented")
    }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

fun main(){

    var d = D()
    var c = C()
    c.c = c.a
    c.foo()  //accessor implementing parent function containing implementation
    println("The value of c is ${c.c}")
    println(c.a)
    //d.foo()
}
