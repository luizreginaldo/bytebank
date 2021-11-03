fun main() {
    println("Bem vindo ao Bytebank")

    val employee = Employee(
        "Luiz Reginaldo",
        "12345678900",
        1000.0,
        0
    )

    println("Name: ${employee.name}")
    println("CPF: ${employee.documentNumber}")
    println("Wage: ${employee.wage}")
    println("Wage Bonus: ${employee.wageBonus()}")
}