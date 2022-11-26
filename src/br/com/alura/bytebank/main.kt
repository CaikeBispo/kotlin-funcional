package br.com.alura.bytebank

import br.com.alura.bytebank.teste.testaContasDiferentes
import java.math.BigDecimal

fun main() {
//    TestTypeFunctionReference()
//    TestTypeFunctionClass()

//    exerciseOne()

    val typeFN: () -> Unit = {
        println("Lambda")
    }

    val typeFn2: () -> BigDecimal = fun (): BigDecimal {
        return BigDecimal.ZERO
    }

    println(typeFn2())

    println(typeFN)
    println(typeFN())



}

fun hw (){
    println("Hello World")
}

fun exerciseOne() {
    val testLambda: () -> Unit = {
        println("Testing lambda expression on var type function")
    }

    println(testLambda)
    println(testLambda())

    val testAnonymoutsFunction: () -> Unit = fun() {
        println("Testing anonymous function on var type functio")
    }

    println(testAnonymoutsFunction)
    println(testAnonymoutsFunction())
}

fun TestTypeFunctionClass() {
    val typeClassTest: () -> Unit = TestClass()

    println(typeClassTest)
    println(typeClassTest())
}

fun TestTypeFunctionReference() {
    val typeFN: () -> Unit = ::helloWorld

    println(typeFN)
    println(typeFN())
}

fun helloWorld(){
    println("Hello world from type functions")
}

class TestClass : () -> Unit {
    override fun invoke() {
        println("Testing type functions with classes")
    }

}
