package br.com.alura.bytebank

fun main() {
    println("start main")
    function1()
    println("end main")
}

fun function1() {
    println("start function 1")
    function2()
    println("end function 1")
}

fun function2() {
    println("start function 2")
    for (i in 1..5) {
        println(i)
    }
    println("end function 2")
}

