fun testDifferentBankAccounts() {
    val checkingAccount = CheckingAccount(
        holder = "Luiz",
        number = 1000
    )

    val savingAccount = SavingAccount(
        holder = "Reginaldo",
        number = 1001
    )

    checkingAccount.deposit(1000.0)
    savingAccount.deposit(1000.0)

    println()
    println("Checking Account Balance: ${checkingAccount.balance}")
    println("Saving Account Balance: ${savingAccount.balance}")

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