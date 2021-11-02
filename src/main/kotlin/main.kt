fun main() {
    println("Bem vindo ao Bytebank")

    val bankAccountA = BankAccount()
    bankAccountA.holder = "Luiz Reginaldo"
    bankAccountA.number = 1000
    bankAccountA.balance = 500.0

    val bankAccountB = BankAccount()
    bankAccountB.holder = "Luiz Reginaldo"
    bankAccountB.number = 1000
    bankAccountB.balance = 500.0

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

fun forLoopTest() {
    for (i in 1..3) {

        if (i == 2) {
            continue
        }

        printAccountData(i);
    }

    for (i in 3 downTo 1) {
        printAccountData(i)
    }

    for (i in 3 until 1) {
        printAccountData(i)
    }

    for (i in 5 downTo 1 step 2) {

        if (i == 1) {
            break
        }

        printAccountData(i)
    }
}

fun printAccountData(value: Int) {
    val bankAccount = BankAccount()
    bankAccount.holder = "Customer $value"
    bankAccount.number = 1000 + value
    bankAccount.balance = 10.0 + value
    bankAccount.balance += 100 + 2.0
    bankAccount.balance += 200

    println("Titular: ${bankAccount.holder}")
    println("Número da Conta: ${bankAccount.number}")
    println("Saldo: ${bankAccount.balance}")

    conditionsTest(bankAccount.balance)

    println("----------------------------")
}

fun conditionsTest(balance: Double) {
    if (balance > 0.0) {
        println("Conta é positiva")
    } else if (balance == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    when {
        balance > 0.0 -> println("Conta é positiva")
        balance == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}