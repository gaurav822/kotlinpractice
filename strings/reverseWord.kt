package com.pranav.newsapi.kotlin_basics.strings

 
fun main(){

    var myStr = "hello world 123"
    var reverse = ""
    var i = myStr.length-1
    println(i)

    while (i>=0){

        while(i>=0 && myStr[i]==' ') i--

        var j=i

        if(i<0) break

        while(i>=0 && myStr[i]!=' ') i--

        if(reverse.isEmpty()) {
            reverse += myStr.substring(i + 1, j + 1)
        }

        else{
            reverse =  reverse +" "+ myStr.substring(i+1,j+1)
        }

    }

    println(reverse)


}