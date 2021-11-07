abstract class EmployeeAdmin(
    name: String,
    documentNumber: String,
    wage: Double,
    protected val password: Int
) : Employee(
    name = name,
    documentNumber = documentNumber,
    wage = wage
) {
    fun auth(password: Int): Boolean {
        if(this.password == password) {
            return true
        }

        return false
    }
}