package br.com.alura.bytebank.tests

fun testAnonymousFunctions() {
    val myAnonymousFunction: (Int, Int) -> Int = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(myAnonymousFunction(4, 4))

    val anonymousWageBonusCalculator: (wage: Double) -> Double = fun(wage): Double {
        if (wage > 1000.0) {
            return wage + 50
        }

        return wage + 100.00
    }
    println(anonymousWageBonusCalculator(1500.0))
    println(anonymousWageBonusCalculator(500.0))
}

fun testLambdaFunctions() {
    val myFunctionLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }
    println(myFunctionLambda(5, 5))

    val wageBonusCalculator: (wage: Double) -> Double = lambda@{ wage ->
        if (wage > 1000.0) {
            return@lambda wage + 50
        }

        return@lambda wage + 100.00
    }
    println(wageBonusCalculator(1500.0))
    println(wageBonusCalculator(500.0))
}

fun testTypeFunctionClass() {
    val myFunctionClass: Sum = Sum()
    println(myFunctionClass(5, 10))
}

fun testTypeFunctionReference() {
    val myFunction: (Int, Int) -> Int = ::sum
    println(myFunction(15, 20))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

class Sum : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }
}