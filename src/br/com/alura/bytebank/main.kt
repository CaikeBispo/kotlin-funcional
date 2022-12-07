package br.com.alura.bytebank
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


}

class Qualquer(){
     public var nome: String = "Qualquer nome"
}

