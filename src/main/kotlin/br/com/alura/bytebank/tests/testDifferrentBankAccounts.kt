package br.com.alura.bytebank.tests

import br.com.alura.bytebank.models.CheckingAccount
import br.com.alura.bytebank.models.Customer
import br.com.alura.bytebank.models.SavingAccount

fun testDifferentBankAccounts() {
    val customerA = Customer(
        "Luiz",
        "987654321",
        654321
    )

    val checkingAccount = CheckingAccount(
        holder = customerA,
        number = 1000
    )

    val savingAccount = SavingAccount(
        holder = Customer(
            "Reginaldo",
            "123456789",
            123456
        ),
        number = 1001
    )

    checkingAccount.deposit(1000.0)
    savingAccount.deposit(1000.0)

    println()
    println("Checking Account")
    println("Holder name: ${checkingAccount.holder.name}")
    println("Holder documentNumber: ${checkingAccount.holder.documentNumber}")
    println("Balance: ${checkingAccount.balance}")

    println()
    println("Saving Account")
    println("Holder name: ${savingAccount.holder.name}")
    println("Holder documentNumber: ${savingAccount.holder.documentNumber}")
    println("Balance: ${savingAccount.balance}")

    checkingAccount.withdraw(100.0)
    savingAccount.withdraw(100.0)

    println()
    println("Checking Account Balance: ${checkingAccount.balance}")
    println("Saving Account Balance: ${savingAccount.balance}")

    checkingAccount.transferTo(savingAccount, 100.0)

    println()
    println("Checking Account Balance: ${checkingAccount.balance}")
    println("Saving Account Balance: ${savingAccount.balance}")

    savingAccount.transferTo(checkingAccount, 100.0)

    println()
    println("Checking Account Balance: ${checkingAccount.balance}")
    println("Saving Account Balance: ${savingAccount.balance}")
}