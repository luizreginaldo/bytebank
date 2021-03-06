package br.com.alura.bytebank.tests

import br.com.alura.bytebank.models.*

fun testEmployees() {
    val manager = Manager(
        "br.com.alura.bytebank.models.Manager Name",
        "12345678900",
        2000.0,
        1234
    )

    println()
    println("Name: ${manager.name}")
    println("Document: ${manager.documentNumber}")
    println("Wage: ${manager.wage}")
    println("Wage Bonus: ${manager.wageBonus}")

    if(manager.auth(1234)) {
        println("auth success")
    } else {
        println("auth error")
    }

    val director = Director(
        "br.com.alura.bytebank.models.Director Name",
        "12345678900",
        3000.0,
        4321,
        200.0
    )

    println()
    println("Name: ${director.name}")
    println("Document: ${director.documentNumber}")
    println("Wage: ${director.wage}")
    println("Wage Bonus: ${director.wageBonus}")
    println("Profit Sharing: ${director.profitSharing}")

    if(director.auth(1234)) {
        println("auth success")
    } else {
        println("auth error")
    }

    val analyst = Analyst(
        "br.com.alura.bytebank.models.Analyst Name",
        "12345678900",
        3000.0
    )

    println()
    println("Name: ${analyst.name}")
    println("Document: ${analyst.documentNumber}")
    println("Wage: ${analyst.wage}")
    println("Wage Bonus: ${analyst.wageBonus}")

    val calculator = WageBonusCalculator()
    calculator.register(manager)
    calculator.register(director)
    calculator.register(analyst)

    println()
    println("Total: ${calculator.total}")
}