fun main() {
    println("Bem vindo ao Bytebank")

    val holder: String = "Luiz Reginaldo"
    val accountNumber: Int = 1000
    var balance = 0.0
    balance = 100 + 2.0
    balance += 200

    println("Titular: $holder")
    println("Número da Conta: $accountNumber")
    println("Saldo: $balance")

    conditionsTest(balance)
}

fun conditionsTest(balance: Double) {
    //    if (balance > 0.0) {
    //        println("Conta é positiva")
    //    } else if (balance == 0.0) {
    //        println("Conta é neutra")
    //    } else {
    //        println("Conta é negativa")
    //    }

    when {
        balance > 0.0 -> println("Conta é positiva")
        balance == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}