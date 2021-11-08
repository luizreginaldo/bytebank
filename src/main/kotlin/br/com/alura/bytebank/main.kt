package br.com.alura.bytebank

import br.com.alura.bytebank.exceptions.NonSufficientFundsException
import br.com.alura.bytebank.tests.testBankAccountFunctions

fun main() {
    println("start main")
    testBankAccountFunctions()
    println("end main")
}

fun function1() {
    println("start function 1")
    try {
        function2()
    } catch (e: NonSufficientFundsException) {
        e.printStackTrace()
        println("NonSufficientFundsException")
    }
    println("end function 1")
}

fun function2() {
    println("start function 2")
    for (i in 1..5) {
        println(i)
    }
    println("end function 2")
}