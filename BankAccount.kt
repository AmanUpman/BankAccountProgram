package com.example.bankaccountprogram

class BankAccount (var accountHolder: String, var balance: Double){
    private val transitionHistory = mutableListOf<String>()

    fun acctBalance():Double{
        return balance
    }

    fun deposit(amount: Double){
        balance+=amount
        transitionHistory.add("$accountHolder deposited $$amount")}

    fun withdraw(amount: Double){
        if(amount<=balance){
            balance-=amount
            transitionHistory.add("$accountHolder withdraw $$amount") }
        else{
            println("You don't have enough money to withdraw.")
        }}

    fun displayTransitionHistory(){
        println("Transition history for $accountHolder")
        for(transitions in transitionHistory){
            println(transitions)
        } }
}