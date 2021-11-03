fun main() {
    println("Bem vindo ao Bytebank")

    val bankAccountA = BankAccount()
    bankAccountA.holder = "Luiz Reginaldo"
    bankAccountA.number = 1000
    bankAccountA.deposit(500.0)

    val bankAccountB = BankAccount()
    bankAccountB.holder = "Luiz Reginaldo"
    bankAccountB.number = 1000
    bankAccountB.deposit(500.0)

    bankAccountA.deposit(50.0)
    println("bankAccountA ${bankAccountA.balance}")

    bankAccountA.withdraw(100.0)
    println("bankAccountA ${bankAccountA.balance}")

    println("bankAccountB ${bankAccountB.balance}")

    bankAccountA.transferTo(bankAccountB, 50.0)

    println("bankAccountA ${bankAccountA.balance}")
    println("bankAccountB ${bankAccountB.balance}")
}

class BankAccount {
    var holder = ""
    var number = 0
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