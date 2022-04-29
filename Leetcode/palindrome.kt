package com.pranav.newsapi.kotlin_basics.Leetcode

/*

Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.
*/

fun main(){

    println(isPalindrome(12321))

}

fun isPalindrome(x:Int):Boolean{
    var num = x
    var reversed = 0
    while(num>0){
        reversed = reversed*10+ num%10
        num/=10
    }
    return reversed==x
}
 