package br.com.alura.bytebank.tests

import br.com.alura.bytebank.exceptions.NonSufficientFundsException

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