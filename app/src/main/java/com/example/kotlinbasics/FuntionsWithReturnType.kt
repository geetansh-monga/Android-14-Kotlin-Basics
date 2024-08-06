package com.example.kotlinbasics

fun main(){
    println("Enter number One")
    val a = readln().toInt()
    println("Enter number Two")
    val b = readln().toInt()
    println(add(a, b))
}

fun add(a:Int,b:Int):Int{
    return a+b
}