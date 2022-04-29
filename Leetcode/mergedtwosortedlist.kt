package com.pranav.newsapi.kotlin_basics.Leetcode

import kotlinx.coroutines.internal.LockFreeLinkedListNode


fun main(){
    var list1 = listOf(1,2,4,5,49)
    var list2 = listOf(1,3,4,10,12,14)

    var result:MutableList<Int> = mutableListOf<Int>()
    var i = 0
    var j =0

    while(i<list1.size && j<list2.size){

        when {
            list1[i]<list2[j] -> {
                result.add(list1[i])
                i++
            }
            list1[i]>list2[j] -> {
                result.add(list2[j])
                j++
            }
            else -> {
                result.add(list1[i])
                result.add(list2[j])
                i++
                j++
            }
        }
    }

    while(i<list1.size){
        result.add(list1[i])
        i++
    }

    while(j<list2.size){
        result.add(list2[j])
        j++
    }

    println(result)
}