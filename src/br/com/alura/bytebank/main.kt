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


}

class Qualquer(){
     public var nome: String = "Qualquer nome"
}

