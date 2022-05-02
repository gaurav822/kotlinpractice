package com.pranav.newsapi.kotlin_basics.Leetcode

 
fun main(){

    print(digitSum("11111222223",3))

}

fun digitSum(s: String, k: Int): String {
    var result = s
    if(s.length<=k) {
        return s
    }
        while(result.length>k){
           var list = result.chunked(k)
            var sum = 0
            result = ""
            for(i in list.indices){
            var str = list[i]
            for(i in str.indices){
                sum += Character.getNumericValue(str[i])
            }
                result += sum.toString()
                println(sum)
            sum=0
        }

    }
    return result

}