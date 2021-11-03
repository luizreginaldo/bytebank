fun main() {
    println("Bem vindo ao Bytebank")

    val bankAccountA = BankAccount("Luiz", 1001)
    bankAccountA.deposit(500.0)

    val bankAccountB = BankAccount("Reginaldo", 1002)
    bankAccountB.deposit(700.0)

    bankAccountA.deposit(50.0)
    println("bankAccountA ${bankAccountA.balance}")

    bankAccountA.withdraw(100.0)
    println("bankAccountA ${bankAccountA.balance}")

    println("bankAccountB ${bankAccountB.balance}")

    bankAccountA.transferTo(bankAccountB, 50.0)

    println("bankAccountA ${bankAccountA.balance}")
    println("bankAccountB ${bankAccountB.balance}")
}

class BankAccount(
    var holder: String,
    var number: Int
) {
    var balance = 0.0
        private set(value) {
            field = if (value > 0) value else 0.0
        }

    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double): Boolean {
        if (balance >= amount) {
            balance -= amount

            return true
        }

        return false
    }

    fun transferTo(bankAccount: BankAccount, amount: Double): Boolean {
        if (withdraw(amount)) {
            bankAccount.deposit(amount)

            return true
        }

        return false
    }
}