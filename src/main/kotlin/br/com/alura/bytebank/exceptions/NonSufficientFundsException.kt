package br.com.alura.bytebank.exceptions

import java.lang.Exception

class NonSufficientFundsException(
    message: String = "Non-Sufficient Funds"
): Exception(
    message
)