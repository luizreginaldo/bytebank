package br.com.alura.bytebank.tests

import br.com.alura.bytebank.models.Customer
import br.com.alura.bytebank.models.SavingAccount

fun testRun() {
    val annualFee = 0.05
    val monthlyFee = annualFee / 12
    println("Monthly Fee: $monthlyFee")

    val savingAccount =
        SavingAccount(Customer(name = "Luiz Reginaldo", documentNumber = "123.456.789-00", password = 123456), 1000)

    savingAccount
        .run {
            deposit(1000.0)
            balance * monthlyFee
        }
        .let { monthlyIncome ->
            println("Monthly Income: $monthlyIncome")
        }

    val annualIncome = run {
        var balance = savingAccount.balance
        repeat(12) {
            balance += balance * monthlyFee
        }
        balance
    }

    println("Simulated Annual Income: $annualIncome")
}