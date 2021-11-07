package br.com.alura.bytebank

import br.com.alura.bytebank.models.Address

fun main() {
    val address = Address(address = "Rua Cinco", zipCode = "123456")
    val newAddress = Address(address = "Rua Cinco", zipCode = "123456")

    println(address.hashCode())
    println(newAddress.hashCode())

//    println(address)
}

