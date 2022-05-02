package com.pranav.newsapi.kotlin_basics.Leetcode

import java.lang.StringBuilder
import java.util.*


fun main(){


   var scanner = Scanner(System.`in`)
    var a= scanner.nextLine()
    var b =scanner.nextLine()

    var i = a.length - 1
    var j = b.length - 1

    var sum = 0
    var carry = 0
    val ans = StringBuilder()
    while (i >= 0 || j >= 0) {
        sum = carry
        if (i >= 0) sum += a[i--] - '0'
        if (j >= 0) sum += b[j--] - '0'
        carry = if (sum > 1) 1 else 0
        ans.append(sum % 2)
    }
    if (carry != 0) ans.append(carry)

    println(ans.reverse().toString())
}