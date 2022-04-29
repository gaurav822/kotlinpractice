package com.pranav.newsapi.kotlin_basics.strings

 
fun main(){

    var string = "madam"
    string.reversed()
    var ispalindrome = false

    var i =0
    var j=string.length-1

    while(i<j){
        if(string[i]==string[j]){
            i++
            j--
            ispalindrome=true
        }
        else{
            break
        }

    }
    println(ispalindrome)
}