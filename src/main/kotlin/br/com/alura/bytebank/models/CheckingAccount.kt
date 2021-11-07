package br.com.alura.bytebank.models

class CheckingAccount(
    holder: String,
    number: Int
) : BankAccount(
    holder = holder,
    number = number
) {
    override fun withdraw(amount: Double): Boolean {
        val amountWithFee = amount + .1

        if (balance >= amountWithFee) {
            balance -= amountWithFee

            return true
        }

        return false
    }
}
