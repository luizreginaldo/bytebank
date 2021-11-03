class Employee(
    val name: String,
    val documentNumber: String,
    val wage: Double,
    private val type: Int //0 common, 1 manager, 2 director
) {
    fun wageBonus(): Double {
        when (type) {
            0 -> return wage * 0.1
            1 -> return wage * 0.2
            else -> return wage * 0.3
        }
    }
}