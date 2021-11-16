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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (address != other.address) return false
        if (number != other.number) return false
        if (neighborhood != other.neighborhood) return false
        if (city != other.city) return false
        if (state != other.state) return false
        if (zipCode != other.zipCode) return false
        if (complement != other.complement) return false

        return true
    }

    override fun hashCode(): Int {
        var result = address.hashCode()
        result = 31 * result + number
        result = 31 * result + neighborhood.hashCode()
        result = 31 * result + city.hashCode()
        result = 31 * result + state.hashCode()
        result = 31 * result + zipCode.hashCode()
        result = 31 * result + complement.hashCode()
        return result
    }

    fun fullAddress() : String {
        return """
            $address - $number, $neighborhood, $city - $state
            $zipCode
            $complement
        """.trimIndent()
    }


}
