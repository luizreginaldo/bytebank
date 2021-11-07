package br.com.alura.bytebank.tests

import br.com.alura.bytebank.models.CheckingAccount
import br.com.alura.bytebank.models.Customer
import br.com.alura.bytebank.models.SavingAccount

fun testBankAccountFunctions() {
    val customerA = Customer("Luiz", "123456789", 123456)

    val bankAccountA = CheckingAccount(holder = customerA, number = 1001)
    bankAccountA.deposit(amount = 500.0)

    val customerB = Customer("Reginaldo", "123456789", 123456)

    val bankAccountB = SavingAccount(number = 1002, holder = customerB)
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