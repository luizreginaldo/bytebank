package br.com.alura.bytebank.models

abstract class EmployeeAdmin(
    name: String,
    documentNumber: String,
    wage: Double,
    private val password: Int
) : Employee(
    name = name,
    documentNumber = documentNumber,
    wage = wage
), Authenticable {
    override fun auth(password: Int): Boolean {
        if(this.password == password) {
            return true
        }

        return false
    }
}