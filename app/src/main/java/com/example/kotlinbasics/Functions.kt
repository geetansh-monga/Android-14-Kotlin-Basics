package com.example.kotlinbasics

fun main(){
    makeCoffee(2,"Geetansh")
    makeCoffee(3,"Denis")
    makeCoffee(1,"Robert")

}

fun makeCoffee(spoon:Int,name:String){
    if(spoon ==1){
        println("Coffee with $spoon spoon of sugar for $name")
    }else{
        println("Coffee with $spoon spoons of sugar for $name")
    }
}