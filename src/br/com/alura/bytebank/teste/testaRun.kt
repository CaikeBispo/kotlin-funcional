package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaRun(){
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