package com.pranav.newsapi.kotlin_basics

 
fun main(){

       println(findHappyNumbers("11011"))

}

fun findHappyNumbers(mystr:String): Int{
    var happy = 0
    if(mystr.length==1) return 1
    for(i in mystr.indices){

        if(i==0){
            if(mystr[i]==mystr[i+1]) happy+=1
        }
        else if(i==mystr.length-1){
            if(mystr[i]==mystr[i-1]) happy+=1
        }
        else{
            if(mystr[i]=='0'){
                if(mystr[i-1]!='1' || mystr[i+1]!='1') happy+=1
            }
            else{
                if(mystr[i-1]!='0' || mystr[i+1]!='0') happy+=1
            }

        }

    }

    return happy

}

