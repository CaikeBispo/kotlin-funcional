package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    testandoWith()


}

private fun testandoWith() {
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

