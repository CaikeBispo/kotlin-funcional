package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {} ){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
        autenticado()
    }

    fun entraReceiter(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {} ){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
        autenticado()
    }

    fun logout(){
        println("Realizando logout")
    }

}