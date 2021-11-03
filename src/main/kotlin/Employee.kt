open class Employee(
    val name: String,
    val documentNumber: String,
    val wage: Double
) {
    open fun wageBonus(): Double {
        return wage * 0.1
    }
}