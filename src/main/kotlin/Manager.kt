class Manager(
    name: String,
    documentNumber: String,
    wage: Double,
    private val password: Int
) : Employee(
    name = name,
    documentNumber = documentNumber,
    wage = wage
) {
    override val wageBonus: Double
        get() {
            return wage * 0.2
        }

    fun auth(password: Int): Boolean {
        if(this.password == password) {
            return true
        }

        return false
    }
}