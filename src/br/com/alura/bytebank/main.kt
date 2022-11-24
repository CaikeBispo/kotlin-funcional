package br.com.alura.bytebank

fun main() {
    val typeFN: () -> Unit = ::helloWorld

    println(typeFN)
    println(typeFN())

    val typeClassTest: () -> Unit = TestClass()

    println(typeClassTest)
    println(typeClassTest())

}

fun helloWorld(){
    println("Hello world from type functions")
}

class TestClass : () -> Unit {
    override fun invoke() {
        println("Testing type functions with classes")
    }

}
