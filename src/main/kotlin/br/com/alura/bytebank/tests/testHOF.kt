package br.com.alura.bytebank.tests

import br.com.alura.bytebank.models.Authenticable
import br.com.alura.bytebank.models.Intranet

fun testHOF() {
    sum(1, 5) { value ->
        println(value)
    }

    receiverSum(1, 5, result = {
        println(this)
    })

    val authenticable = object : Authenticable {
        val password = 123456
        override fun auth(password: Int): Boolean = this.password == password
    }

    val intranet = Intranet()
    intranet.login(authenticable, 123456, authenticated = {
        println("list users")
    })

    intranet.loginReceiver(authenticable, 123456, authenticated = {
        payment()
    })
}

fun sum(a: Int, b: Int, result: (Int) -> Unit) {
    println("before sum")
    result(a + b)
    println("after sum")
}

fun receiverSum(a: Int, b: Int, result: Int.() -> Unit) {
    println("before sum")
    val total = a + b
    total.result()
    println("after sum")
}