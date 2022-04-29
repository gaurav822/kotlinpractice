package com.pranav.newsapi.kotlin_basics.Leetcode

import android.R.string

import android.R.bool
import java.util.*


fun main(){
    println(isValid("{[][]][]}"))
}


fun isValid(s: String): Boolean {
    var bracks =  Stack<Char>();

    var key = HashMap<Char, Char>();

    //use hashmap to store open/close pairs for quick lookups
    key[')'] = '(';
    key[']'] = '[';
    key['}'] = '{';

    //iterate left to right through string
    for(i in s.indices){
        var c = s[i]

        //when you find a left bracket, push onto stack
        if(!key.containsKey(c)){
            bracks.push(c);

            //when you find a right bracket, if stack pop is pair to right bracket, continue, otherwise return false
        }else if(bracks.isEmpty() || key.get(c) != bracks.pop()){
            return false;

        }
    }

    //return true if you get through entire string and stack is empty
    if(!bracks.isEmpty())
        return false;

    return true;
}
 