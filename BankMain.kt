package com.example.bankaccountprogram

fun main(){
    val amanBankAmmount = BankAccount("Aman Upman",60000.69)

    amanBankAmmount.deposit(200.01)
    amanBankAmmount.withdraw(300000000.66)
    amanBankAmmount.deposit(515.2)
    amanBankAmmount.withdraw(50000.33)
    println(amanBankAmmount.acctBalance())

    val sarahBankAmount = BankAccount("Sarah",0.0)
    sarahBankAmount.deposit(100.0)
    sarahBankAmount.withdraw(10.0)
    sarahBankAmount.deposit(300.0)
    sarahBankAmount.displayTransitionHistory()
    println(sarahBankAmount.acctBalance())

}
