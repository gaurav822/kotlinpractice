package com.pranav.newsapi.kotlin_basics.Leetcode

/*

Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/

 
fun main(){

    var nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var target =  17
    var result = twoSum(nums, target)
    println("${result[0]},${result[1]}")
}

fun twoSum(nums: IntArray,target:Int):IntArray{
    var result = intArrayOf(0,0)
    for(i in nums.indices){
        for(j in i+1 until nums.size){
            if(nums[i]+nums[j]==target){
                result[0] = i
                result[1] =j
                return result
            }
        }
    }
    return result
}