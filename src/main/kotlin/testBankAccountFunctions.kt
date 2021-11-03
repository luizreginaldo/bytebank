fun testBankAccountFunctions() {
    val bankAccountA = BankAccount(holder = "Luiz", number = 1001)
    bankAccountA.deposit(amount = 500.0)

    val bankAccountB = BankAccount(number = 1002, holder = "Reginaldo")
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