abstract class Employee(
    val name: String,
    val documentNumber: String,
    val wage: Double
) {
    open val wageBonus: Double get() = wage * 0.1
}