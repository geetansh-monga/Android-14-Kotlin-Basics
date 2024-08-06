package com.example.kotlinbasics


fun main(){
    val geetanshsBankAccount = BankAccount("Geetansh",0.0)
    val sarahsBankAccount = BankAccount("Sarah",0.0)

    geetanshsBankAccount.depositMoney(200.0)
    geetanshsBankAccount.withdrawMoney(300.0)
    geetanshsBankAccount.depositMoney(6000.0)
    geetanshsBankAccount.depositMoney(2000.0)
    geetanshsBankAccount.withdrawMoney(5000.50)
    geetanshsBankAccount.printTransactionHistory()
    geetanshsBankAccount.printAccountBalance()

    sarahsBankAccount.depositMoney(100.0)
    sarahsBankAccount.withdrawMoney(10.0)
    sarahsBankAccount.depositMoney(300.0)
    sarahsBankAccount.printTransactionHistory()
    sarahsBankAccount.printAccountBalance()

}

class BankAccount(private val accountHolder:String,private var balance:Double){
    private val transactionsHistory  = mutableListOf<String>()

    fun depositMoney(amount:Double){
        balance+=amount
        transactionsHistory.add("$accountHolder deposited $$amount")
    }

    fun withdrawMoney(amount: Double){
        if(balance>=amount){
            balance-=amount
            transactionsHistory.add("$accountHolder withdrew $$amount")
        }else{
            println("You don't have sufficient balance in your account.")
        }
    }

    fun printTransactionHistory(){
        for (transaction:String in transactionsHistory){
            println(transaction)
        }
    }

    fun printAccountBalance(){
        println("$accountHolder's Account balance is: $$balance")
    }
}