class Manager(
    val name: String,
    val documentNumber: String,
    val wage: Double,
    val password: Int
) {
    fun wageBonus(): Double {
        return wage * 0.2
    }

    fun auth(password: Int): Boolean {
        if(this.password == password) {
            return true
        }

        return false
    }
}