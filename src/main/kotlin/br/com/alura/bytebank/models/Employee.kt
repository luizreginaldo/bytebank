package br.com.alura.bytebank.models

abstract class Employee(
    val name: String,
    val documentNumber: String,
    val wage: Double
) {
    abstract val wageBonus: Double
}