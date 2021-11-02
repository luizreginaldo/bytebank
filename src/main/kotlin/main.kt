fun main() {
    println("Bem vindo ao Bytebank")

    val bankAccountLuiz = BankAccount()
    bankAccountLuiz.holder = "Luiz Reginaldo"
    bankAccountLuiz.number = 1000
    bankAccountLuiz.balance = 500.0
    deposit(bankAccountLuiz, 50.0)

    println(bankAccountLuiz.balance)
}

fun deposit(bankAccount: BankAccount, ammount: Double) {
    bankAccount.balance += ammount
}

class BankAccount {
    var holder = ""
    var number = 0
    var balance = 0.0
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