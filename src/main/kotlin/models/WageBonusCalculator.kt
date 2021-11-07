package models

import models.Employee

class WageBonusCalculator {
    var total: Double = 0.0
        private set

    fun register(employee: Employee) {
        this.total += employee.wageBonus
    }
}