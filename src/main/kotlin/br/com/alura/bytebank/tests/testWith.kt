package br.com.alura.bytebank.tests

import br.com.alura.bytebank.models.Address

fun testWith() {
    with(Address()) {
        address = "Rua Vergueiro"
        number = 3185
        neighborhood = "Vila Mariana"
        city = "São Paulo"
        state = "SP"
        zipCode = "12345-456"
        complement = "apartment"
        fullAddress()
    }.let { fullAddress ->
        println(fullAddress)
    }
}