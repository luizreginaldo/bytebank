package models

class Director(
    name: String,
    documentNumber: String,
    wage: Double,
    password: Int,
    val profitSharing: Double
) : EmployeeAdmin(
    name = name,
    documentNumber = documentNumber,
    wage = wage,
    password = password
) {

    override val wageBonus: Double
        get() {
            return wage * 0.1 + wage + profitSharing
        }
}