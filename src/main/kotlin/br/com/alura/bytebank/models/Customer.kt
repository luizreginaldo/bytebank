package br.com.alura.bytebank.models

class Customer(
    val name: String,
    val documentNumber: String,
    var address: Address = Address(),
    private val password: Int
) : Authenticable {
    override fun auth(password: Int): Boolean {
        if(this.password == password) {
            return true
        }

        return false
    }
}