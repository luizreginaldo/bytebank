class Analyst(
    name: String,
    documentNumber: String,
    wage: Double
) : Employee(
    name = name,
    documentNumber = documentNumber,
    wage = wage
) {
    override val wageBonus: Double
        get() {
            return super.wageBonus + wage * 0.1
        }
}