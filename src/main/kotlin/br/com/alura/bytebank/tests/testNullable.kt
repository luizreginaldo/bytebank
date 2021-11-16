package br.com.alura.bytebank.tests

import br.com.alura.bytebank.models.Address

fun testNullable() {
    val address: Address? = Address(address = "Rua A")
    println(address?.address?.length)

    address?.let { address: Address ->
        println(address.address.length)

        val lengthComplementWithElvisOperator: Int = address.complement?.length ?: 0

        println(lengthComplementWithElvisOperator)
    }
}