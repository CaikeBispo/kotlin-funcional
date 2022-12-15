package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun main() {
    testandoRun()

}

fun testandoRun(){
    val taxaAnual:Double = 0.05
    val taxaMensal:Double = taxaAnual / 12

    val poupanca = Cliente(nome = "Caike Bispo", cpf = "123.123.123-12", senha = 123456).let { cliente ->
        ContaPoupanca(cliente, 1218984)
    }

    val rendimentoMensal = poupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }

    println("O rendimento será: $rendimentoMensal")

    val simulacaoRendimentoAnual = rendimentoMensal.run {
        var saldo = poupanca.saldo

        repeat(12) {
           saldo += saldo * taxaMensal
        }
        saldo
    }

    println("Saldo após um ano: $simulacaoRendimentoAnual")

}


fun testandoWith() {
    with(
        Endereco(
            "Rua Caratinga",
            162,
            "Jardim São Caetano",
            "Carira",
            "Sergipe",
            "08585-085",
            "Casa 789"
        )
    ) {
        completo()
    }.let(::println)
}

