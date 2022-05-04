package com.pranav.newsapi.kotlin_basics.EnumClasses

/*
An enum is a special "class" that represents a group of constants
(unchangeable variables, like final variables

You should use enum types any time you need to represent a fixed set of constants.

Enums are used when we know all possible values at compile-time,
such as choices on a menu, rounding modes, command-line flags, etc.
 */


enum class AccountType(val discountPercent:Int, val numberOfSubscription:Int){
    BRONZE(10,100) {
        override fun calculateAmount(): Int {
            return 203434
        }
    },
    SILVER(15,200) {
        override fun calculateAmount(): Int {
            return 250000
        }
    },
    GOLD(25,300) {
        override fun calculateAmount(): Int {
            return 100000
        }
    };

    abstract fun calculateAmount (): Int

    //static methods in enum
    companion object{
        fun getAccountType(name:String) = valueOf(name.uppercase())
    }
}

enum class Transportation(val brand:String,val noOfWheels:Int){

    CAR("maruti",4){
                    override fun getDetails(){
                       println("Maruti")
                   }
                   },
    BIKE("honda",2) {
        override fun getDetails() {
            TODO("Not yet implemented")
        }
    },
    AEROPLANE("qatarairways",10) {
        override fun getDetails() {
           TODO()
        }
    },
    BUS("N/A",6) {
        override fun getDetails() {
            TODO("Not yet implemented")
        }
    };

    abstract fun getDetails()
}

fun main(){
    //println(AccountType.GOLD.ordinal)
    //val accountTypeFromAPI = "silver"
    //val accountType  = AccountType.valueOf(accountTypeFromAPI.uppercase())
    //print(accountType)
    //var value = AccountType.valueOf("BRONZE")
    //println(AccountType.GOLD.discountPercent)
    //println(AccountType.SILVER.numberOfSubscription)
    //println(AccountType.getAccountType("golD"))

    val bus  = Transportation.valueOf("car".uppercase())
    Transportation.AEROPLANE

    Transportation.CAR.getDetails()
}