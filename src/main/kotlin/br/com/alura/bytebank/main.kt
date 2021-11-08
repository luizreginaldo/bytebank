package br.com.alura.bytebank

import br.com.alura.bytebank.models.Address

fun main() {
    println("start main")
    function1()
    println("end main")
}

fun function1() {
    println("start function 1")
    try {
        function2()
    } catch (e: ClassCastException) {
        e.printStackTrace()
        println("ClassCastException")
    }
    println("end function 1")
}

fun function2() {
    println("start function 2")
    for (i in 1..5) {
        println(i)
        val address = Any()
        throw ArithmeticException()
        address as Address
    }
    println("end function 2")
}

