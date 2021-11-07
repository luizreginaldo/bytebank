package br.com.alura.bytebank.models

class SavingAccount(
    holder: Customer,
    number: Int
) : BankAccount(
    holder = holder,
    number = number
) {
    override fun withdraw(amount: Double): Boolean {
        if (balance >= amount) {
            balance -= amount

            return true
        }

        return false
    }
}