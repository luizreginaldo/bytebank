package models

import models.Authenticable

class Intranet {
    fun login(admin: Authenticable, password: Int) {
        if(admin.auth(password)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }
}