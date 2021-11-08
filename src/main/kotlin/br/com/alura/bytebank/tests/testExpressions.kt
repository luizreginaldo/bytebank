package br.com.alura.bytebank.tests

import java.lang.NumberFormatException

fun testExpressions() {
    val stringNumber = "1.9"

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

    if (receivedValue != null) {
        println("Received value: $receivedValue")
    }

    if (valueWithFee != null) {
        println("Value with fee: $valueWithFee")
    }
}