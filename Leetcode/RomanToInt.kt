package com.pranav.newsapi.kotlin_basics.Leetcode


fun main(){
    println(romanToInt("MCMXCIV"))
}

fun romanToInt(s:String): Int{

    var romanToIntMap = mapOf<Char,Int>(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
                                       )
    var roman= 0
    var i = 0
    while(i<s.length){


        if (i!=s
                .length-1 && ((s[i] == 'I' && s[i + 1] == 'V') || (s[i] == 'I' && s[i + 1] == 'X'))) {
            roman = roman + romanToIntMap[s[i + 1]]!! - romanToIntMap[s[i]]!!
            i += 2
        } else if (i!=s
                .length-1 && ((s[i] == 'X' && s[i + 1] == 'L') || (s[i] == 'X' && s[i + 1] == 'C')
                    )) {
            roman = roman + romanToIntMap[s[i + 1]]!! - romanToIntMap[s[i]]!!
            i += 2
        } else if (i!=s
                .length-1 && ((s[i] == 'C' && s[i + 1] == 'D') || (s[i] == 'C' && s[i + 1] == 'M')
                    )) {

            roman = roman + romanToIntMap[s[i + 1]]!! - romanToIntMap[s[i]]!!
            i += 2
        } else {
            roman += romanToIntMap[s[i]]!!
            i++

        }

    }
    return roman
}