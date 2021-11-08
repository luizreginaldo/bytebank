package br.com.alura.bytebank.models

import br.com.alura.bytebank.exceptions.NonSufficientFundsException

abstract class BankAccount(
    var holder: Customer,
    val number: Int
) {
    var balance = 0.0
        protected set(value) {
            field = if (value > 0) value else 0.0
        }

    companion object {
        var total = 0
            private set

        private fun increment() {
            total++
        }
    }

    init {
        println("create bankAccount")
        increment()
    }

    fun deposit(amount: Double) {
        balance += amount
    }

    abstract fun withdraw(amount: Double): Boolean

    fun transferTo(bankAccount: BankAccount, amount: Double) {
        if (balance < amount) {
            throw NonSufficientFundsException()
        }

        if (withdraw(amount)) {
            bankAccount.deposit(amount)
        }
    }
}