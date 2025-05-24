package org.example

class BankAccount( private var balance: Double ) {
    fun deposit(amount: Double) {
        require(amount > 0)
        balance += amount
    }

    fun withdraw(amount: Double) {
        require(amount > 0)
        require(balance >= amount)
        balance -= amount
    }

    fun getBalance(): Double{
        return balance
    }
}