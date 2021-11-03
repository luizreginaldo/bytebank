fun main() {
    println("Bem vindo ao Bytebank")

    val bankAccountA = BankAccount()
    bankAccountA.setHolder("Luiz Reginaldo")
    bankAccountA.setNumber(1000)
    bankAccountA.setBalance(500.0)

    val bankAccountB = BankAccount()
    bankAccountB.setHolder("Luiz Reginaldo")
    bankAccountB.setNumber(1000)
    bankAccountB.setBalance(500.0)

    bankAccountA.deposit(50.0)
    println("bankAccountA ${bankAccountA.getBalance()}")

    bankAccountA.withdraw(100.0)
    println("bankAccountA ${bankAccountA.getBalance()}")

    println("bankAccountB ${bankAccountB.getBalance()}")

    bankAccountA.transferTo(bankAccountB, 50.0)

    println("bankAccountA ${bankAccountA.getBalance()}")
    println("bankAccountB ${bankAccountB.getBalance()}")
}

class BankAccount {
    private var holder = ""
    private var number = 0
    private var balance = 0.0

    fun getHolder(): String {
        return holder
    }

    fun getNumber(): Int {
        return number
    }

    fun getBalance(): Double {
        return balance
    }

    fun setHolder(holder: String) {
        this.holder = holder
    }

    fun setNumber(number: Int) {
        this.number = number
    }

    fun setBalance(balance: Double) {
        this.balance = balance
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