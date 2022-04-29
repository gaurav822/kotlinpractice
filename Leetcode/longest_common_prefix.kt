package com.pranav.newsapi.kotlin_basics.Leetcode

import com.pranav.newsapi.kotlin_basics.classesAndObject.returnFormatedNumber


fun main(){
    var strs = arrayOf<String>("abc","abcd","12345")
    println(longestCommonPrefix(strs))
}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var prefix = strs[0]
    for (i in 1 until strs.size)
        while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length - 1)
        //println(prefix)
        if (prefix.isEmpty()) return ""
    }
    return prefix
}