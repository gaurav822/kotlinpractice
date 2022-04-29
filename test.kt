package com.pranav.newsapi.kotlin_basics

 fun main(){

     val sentence = "123 34843 934 er !@"
     val myString= sentence.replace("[^0-9]".toRegex(), "0")
     var sum = 0
     var i = 0
     while (i < myString.length){

         while(i<myString.length && myString[i]!='0'){
             sum += myString[i].digitToInt()
             i++
         }
         if(sum!=0) println(sum)
         sum=0

         while(i< myString.length && myString[i]=='0' ) {
             i++
         }

     }
 }
 