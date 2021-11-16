package br.com.alura.bytebank.models

import br.com.alura.bytebank.exceptions.AuthFailException
import br.com.alura.bytebank.exceptions.NonSufficientFundsException

abstract class BankAccount(
    var holder: Customer,
    val number: Int
) : Authenticable {
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
        increment()
    }

    fun deposit(amount: Double) {
        balance += amount
    }

    abstract fun withdraw(amount: Double): Boolean

    fun transferTo(bankAccount: BankAccount, amount: Double, password: Int) {
        if (balance < amount) {
            throw NonSufficientFundsException(
                message = "Non-Sufficient Funds, Balance: $balance, Amount: $amount"
            )
        }

        if(!auth(password)) {
            throw AuthFailException()
        }

        if (withdraw(amount)) {
            bankAccount.deposit(amount)
        }
    }

    override fun auth(password: Int): Boolean {
        return holder.auth(password)
    }
}