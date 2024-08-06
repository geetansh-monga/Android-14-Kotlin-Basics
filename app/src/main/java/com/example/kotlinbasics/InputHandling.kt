package com.example.kotlinbasics

fun  main(){
    println("Please enter a number: ")
    val inputString = readln()
    val inputNumber = inputString.toInt()
    val multiplier = 5
    println("result after multiplication is ${inputNumber*multiplier}")
}