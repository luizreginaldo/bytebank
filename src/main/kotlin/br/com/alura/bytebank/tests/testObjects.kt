package br.com.alura.bytebank.tests

import br.com.alura.bytebank.models.BankAccount
import br.com.alura.bytebank.models.Customer
import br.com.alura.bytebank.models.SavingAccount

fun testObjects() {
    val customer = Customer(name = "Luiz", documentNumber = "123456789", password = 123456)
    val savingAccount = SavingAccount(holder = customer, number = 123)
    val checkingAccount = SavingAccount(holder = customer, number = 123)

    testDifferentBankAccounts()

    println("Bank Account Total: ${BankAccount.total}")
}