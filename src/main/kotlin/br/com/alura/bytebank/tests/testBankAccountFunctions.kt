package br.com.alura.bytebank.tests

import br.com.alura.bytebank.exceptions.NonSufficientFundsException
import br.com.alura.bytebank.models.CheckingAccount
import br.com.alura.bytebank.models.Customer
import br.com.alura.bytebank.models.SavingAccount

fun testBankAccountFunctions() {
    val customerA = Customer(name = "Luiz", documentNumber = "123456789", password = 123456)

    val bankAccountA = CheckingAccount(holder = customerA, number = 1001)
    bankAccountA.deposit(amount = 800.0)

    val customerB = Customer(name = "Reginaldo", documentNumber = "123456789", password = 123456)

    val bankAccountB = SavingAccount(number = 1002, holder = customerB)
    bankAccountB.deposit(700.0)

    bankAccountA.deposit(50.0)
    println("bankAccountA ${bankAccountA.balance}")

    bankAccountA.withdraw(100.0)
    println("bankAccountA ${bankAccountA.balance}")

    println("bankAccountB ${bankAccountB.balance}")

    try {
        bankAccountA.transferTo(bankAccountB, 50.0)
        println("Success Transfer")
    } catch (e: NonSufficientFundsException) {
        println("Non-Sufficient Funds")
        e.printStackTrace()
    }

    println("bankAccountA ${bankAccountA.balance}")
    println("bankAccountB ${bankAccountB.balance}")
}