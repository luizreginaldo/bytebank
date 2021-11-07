package br.com.alura.bytebank.models

interface Authenticable {
    fun auth(password: Int): Boolean
}