class Intranet {
    fun login(admin: EmployeeAdmin, password: Int) {
        if(admin.auth(password)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }
}