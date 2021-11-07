package models

import models.Employee

class Assistant(
    name: String,
    documentNumber: String,
    wage: Double
) : Employee(
    name = name,
    documentNumber = documentNumber,
    wage = wage
) {
    override val wageBonus: Double
        get() = wage * .05
}