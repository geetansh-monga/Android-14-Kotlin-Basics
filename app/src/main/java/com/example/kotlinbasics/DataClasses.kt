package com.example.kotlinbasics

data class CoffeeDetails  (val sugarCount:Int, val name:String, val size:String)

fun main(){
    val details = CoffeeDetails(3,"Geetansh", "XL")
    makeCoffee(details)
}

fun makeCoffee(coffeeDetails: CoffeeDetails){
    println("A coffee with sugar count ${coffeeDetails.sugarCount} for ${coffeeDetails.name} of size - ${coffeeDetails.size}")
}