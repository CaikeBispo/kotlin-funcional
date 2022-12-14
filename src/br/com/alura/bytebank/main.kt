package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {

    TestaScopeFunctions()


}

fun TestaScopeFunctions() {
    val nameWithGreet = "Caike Evangelista Bispo".let { arg ->
        println("Hello $arg")
    }

    println(nameWithGreet)

    val qualquer = Qualquer()

    qualquer.let { qualquerCoisa ->
        println("Say any to $qualquerCoisa")

    }

    println(qualquer.nome)

    /*
    * Ao explorar a assinatura do let(), vimos que foi utilizada a palavra chave inline.
    * O inline é uma técnica de otimização mais avançada que não veremos durante o curso,
    * portanto, se tiver interesse em saber sobre o assunto, confira esta página da documentação.
    * */

    Endereco("Maeda", 777, "Vila Virgínia", "Suzano", "SP", "Apartamento 901").let { endereco ->
        "Rua: ${endereco.logradouro}, Bairro: ${endereco.bairro}, Cidade: ${endereco.cidade}".toUpperCase()
    }.let(::println)

    listOf<Endereco>(
        Endereco(logradouro = "João goular", complemento = "Apartamento 901"),
        Endereco(logradouro = "João Pekny", complemento = "Apartamento da praia"),
        Endereco(logradouro = "Gastão Vidigal", complemento = "")
    ).filter { endereco -> endereco.complemento.isEmpty() }
        .let(::println)

    soma(1, 2, (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 12345, autenticado = {
        println("Realiza pagamento")
    })

    val end = Endereco("Caratinga", 123, "Jd Anita").apply {
        "$logradouro $numero $bairro".toUpperCase()
    }
        .apply(::println) // a impressão não é maiuscula pois o contexto retornado é o do objeto e não do lambda result (let)

    // Para ver mais detalhes a respeito de scope functions -> https://kotlinlang.org/docs/scope-functions.html#function-selection
    // Para saber qual usar --> https://github.com/alura-cursos/kotlin-funcional/blob/resources/funcoes-de-escopo-kotlin.pdf

    end.run { println("Preparando configurações") }

    with(end) {
        println("Rua: " + this.logradouro + ".")
    }.also { println("Execução realizada com sucesso") }.apply(::println)
}

fun soma(a:Int, b:Int, resultado: (Int) -> Unit){
    println("Executando soma")
    resultado(a + b)
}


class Qualquer(){
     public var nome: String = "Qualquer nome"
}

