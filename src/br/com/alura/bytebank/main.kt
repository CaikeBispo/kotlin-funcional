package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val nameWithGreet = "Caike Evangelista Bispo".let {arg ->
        println("Hello $arg")
    }

    println(nameWithGreet)

    val qualquer = Qualquer()

    qualquer.let {qualquerCoisa ->
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

    listOf<Endereco>(Endereco(logradouro = "João goular",complemento = "Apartamento 901"),
        Endereco(logradouro = "João Pekny", complemento = "Apartamento da praia"),
        Endereco(logradouro = "Gastão Vidigal", complemento = "")
    ).filter { endereco ->  endereco.complemento.isEmpty()}
    .let (::println)



}

class Qualquer(){
     public var nome: String = "Qualquer nome"
}

