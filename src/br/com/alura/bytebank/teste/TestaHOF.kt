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
}

fun soma(a:Int, b:Int, resultado: (Int) -> Unit){
    println("Executando soma")
    resultado(a + b)
}
