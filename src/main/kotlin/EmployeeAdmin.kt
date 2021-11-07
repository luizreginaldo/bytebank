abstract class EmployeeAdmin(
    val name: String,
    val documentNumber: String,
    val wage: Double,
    protected val password: Int
) {
    abstract val wageBonus: Double

    fun auth(password: Int): Boolean {
        if(this.password == password) {
            return true
        }

        return false
    }
}