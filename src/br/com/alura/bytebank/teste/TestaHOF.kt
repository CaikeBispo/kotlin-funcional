package br.com.alura.bytebank.teste
import br.com.alura.bytebank.modelo.SistemaInterno
import br.com.alura.bytebank.modelo.Autenticavel

fun TestaHOF (){
    soma(1, 2, (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 12345, autenticado = {
        println("Realiza pagamento")
    })

    SistemaInterno().entraReceiter(autenticavel, 12345, autenticado = {
        //Com o receiver passsei a obter acesso ao contexto do SistemaInterno dentro do testaHOF
        this.logout()
    })
}

fun soma(a:Int, b:Int, resultado: (Int) -> Unit){
    println("Executando soma")
    resultado(a + b)
}
