package br.com.alura.bytebank

import br.com.alura.bytebank.models.Address
import java.lang.NumberFormatException

fun main() {
    println("start main")
    val stringNumber: String = "1.9"

    val receivedValue: Double? = try {
        stringNumber.toDouble()
    } catch (e: NumberFormatException) {
        null
    }

    val valueWithFee = if (receivedValue !== null) {
        receivedValue + 0.1
    } else {
        null
    }

    if(receivedValue != null) {
        println("Received value: $receivedValue")
    }

    if(valueWithFee != null) {
        println("Value with fee: $valueWithFee")
    }

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
        address as Address
    }
    println("end function 2")
}

