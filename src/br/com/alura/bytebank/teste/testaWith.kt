package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaWith() {
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