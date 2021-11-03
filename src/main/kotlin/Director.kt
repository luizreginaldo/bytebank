class Director(
    name: String,
    documentNumber: String,
    wage: Double,
    private val password: Int,
    val profitSharing: Double
) : Employee(
    name = name,
    documentNumber = documentNumber,
    wage = wage
) {
    override val wageBonus: Double
        get() {
            return wage * 0.3
        }

    fun auth(password: Int): Boolean {
        if(this.password == password) {
            return true
        }

        return false
    }
}