package com.pranav.newsapi.kotlin_basics
import java.lang.Exception


fun main(){
  var string= "0123456789"
    var string2 = ""
    var mystring = "agd#rfredf42"
    var sum = 0

   for(i in mystring){
       if(string.contains(i)){
           string2+=i
       }
       else{
           string2+="0"
       }
   }
    var i = 0

    while (i < string2.length){

            while(i<string2.length && string2[i]!='0'){
                sum += string2[i].digitToInt()
                i++
            }
        if(sum!=0) println(sum)
        sum=0

        while(i< string2.length && string2[i]=='0' ) {
                i++
        }

    }
    //println(string2)
}