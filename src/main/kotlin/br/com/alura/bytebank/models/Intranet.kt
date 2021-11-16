package br.com.alura.bytebank.models

class Intranet {
    fun login(admin: Authenticable, password: Int, authenticated: () -> Unit = {}) {
        if(admin.auth(password)) {
            println("Bem vindo ao Bytebank")
            authenticated()
        } else {
            println("Falha na autenticação")
        }
    }

    fun loginReceiver(admin: Authenticable, password: Int, authenticated: Intranet.() -> Unit = {}) {
        if(admin.auth(password)) {
            println("Bem vindo ao Bytebank")
            authenticated()
        } else {
            println("Falha na autenticação")
        }
    }

    fun payment() {
        println("run payment")
    }
}