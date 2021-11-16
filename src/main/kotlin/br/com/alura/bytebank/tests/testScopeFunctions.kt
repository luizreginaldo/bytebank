package br.com.alura.bytebank.tests

import br.com.alura.bytebank.models.Address
import java.util.*

fun testScopeFunctions() {
    Address()
        .also { println("creating address") }
        .apply {
            address = "Rua Conceição das Alagoas"
            number = 3185
        }
        .run {
            "$address, $number".uppercase(Locale.getDefault())
        }.let(::println)

    listOf(
        Address(complement = "house"),
        Address(),
        Address(complement = "apartment")
    ).filter { address ->
        address.complement.isNotEmpty()
    }.let(::println)
}