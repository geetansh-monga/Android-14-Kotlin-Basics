package com.example.kotlinbasics

fun main(){
    val myBook = Book()
    println("A book named ${myBook.title} by ${myBook.author} Author, published in year ${myBook.yearPublished}")
    val myBookWithProperties = Book("Book","Geetansh",2025)
    println("A book named ${myBookWithProperties.title} by Author - ${myBookWithProperties.author}, published in year ${myBookWithProperties.yearPublished}")
}

class Book(val title:String = "Unknown",val author:String = "Anonymous",val yearPublished:Int = 2024)