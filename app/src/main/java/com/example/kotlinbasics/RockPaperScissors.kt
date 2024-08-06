package com.example.kotlinbasics

fun main(){
    val randomNumber = (1..3).random()
    var computerChoice = ""
    when(randomNumber){
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissor"
    }
    println(computerChoice)
    println("Enter your choice (Rock, Paper or Scissor)")
    val playerChoice = readln()
//    var winner = "Computer"
    when{
        computerChoice == playerChoice -> println("It's a Tie!!")
        playerChoice == "Rock" && computerChoice == "Scissor" -> println("You won")
        playerChoice == "Paper" && computerChoice == "Rock" -> println("You won")
        playerChoice == "Scissor" && computerChoice == "Paper" -> println("You won")
        else -> println("Computer Won")

    }
}