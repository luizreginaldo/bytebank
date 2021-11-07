package br.com.alura.bytebank.models

class Address(
    var address: String = "",
    var number: Int = 0,
    var neighborhood: String = "",
    var city: String = "",
    var state: String = "",
    var zipCode: String = "",
    var complement: String = "",
) {
    override fun toString(): String {
        return """
            Address(
                address='$address', 
                number=$number, 
                neighborhood='$neighborhood', 
                city='$city', 
                state='$state', 
                zipCode='$zipCode', 
                complement='$complement'
            )""".trimIndent()
    }
}
