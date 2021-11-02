fun main() {
    println("Bem vindo ao Bytebank")
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
    val holder: String = "Customer $value"
    val accountNumber: Int = 1000 + value
    var balance = value + 10.0
    balance += 100 + 2.0
    balance += 200

    println("Titular: $holder")
    println("Número da Conta: $accountNumber")
    println("Saldo: $balance")

    conditionsTest(balance)

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