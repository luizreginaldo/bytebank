package models

import models.EmployeeAdmin

class Manager(
    name: String,
    documentNumber: String,
    wage: Double,
    password: Int
) : EmployeeAdmin(
    name = name,
    documentNumber = documentNumber,
    wage = wage,
    password = password
) {
    override val wageBonus: Double
        get() {
            return wage * 0.1 + wage
        }
}