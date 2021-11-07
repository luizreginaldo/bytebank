package models

interface Authenticable {
    fun auth(password: Int): Boolean
}