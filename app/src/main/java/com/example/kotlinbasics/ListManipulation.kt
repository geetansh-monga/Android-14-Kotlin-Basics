package com.example.kotlinbasics

fun main(){
   val shoppingListImmutable = listOf<String>("Graphic Card", "RAM", "CPU", "Motherboard")
    println(shoppingListImmutable)
    val shoppingListMutable = mutableListOf<String>("Graphic Card", "RAM", "CPU", "Motherboard", "Cooling")
    println(shoppingListMutable)
    shoppingListMutable.remove("Cooling")
    println(shoppingListMutable)
    shoppingListMutable.add("Nitrogen Cooling")
    println(shoppingListMutable)
}

