package br.com.alura.bytebank.exceptions

class AuthFailException(
    message: String = "Auth Fail"
) : Exception(message)