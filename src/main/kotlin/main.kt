fun main() {
    println("Bem vindo ao Bytebank")

    val employee = Employee(
        "Employee Name",
        "12345678900",
        1000.0
    )

    println("Name: ${employee.name}")
    println("CPF: ${employee.documentNumber}")
    println("Wage: ${employee.wage}")
    println("Wage Bonus: ${employee.wageBonus()}")

    val manager = Manager(
        "Manager Name",
        "12345678900",
        2000.0,
        1234
    )

    println()
    println("Name: ${manager.name}")
    println("CPF: ${manager.documentNumber}")
    println("Wage: ${manager.wage}")
    println("Wage Bonus: ${manager.wageBonus()}")

    if(manager.auth(1234)) {
        println("auth success")
    } else {
        println("auth error")
    }
}