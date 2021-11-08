package br.com.alura.bytebank

import br.com.alura.bytebank.models.Address

fun main() {
    val address: Address? = null
    println(address?.address?.length)

    address?.let { address: Address ->
        println(address.address.length)
    }
}