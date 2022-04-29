package com.pranav.newsapi.kotlin_basics.scope_functions

//let,run,with,also and apply

/*
Scope functions makes our code more clear, concise and readable

There are two main differences between scope functions

1) The way to refer context object (Either "this" or "it)
2) The return value (Either context object or lambda result)


When to use what?

with: IF you want to operate on a non-null object
let : If you want to execute lambda expression on a nullable object
and avoid NullPointerException
run: If you want to operate on a nullable object, execute lambda expression
and avoid null pointer exception
apply: If you want to initialise or configure an object
also: If you want to do some additional object configurations or operations

*/

 