package br.com.alura.bytebank.teste



    fun TestFNLambda() {
        val minhaFnLambda = { a: Int, b: Int -> a + b }
        println(minhaFnLambda(10, 12))

        val calcBonificacaoLambda: (salario: Int) -> Double = lambd@{ salario ->
            if (salario > 1000)
                return@lambd salario + 100.0

            return@lambd salario + 200.0
        } //return to label: See -> https://kotlinlang.org/docs/returns.html#return-to-labels
    }

    fun TestFNAnonima() {
        val minhaFnAnonima = fun(a: Int, b: Int): Int {
            return a + b;
        }

        println(minhaFnAnonima(9, 1))


        val calcBonificacaoAnonima = fun(salario: Int): Double {
            if (salario > 1000) {
                salario + 100.0
            }

            return salario + 200.0

        }
    }

    fun somaTypeFNClass(a:Int, b:Int) {
        val typeClassTest: (Int, Int) -> Int = Soma()
        println(typeClassTest(a, b))
    }

    fun somaTypeFN(a:Int, b:Int) {
        val soma: (Int, Int) -> Int = ::soma

        println(soma(a, b))
    }
    fun soma(a: Int, b: Int):Int = a + b;

    class Soma : (Int, Int) -> Int {
        override fun invoke(a: Int, b: Int): Int = a + b
    }

